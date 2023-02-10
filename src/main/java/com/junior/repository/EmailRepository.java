package com.junior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.model.Model;

public interface EmailRepository extends JpaRepository<Model, Long>{

}
