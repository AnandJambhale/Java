package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/get")
    public String sayHello(){
        return "Hello World "+ LocalDateTime.now();
    }
}
