package com.shine.automotive.service;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.po.Order;

import java.util.Date;

/**
 * Created by fuzhaohui on 14/11/28.
 */
public interface OrderService {

    public void addOrder(Order order);
    public void editOrder(Order order);
    public void deleteOrder(Order order);
    public Order queryOrderById(String orderId);
    public Pager<Order> queryOrderByUserId(String userId, Date startTime, Date endTime, int pno, int psize);
}
