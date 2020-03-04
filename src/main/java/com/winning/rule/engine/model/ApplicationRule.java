package com.winning.rule.engine.model;

import java.util.Date;

/**
 * @author pyc
 */
public class ApplicationRule {
    private Long ruleId;
    private Date everydayStopApplicationTime;
    private Date splitApplicationToTwoPartTime;
    private Date applicationToSecondDayTime;
    private Date holidayBeginDay;
    private Date holidayEndDay;
    private Date firstDayAfterHoliday;

    public ApplicationRule(){}

    public ApplicationRule(Long ruleId, Date everydayStopApplicationTime, Date splitApplicationToTwoPartTime, Date applicationToSecondDayTime, Date holidayBeginDay, Date holidayEndDay, Date firstDayAfterHoliday) {
        this.ruleId = ruleId;
        this.everydayStopApplicationTime = everydayStopApplicationTime;
        this.splitApplicationToTwoPartTime = splitApplicationToTwoPartTime;
        this.applicationToSecondDayTime = applicationToSecondDayTime;
        this.holidayBeginDay = holidayBeginDay;
        this.holidayEndDay = holidayEndDay;
        this.firstDayAfterHoliday = firstDayAfterHoliday;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Date getEverydayStopApplicationTime() {
        return everydayStopApplicationTime;
    }

    public void setEverydayStopApplicationTime(Date everydayStopApplicationTime) {
        this.everydayStopApplicationTime = everydayStopApplicationTime;
    }

    public Date getSplitApplicationToTwoPartTime() {
        return splitApplicationToTwoPartTime;
    }

    public void setSplitApplicationToTwoPartTime(Date splitApplicationToTwoPartTime) {
        this.splitApplicationToTwoPartTime = splitApplicationToTwoPartTime;
    }

    public Date getApplicationToSecondDayTime() {
        return applicationToSecondDayTime;
    }

    public void setApplicationToSecondDayTime(Date applicationToSecondDayTime) {
        this.applicationToSecondDayTime = applicationToSecondDayTime;
    }

    public Date getHolidayBeginDay() {
        return holidayBeginDay;
    }

    public void setHolidayBeginDay(Date holidayBeginDay) {
        this.holidayBeginDay = holidayBeginDay;
    }

    public Date getHolidayEndDay() {
        return holidayEndDay;
    }

    public void setHolidayEndDay(Date holidayEndDay) {
        this.holidayEndDay = holidayEndDay;
    }

    public Date getFirstDayAfterHoliday() {
        return firstDayAfterHoliday;
    }

    public void setFirstDayAfterHoliday(Date firstDayAfterHoliday) {
        this.firstDayAfterHoliday = firstDayAfterHoliday;
    }

    @Override
    public String toString() {
        return "ApplicationRule{" +
                "ruleId=" + ruleId +
                ", 领药停止时间 = " + everydayStopApplicationTime +
                ", 今日领药分隔时间 =" + splitApplicationToTwoPartTime +
                ", 领药到第二天时间点 = " + applicationToSecondDayTime +
                ", 假期开始时间 =" + holidayBeginDay +
                ", 假期结束时间 =" + holidayEndDay +
                ", 假期后第一天 = " + firstDayAfterHoliday +
                '}';
    }


}
