package co.com.fyffes.portal.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateDate {

    public String CurrentYearCal() {
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        Date fecha = new Date();
        String currentYear = getYearFormat.format(fecha);

        return "//span[contains(text(),'"+String.valueOf(currentYear)+"')]";
    }

    public static String CurrentYearValue() {
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        Date fecha = new Date();
        String currentYear = getYearFormat.format(fecha);
        return String.valueOf(currentYear);
    }

    public String LastYearCal() {
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        Date fecha = new Date();
        int currentYear = Integer.parseInt(getYearFormat.format(fecha))-1;

        return "//span[contains(text(),'"+String.valueOf(currentYear)+"')]";
    }

    /* Add or subtract days to the current date */
    public static String addSubtractDays(int days){
        SimpleDateFormat getYearFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // We configure the received date
        calendar.add(Calendar.DAY_OF_YEAR, days);  // Number of days to add or subtract
        String calculatedDate = getYearFormat.format(calendar.getTime());

        return calculatedDate;
    }

    // Gets the number of the week of the year and adds or subtracts weeks
    public static int weekOfYear(int week){
        Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.setTime(fecha);
        int numberWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        return numberWeekOfYear+week;

    }



}
