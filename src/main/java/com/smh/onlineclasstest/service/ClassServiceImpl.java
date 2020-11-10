package com.smh.onlineclasstest.service;


import com.smh.onlineclasstest.entity.OnlineClass;
import com.smh.onlineclasstest.repository.OnlineClassRepo;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ClassServiceImpl implements  ClassesService{

    private final OnlineClassRepo onlineClassesRepo;

    @Override
    public OnlineClass create(OnlineClass onlineClasses) {
        return onlineClassesRepo.save(onlineClasses);
    }

    @Override
    public OnlineClass findById(int id) {
        return onlineClassesRepo.findById(id).orElseThrow();
    }

    @Override
    public List<OnlineClass> findAll() {
        return onlineClassesRepo.findAll();
    }

    @Override
    public List<OnlineClass> findByClassesID(int id) {
        return onlineClassesRepo.findByClassId(id);
    }
}
