package org.ch.test.infrastructure;

import org.ch.infrastructure.persistent.dao.IStrategyRuleDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyRuleDAOTest {

    @Resource
    private IStrategyRuleDAO strategyRuleDAO;

    @Test
    public void testQueryStrategyRuleList() {
        System.out.println(strategyRuleDAO.queryStrategyRuleList());
    }

}
