package com.winning.rule.engine.model;

import com.winning.rule.engine.util.DateHelper;

import java.util.Date;

/**
 * @author pyc
 */
public class SimulateCurrentTime {
    private Date currentTime;
    private Date currentDate;
    private Date tomorrowDate;


    public SimulateCurrentTime() {
    }

    public SimulateCurrentTime(Date currentTime, Date currentDate, Date tomorrowDate) {
        this.currentTime = currentTime;
        this.currentDate = currentDate;
        this.tomorrowDate = tomorrowDate;
    }

    public SimulateCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

        public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getTomorrowDate() {
        return tomorrowDate;
    }

    public void setTomorrowDate(Date tomorrowDate) {
        this.tomorrowDate = tomorrowDate;
    }

    @Override
    public String toString() {
        return "SimulateCurrentTime{" +
                "模拟当前时间点 =" + currentTime +
                ", 当前日期 =" + currentDate +
                ", 第二天日期 =" + tomorrowDate +
                '}';
    }
}
