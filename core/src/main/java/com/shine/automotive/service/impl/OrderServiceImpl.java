package com.shine.automotive.service.impl;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.dao.OrderDao;
import com.shine.automotive.po.Order;
import com.shine.automotive.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by fuzhaohui on 14/11/28.
 * 订单服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addOrder(Order order) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editOrder(Order order) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteOrder(Order order) {

    }

    @Transactional(readOnly=true)
    @Override
    public Order queryOrderById(String orderId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<Order> queryOrderByUserId(String userId, Date startTime, Date endTime, int pno, int psize) {
        return null;
    }
}
