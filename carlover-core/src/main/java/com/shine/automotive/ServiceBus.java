package com.shine.automotive;

import com.shine.automotive.service.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by fuzhaohui on 14-11-30.
 */
@Component
public class ServiceBus {

    @Resource
    private UserService userService;
    @Resource
    private StoreService storeService;
    @Resource
    private ProductService productService;
    @Resource
    private AddressService addressService;
    @Resource
    private ArticleService articleService;
    @Resource
    private ArticleCommentService articleCommentService;
    @Resource
    private BrandService brandService;
    @Resource
    private CarService carService;
    @Resource
    private OrderService orderService;
    @Resource
    private ProductCategoryService productCategoryService;
    @Resource
    private ScoreService scoreService;
    @Resource
    private ServiceCategoryService serviceCategoryService;
    @Resource
    private StoreCommentService storeCommentService;



}
