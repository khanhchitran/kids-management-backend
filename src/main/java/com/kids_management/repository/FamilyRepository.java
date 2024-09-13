package com.kids_management.repository;

import com.kids_management.model.Family;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Long> {
}
