package com.winning.rule.engine;

import com.winning.rule.engine.model.ApplicationRule;
import com.winning.rule.engine.model.ExecPlan;
import com.winning.rule.engine.model.SimulateCurrentTime;
import com.winning.rule.engine.util.DateHelper;
import com.winning.rule.engine.util.KnowledgeSessionHelper;
import org.junit.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

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
        List<ExecPlan> execPlanList = new ArrayList<ExecPlan>();

        KieSession kieSession = KnowledgeSessionHelper
                .getStatefulKnowledgeSessionWithCallback(kieContainer,"medicine-session");

        String currentDateString = "2020-03-02";
        String tomorrowDateString = "2020-03-03";

        //simulate data model
        ExecPlan execPlan0 = new ExecPlan(
                1123456L,
                DateHelper.getDate("2020-03-02 18:11:12"));

        ExecPlan execPlan1 = new ExecPlan(
                1123457L,
                DateHelper.getDate("2020-03-03 10:11:12"));

        ExecPlan execPlan2 = new ExecPlan(
                1123458L,
                DateHelper.getDate("2020-03-09 10:11:12"));

        ExecPlan execPlan3 = new ExecPlan(
                1123459L,
                DateHelper.getDate("2020-03-10 10:11:12"));

        ApplicationRule rule = new ApplicationRule(
                135790L,
                DateHelper.getDate(currentDateString+" 16:00:00"),
                DateHelper.getDate(currentDateString+" 10:00:00"),
                DateHelper.getDate(tomorrowDateString+" 15:00:00"),
                DateHelper.getDate("2020-03-07 00:00:00"),
                DateHelper.getDate("2020-03-08 23:59:59"),
                DateHelper.dateAdd(DateHelper.getDate("2020-03-08 23:59:59"),1)
        );

        SimulateCurrentTime currentTime = new SimulateCurrentTime(
                DateHelper.getDate("2020-03-02 08:09:00"),
                DateHelper.getDate(currentDateString + " 23:59:59"),
                DateHelper.getDate(tomorrowDateString+ " 23:59:59"));

        kieSession.setGlobal("execPlanList",execPlanList);

        kieSession.insert(execPlan0);
        kieSession.insert(execPlan1);
        kieSession.insert(execPlan2);
        kieSession.insert(execPlan3);

        kieSession.insert(rule);
        kieSession.insert(currentTime);

        kieSession.fireAllRules();

        kieSession.dispose();

        Assert.assertEquals(3,execPlanList.size());
    }
}
