package com.example.entity.repository;

import com.example.entity.model.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends CrudRepository<Entity, Long> {
}