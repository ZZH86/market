package org.ch.test.infrastructure;

import org.ch.infrastructure.persistent.dao.IAwardDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDAOTest {

    @Resource
    private IAwardDAO awardDAO;

    @Test
    public void testQueryAwardList() {
        System.out.println(awardDAO.queryAwardList());
    }

}
