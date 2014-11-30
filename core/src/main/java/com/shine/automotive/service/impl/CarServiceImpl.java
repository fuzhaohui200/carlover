package com.shine.automotive.service.impl;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.dao.CarDao;
import com.shine.automotive.po.Car;
import com.shine.automotive.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 汽车服务
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,  readOnly = true)
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void addCar(Car car) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void editCar(Car car) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteCarById(String carId) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public void deleteCarByUserId(String userId) {

    }

    @Transactional(readOnly=false, rollbackFor=Throwable.class)
    @Override
    public Car queryCarById(String carId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public List<Car> queryCarByUser(String userId) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public Pager<Car> queryCar(String searchParams, int pno, int psize) {
        return null;
    }


}
