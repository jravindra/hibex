package com.rj;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UTCApp {

    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String td : availableIDs) {
            System.out.println(td);
        }
        System.out.println(TimeZone.getDefault());
        Calendar birthday = Calendar.getInstance();
        birthday.set( Calendar.YEAR, 1972 );
        birthday.set( Calendar.MONTH, Calendar.MAY );
        birthday.set( Calendar.DATE, 20 );
        System.out.println(birthday);
        Date bdayDate = birthday.getTime();
        DateFormat dtf =
                DateFormat.getDateTimeInstance( DateFormat.FULL, DateFormat.FULL );
        System.out.println(dtf.format(bdayDate));
        
        
        Date date = new Date(); // point in time
        
        TimeZone CST = TimeZone.getTimeZone( "America/Chicago" );
        Calendar usa = Calendar.getInstance( CST );
        usa.setTime( date );
        System.out.println(usa);
        System.out.println( usa.get( Calendar.DAY_OF_WEEK ) );  // 1
         
        TimeZone GMT8 = TimeZone.getTimeZone( "GMT+08"); // Beijing
        Calendar china = Calendar.getInstance( GMT8 );
        china.setTime( date );
        System.out.println(china);
        System.out.println( china.get( Calendar.DAY_OF_WEEK ) ); // 2
        
        TimeZone UTC = TimeZone.getTimeZone( "UTC"); 
        Calendar UTCF = Calendar.getInstance( UTC );
        UTCF.setTime( date );
        System.out.println(UTCF);
        System.out.println( UTCF.get( Calendar.DAY_OF_WEEK ) ); // 2
    }

}
