package com.winning.rule.engine.model;

import com.winning.rule.engine.util.DateHelper;

import java.util.Date;

/**
 * @author pyc
 */
public class SimulateCurrentTime {
    private Date currentTime;

    public SimulateCurrentTime() {
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


    @Override
    public String toString() {
        return "模拟当前时间：" + DateHelper.formatDate(currentTime);
    }
}
