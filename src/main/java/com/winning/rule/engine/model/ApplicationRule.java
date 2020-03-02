package com.winning.rule.engine.model;

import java.util.Date;

/**
 * @author pyc
 */
public class ApplicationRule {
    private Long ruleId;
    private Date everydayStopApplicationTime;
    private Date splitApplicationToTwoPartTime;

    public ApplicationRule(){}

    public ApplicationRule(Long ruleId, Date everydayStopApplicationTime, Date splitApplicationToTwoPartTime) {
        this.ruleId = ruleId;
        this.everydayStopApplicationTime = everydayStopApplicationTime;
        this.splitApplicationToTwoPartTime = splitApplicationToTwoPartTime;
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
}
