package org.ch.test.infrastructure;

import org.ch.infrastructure.persistent.dao.IStrategyAwardDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyAwardDAOTest {

    @Resource
    private IStrategyAwardDAO strategyAwardDAO;

    @Test
    public void testQueryStrategyAwardList() {
        System.out.println(strategyAwardDAO.queryStrategyAwardList());
    }

}
