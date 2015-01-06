package com.shine.carlover.utils;

import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {
	
	private static Logger logger = Logger.getLogger(DateUtil.class);

    public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT      = new SimpleDateFormat("yyyy-MM-dd");

    public static Date parseDate(String dateStr, SimpleDateFormat format) {
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException ex) {
        	ex.printStackTrace();
            logger.error("日期转换异常");
        }
        return date;
    }

    /**
     * 将字符串转成日期
     * @param dateStr yyyy-mm-dd
     * @return
     */
    public static Date parseDate(String dateStr) {
        Date date = null;
        try {
            date = DATE_FORMAT.parse(dateStr);
        } catch (ParseException ex) {
        	ex.printStackTrace();
            logger.error("日期转换异常");
        }
        return date;
    }

    /**
     * 
     * @param dateStr
     * @param pattern 默认格式yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Date parseDate(String dateStr, String pattern) {
        Date date = null;
        try {
            if (pattern == null || "".equals(pattern)) {
                pattern = "yyyy-MM-dd HH:mm:ss";
            }
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            date = format.parse(dateStr);
        } catch (ParseException ex) {
        	ex.printStackTrace();
            logger.error("日期转换异常");
        }
        return date;
    }

    /**
     * 日期转成字符
     * @param aDate				Date格式日期
     * @param datePatternValue	格式(DateFormatCST列举)
     * @return
     */
    public static final String parseString(Date aDate) {
        String returnValue = "";
        if (aDate != null) {
            returnValue = DATE_TIME_FORMAT.format(aDate);
        }
        return returnValue;
    }

    /**
     * 日期转成字符
     * @param aDate				Date格式日期
     * @param pattern	时间格式
     * @return
     */
    public static final String parseString(Date dt, String pattern) {
        String returnValue = "";
        if (dt != null) {
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            returnValue = format.format(dt);
        }
        return returnValue;
    }

    /**
     * 日期转成字符
     * @param aDate				Date格式日期
     * @param datePatternValue	格式(DateFormatCST列举)
     * @return
     */
    public static final String parseString(Date aDate, SimpleDateFormat format) {
        String returnValue = "";
        if (aDate != null) {
            returnValue = format.format(aDate);
        }
        return returnValue;
    }

    /**
     * 取到当前时间字符
     * @param format	字符串格
     * @return
     */
    public static final String getCurrDate(SimpleDateFormat format) {
        Date date = new Date();
        return parseString(date, format);
    }

    /** * 返回毫秒 * * @param date * 日期 * @return 返回毫秒 */
    public static long getMillis(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.getTimeInMillis();
    }

    /**
     * * 日期相加 * *
     * @param date * 日期 *
     * @param day * 天数 *
     * @return 返回相加后的日期
     */
    public static Date addDate(Date date, int day) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(getMillis(date) + ((long) day) * 24 * 3600 * 1000);
        return c.getTime();
    }

    /**
    * * 日期相减 * * 
    * @param date * 日期 * 
    * @param date1 * 日期 * 
    * @return 返回相减后的日期
    */
    public static int diffDate(Date date, Date date1) {
        return (int) ((getMillis(date) - getMillis(date1)) / (24 * 3600 * 1000));
    }

    public static int diffDateToHour(Date date, Date date1) {
        return (int) ((getMillis(date) - getMillis(date1)) / (1000 * 60 * 60));
    }
    
    public static Date addDateDay(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, day);
        return cal.getTime();
    }

    public static Date getBeforeWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.WEEK_OF_MONTH, -1);
        //cal.add(Calendar.DAY_OF_MONTH, +1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }
    
    public static Date getLastestWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.WEEK_OF_MONTH, -1);
        cal.add(Calendar.DAY_OF_MONTH, +1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getTomorrow(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, +1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }
    
    public static Date getYesterday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, -1);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }

    public static Date getFirstdayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getFirstdayOfBeforeThreeMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -2);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getFirstdayOfBeforeSixMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -5);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getFirstdayOfYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getBeforeMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getBeforeThreeMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -3);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getBeforeSixMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -6);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    public static Date getBeforeYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }
    
    public static Date getLastYearToday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MONTH,  -11);
        cal.set(Calendar.DAY_OF_MONTH,  1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }
    
    public static String getDayWeek(Date date) {
    	final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五","星期六" };
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;
    	if(dayOfWeek<0)dayOfWeek=0;
    	return dayNames[dayOfWeek];
    }

    public static void main(String[] args) {
        //        String expried_time = "9999-12-31 00:00:00";
        //        Date expiredDt = DateUtil.parseDate(expried_time);
        //        Timestamp time = new Timestamp(expiredDt.getTime());
        //        System.out.println(time);
    	System.out.println(getDayWeek(new Date()));
    }
}
