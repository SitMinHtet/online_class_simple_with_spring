package com.smh.onlineclasstest.service;


import com.smh.onlineclasstest.entity.Application;
import com.smh.onlineclasstest.repository.ApplicationRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class RegisterServiceImpl implements RegisterService{

    private final ApplicationRepo applicationRepo;

    @Override
    public Application create(Application application) {
        return applicationRepo.save(application);
    }

    @Override
    public int join(int id, Application application) {
        return 0;
    }

    @Override
    public List<Application> findAll() {
        return applicationRepo.findAll();
    }
}
