package org.ch.test.infrastructure;

import org.ch.infrastructure.persistent.dao.IStrategyDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyDAOTest {

    @Resource
    private IStrategyDAO strategyDAO;

    @Test
    public void testQueryStrategyList() {
        System.out.println(strategyDAO.queryStrategyList());
    }

}
