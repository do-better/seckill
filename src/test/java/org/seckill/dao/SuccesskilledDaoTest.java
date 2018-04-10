package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by yuanli on 2017/7/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccesskilledDaoTest {

    @Resource
    private SuccesskilledDao successkilledDao;
    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1004L;
        long phone = 15071439635L;
        int insertCount = successkilledDao.insertSuccessKilled(id,phone);
        System.out.println("insertCount: "+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long seckillId = 1004L;
        long userPhone = 15071439635L;
        SuccessKilled successkilled = successkilledDao.queryByIdWithSeckill(seckillId, userPhone);
        System.out.println(successkilled);
        System.out.println(successkilled.getSeckill());
    }

}