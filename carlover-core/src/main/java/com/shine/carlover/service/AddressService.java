package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.po.Address;

/**
 * Created by fuzhaohui on 14/11/28.
 * 地址服务
 */
public interface AddressService {

    public void addAddress(Address address);
    public void editAddress(Address address);
    public void deleteAddressById(String addressId);
    public void deleteAddressByUser(String userId);
    public Address queryAddressById(String addressId);
    public Pager<Address> queryAddress(String userId, int pno, int psize);

}
