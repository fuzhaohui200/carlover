package com.shine.automotive.service;

import com.shine.automotive.base.pager.Pager;
import com.shine.automotive.po.Car;

import java.util.List;

/**
 * Created by fuzhaohui on 14/11/28.
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
