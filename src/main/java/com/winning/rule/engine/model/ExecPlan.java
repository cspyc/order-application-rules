package com.winning.rule.engine.model;

import java.util.Date;

/**
 * @author pyc
 */
public class ExecPlan {
    private Long execPlanId;
    private Date planedExecTime;

    public ExecPlan(){}

    public ExecPlan(Long execPlanId,Date planedExecTime) {
        this.execPlanId = execPlanId;
        this.planedExecTime = planedExecTime;
    }

    public Long getExecPlanId() {
        return execPlanId;
    }

    public void setExecPlanId(Long execPlanId) {
        this.execPlanId = execPlanId;
    }

    public Date getPlanedExecTime() {
        return planedExecTime;
    }

    public void setPlanedExecTime(Date planedExecTime) {
        this.planedExecTime = planedExecTime;
    }

    @Override
    public String toString() {
        return "ExecPlan{" +
                "执行计划ID =" + execPlanId +
                ", 执行时间 =" + planedExecTime +
                '}';
    }
}
