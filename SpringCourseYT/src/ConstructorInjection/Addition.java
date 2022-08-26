package ConstructorInjection;

public class Addition {
    private int a;
    private int b;

    //whichever first will be called for number class(float or double or int)
    public Addition(double a, double b){
        this.a=(int) a;
        this.b=(int) b;
        System.out.println("Constructor double double");
    }
    public Addition(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor int int");
    }

    public  Addition(String a, String b){    //(this will be called even if its on last as we are putting in string in xml file)
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("Constructor String String");
    }

    public void doSum(){
        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);
        System.out.println("Sum is "+(a+b));
    }
}
