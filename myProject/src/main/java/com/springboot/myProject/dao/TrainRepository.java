package com.springboot.myProject.dao;

import com.springboot.myProject.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train,Integer> {

}
