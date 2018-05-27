package com.dao;

import com.domain.NhBasic;
import com.domain.NhMore;
import com.util.UUIDUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NhDaoTest {

    @Autowired
    private NhDao nhDao;

    @Test
    public void register() {

    }

    @Test
    public void getNhBasicByTelephone() {
        NhBasic nhBasic = nhDao.getNhBasicByTelephone("17367077253");
        Assert.assertEquals("17367077253",nhBasic.getNhTelephone());

        nhBasic = nhDao.getNhBasicByTelephone("17367077254");
        Assert.assertEquals(null, nhBasic);

    }

    @Test
    public void addNhDetailInfo(){
        NhMore nhMore = new NhMore();
        nhMore.setNhBasicId("3e98d27e-b45e-462a-93c1-42377f24faf7");
        nhMore.setNhMoreId(UUID.randomUUID().toString());
        nhMore.setNhRealName("123");
        nhMore.setNhIdCard("123");
        nhMore.setNhGhdwAddress("123");
        nhMore.setNhGndwAreaCode("110108");
        nhMore.setNhGhdwPhone("123");
        nhMore.setNhPayPassword("123");
        nhMore.setNhPaySalt("123");
        nhMore.setNhStatus(0);
        nhMore.setNhSex("male");
        nhMore.setNhOrigin("123");
        nhMore.setNhNation("123");
        nhMore.setNhPolitics("群众");
        int res =  nhDao.addNhDetailInfo(nhMore);
        Assert.assertEquals(1, res);
    }
}