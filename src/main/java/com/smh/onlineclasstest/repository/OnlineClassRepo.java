package com.smh.onlineclasstest.repository;


import com.smh.onlineclasstest.entity.OnlineClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OnlineClassRepo  extends JpaRepository<OnlineClass, Integer>{


    @Query("select c from OnlineClass c where c.id=:id ")
    List<OnlineClass> findByClassId(@Param("id") int id);
}
