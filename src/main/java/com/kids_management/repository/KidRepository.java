package com.kids_management.repository;

import com.kids_management.model.Kid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KidRepository extends CrudRepository<Kid, Long> {
    List<Kid> findByFirstName(String firstName);
//    List<Kid> findByFamilyName(String familyName);
}

