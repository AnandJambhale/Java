package com.springSecurities.SpringSecurities.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {   //this class it to change or add usernames and passwords
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/public/**").permitAll()    //to permit these pages for all users //to allow all pages after /public
//                .anyRequest().authenticated().and().httpBasic();
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()  //to secure from non browser client
//                .authorizeRequests()
//                .antMatchers("/public/**").hasRole("NORMAL")   //to permit only normal people here
//                .antMatchers("/users").hasRole("ADMIN")   //to allow only admins here
//                .anyRequest().authenticated().and().httpBasic();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  //to secure from non browser client
                .authorizeRequests()
                .antMatchers("signin").permitAll()    //permitted signin page for all
                .antMatchers("/public/**").hasRole("NORMAL")   //to permit only normal people here
                .antMatchers("/users").hasRole("ADMIN")   //to allow only admins here
                .anyRequest().authenticated().and().formLogin();
//                .loginPage("/signin");   //made signin page as default page in place of login page
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("john").password("Anand").roles("NORMAL");
//
//        auth.inMemoryAuthentication().withUser("aj").password("abc").roles("ADMIN");
//    }
//
//    @Bean     //to encode a password, without this upper username and password wont work
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("john").password(this.passwordEncoder().encode("abc")).roles("NORMAL");

        auth.inMemoryAuthentication().withUser("aj").password(this.passwordEncoder().encode("abc")).roles("ADMIN");

        auth.inMemoryAuthentication().withUser("aja").password(this.passwordEncoder().encode("abc")).roles("ADMIN","NORMAL");   //to allow for both public and user pages
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }

}
