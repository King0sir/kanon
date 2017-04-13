package org.kin.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created by kinakihiro on 2017/4/11.
 */
public class DateUtils {

    public static DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    public static DateTimeFormatter formatterDate = DateTimeFormat.forPattern("yyyy-MM-dd");

    public static DateTimeFormatter formatterShortDate = DateTimeFormat.forPattern("yyyyMMdd");

    public static Date now(){
        return DateTime.now().toDate();
    }

    public static String parseNormal(DateTime time){
        return formatter.print(time);
    }

    public static String parseDate(DateTime time){
        return formatterDate.print(time);
    }

    public static String parseShortDate(DateTime time){
        return formatterShortDate.print(time);
    }

    public static void main(String[] args) {
    }
}
