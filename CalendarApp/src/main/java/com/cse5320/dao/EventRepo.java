package com.cse5320.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cse5320.model.*;

public interface EventRepo extends JpaRepository<Activity, Integer>{


}
