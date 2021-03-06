package com.shine.carlover.service;

import com.shine.carlover.base.pager.Pager;
import com.shine.carlover.po.Car;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
 * 汽车服务
 */
public interface CarService {

    public void addCar(Car car);
    public void editCar(Car car);
    public void deleteCarById(String carId);
    public void deleteCarByUserId(String userId);
    public Car queryCarById(String carId);
    public List<Car> queryCarByUser(String userId);
    public Pager<Car> queryCar(String searchParams, int pno, int psize);


}
