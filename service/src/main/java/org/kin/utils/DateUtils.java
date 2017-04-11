package org.kin.utils;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by kinakihiro on 2017/4/11.
 */
public class DateUtils {

    public static Date now(){
        return DateTime.now().toDate();
    }
}
