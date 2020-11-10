package com.smh.onlineclasstest.service;


import com.smh.onlineclasstest.entity.OnlineClass;
import java.util.List;


public interface ClassesService {

    OnlineClass create(OnlineClass onlineClass);
    OnlineClass findById(int id);
    List<OnlineClass> findAll();
    //List<Product> findByCategoryId(int id);
    List<OnlineClass> findByClassesID(int id);
}

