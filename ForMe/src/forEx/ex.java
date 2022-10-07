package forEx;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ex {
    public static void main(String[] args) {
        Locale locale=new Locale("en","IN");
        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
        String date= dateFormat.format(new Date());

        System.out.println(date);
    }
}
