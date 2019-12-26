package Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) throws ParseException /*throws ParseException*/ {

       SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");
        Date date = null;
        date =sdf.parse ("1999-09-09");
        }
    }
