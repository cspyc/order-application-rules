package com.winning.rule.engine;


import com.winning.rule.engine.model.TestUser;
import com.winning.rule.engine.util.KnowledgeSessionHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class TestDemo {

    private static KieContainer kieContainer;
    private KieSession sessionStatefull = null;

    @BeforeClass
    public static void beforeClass() {
        kieContainer = KnowledgeSessionHelper.createRuleBase();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("------------Before------------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("------------After ------------");
    }

    @Test
    public void test_function_name(){
        KieSession kieSession = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer,"ruleTest-session");

        TestUser a = new TestUser();
        a.setName("张三");
        kieSession.insert(a);

        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
