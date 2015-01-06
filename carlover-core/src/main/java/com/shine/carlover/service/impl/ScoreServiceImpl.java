package com.shine.carlover.service.impl;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.dao.ScoreDao;
import com.shine.carlover.po.Address;
import com.shine.carlover.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fuzhaohui on 14/11/28.
 * 地址服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addAddress(Address address) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editAddress(Address address) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteAddressById(String address) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteAddressByUser(String userId) {

    }

    @Transactional(readOnly=true)
    @Override
    public Address queryAddressById(String addressId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<Address> queryAddress(String userId, int pno, int psize) {
        return null;
    }

}
