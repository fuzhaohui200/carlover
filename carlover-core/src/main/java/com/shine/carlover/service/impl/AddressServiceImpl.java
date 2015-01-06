package com.shine.carlover.service.impl;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.dao.AddressDao;
import com.shine.carlover.po.Address;
import com.shine.carlover.service.AddressService;
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
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addAddress(Address address) {
        addressDao.save("saveAddress", address);
    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editAddress(Address address) {
        addressDao.update("updateAddress", address);
    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteAddressById(String addressId) {
        addressDao.remove("deleteAddress", addressId);
    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteAddressByUser(String userId) {
        addressDao.remove("deleteAddressByUser", userId);
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
