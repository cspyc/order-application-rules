package com.winning.rule.engine.util;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDateHelper {

    @Test
    public void test_dateAdd_function() throws Exception {
        Date date = DateHelper.getDate("2020-03-03 00:00:00");

        Date addedDate = DateHelper.dateAdd(date, 2);
        String dateStr = DateHelper.formatDate(addedDate);
        Assert.assertEquals(dateStr, "2020-03-05 00:00:00");
    }
}
