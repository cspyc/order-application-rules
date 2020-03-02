package com.winning.rule.engine.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    public static String sFormat = "yyyy-MM-dd HH:mm:ss";

    public static Date getDate(String sDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
        return sdf.parse(sDate);
    }

    /**
     * 
     * @param sDate
     * @param anotherFormat 日期格式串
     * @return
     * @throws Exception
     */
    public static Date getDate(String sDate, String anotherFormat)
            throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(anotherFormat);
        return sdf.parse(sDate);
    }

    /**
     * 格式化时间
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
        return sdf.format(date);
    }

    /**
     * 格式化时间
     * @param date
     * @param dateFormat
     * @return
     */
    public static String formatDate(Date date,String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(date);
    }
}