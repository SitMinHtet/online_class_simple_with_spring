package com.smh.onlineclasstest.service;

import com.smh.onlineclasstest.entity.Application;
import com.smh.onlineclasstest.repository.ApplicationRepo;

import java.util.List;

public interface RegisterService {

    Application create(Application application);
    int join(int id, Application application);
    List<Application> findAll();
}
