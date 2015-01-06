package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.po.Order;

import java.util.Date;

/**
 * Created by fuzhaohui on 14/11/28.
 * 订单服务
 */
public interface OrderService {

    public void addOrder(Order order);
    public void editOrder(Order order);
    public void deleteOrder(Order order);
    public Order queryOrderById(String orderId);
    public Pager<Order> queryOrderByUserId(String userId, Date startTime, Date endTime, int pno, int psize);
}
