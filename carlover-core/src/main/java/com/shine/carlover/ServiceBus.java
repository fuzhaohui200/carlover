package com.shine.carlover;

import com.shine.carlover.service.*;
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

    public UserService getUserService() {
        return userService;
    }

    public StoreService getStoreService() {
        return storeService;
    }

    public ProductService getProductService() {
        return productService;
    }

    public AddressService getAddressService() {
        return addressService;
    }

    public ArticleService getArticleService() {
        return articleService;
    }

    public ArticleCommentService getArticleCommentService() {
        return articleCommentService;
    }

    public BrandService getBrandService() {
        return brandService;
    }

    public CarService getCarService() {
        return carService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public ProductCategoryService getProductCategoryService() {
        return productCategoryService;
    }

    public ScoreService getScoreService() {
        return scoreService;
    }

    public ServiceCategoryService getServiceCategoryService() {
        return serviceCategoryService;
    }

    public StoreCommentService getStoreCommentService() {
        return storeCommentService;
    }
}
