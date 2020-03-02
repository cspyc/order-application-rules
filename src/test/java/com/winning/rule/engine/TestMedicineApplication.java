package com.winning.rule.engine;

import com.winning.rule.engine.model.ApplicationRule;
import com.winning.rule.engine.model.ExecPlan;
import com.winning.rule.engine.model.SimulateCurrentTime;
import com.winning.rule.engine.util.DateHelper;
import com.winning.rule.engine.util.KnowledgeSessionHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Date;

public class TestMedicineApplication {

    public static KieContainer kieContainer = null;
    public KieSession kieSession = null;

    @BeforeClass
    public static void beforeClass(){
        kieContainer = KnowledgeSessionHelper.createRuleBase();
    }

    @Before
    public void before() {
        System.out.println("------------Before------------");
    }

    @After
    public void tearDown() {
        System.out.println("------------After ------------");
    }

    @Test
    public void testTodayApplicationRule() throws Exception {
        KieSession kieSession = KnowledgeSessionHelper
                .getStatefulKnowledgeSessionWithCallback(kieContainer,"medicine-session");

        //simulate data model
        ExecPlan execPlan = new ExecPlan(
                1123456L,
                DateHelper.getDate("2020-03-02 18:11:12"));

        ApplicationRule rule = new ApplicationRule(
                135790L,
                DateHelper.getDate("16:00:00","HH:mm:ss"),
                DateHelper.getDate("10:00:00","HH:mm:ss")
        );

        SimulateCurrentTime currentTime = new SimulateCurrentTime(DateHelper.getDate("2020-03-02 08:09:00"));

        kieSession.insert(execPlan);
        kieSession.insert(rule);
        kieSession.insert(currentTime);

        kieSession.fireAllRules();

        kieSession.dispose();
    }
}
