package exercise;

public class BadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Have a good day";
    }
}
