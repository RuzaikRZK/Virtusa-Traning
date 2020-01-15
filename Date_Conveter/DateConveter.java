
package javaapplication1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;


public class DateConveter {

    public static void main(String[] args) {
        
        System.out.println("UTC - 1  and  PST - 2");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Time Zone Code :");
        int code = s.nextInt();
        
        if(code==1){
        
              //LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss a");
        System.out.println("Local Time :"+formatter.format(ldt));
        //System.out.println(ldt);

        ZonedDateTime ldtZoned = ldt.atZone(ZoneId.systemDefault());

        ZonedDateTime utcZoned = ldtZoned.withZoneSameInstant(ZoneId.of("UTC"));

        System.out.println("UTC Time :"+formatter.format(utcZoned.toLocalDateTime()));
        
        }else if(code==2){
        
            
                    //LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss a");
        System.out.println("Local Time :"+formatter.format(ldt));
        //System.out.println(ldt);

        ZonedDateTime ldtZoned = ldt.atZone(ZoneId.systemDefault());

        ZonedDateTime utcZoned = ldtZoned.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("PST Time :"+formatter.format(utcZoned.toLocalDateTime()));
        
        }else{
        
                System.out.println("Code Not Found");
        
        }
        
 

    }

}
