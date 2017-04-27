package utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Help to deal with some date api operations
 */
public class DateUtils {

    /**
     * use year,month,date to create a date
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static Date createDate(int year, int month, int date) {

        LocalDate localDate = LocalDate.of(year, month, date);
        ZoneId zoneId = ZoneId.systemDefault();
        Date result = Date.from(localDate.atStartOfDay(zoneId).toInstant());
        return result;
    }
}
