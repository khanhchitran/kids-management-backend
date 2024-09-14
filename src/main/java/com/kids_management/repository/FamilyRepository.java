package com.kids_management.repository;

import com.kids_management.model.Family;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Long> {
 List<Family> findByFamilyName(String familyName);
}
