package com.smh.onlineclasstest.repository;

import com.smh.onlineclasstest.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<Application, Integer> {
}
