package com.kids_management.service;

import com.kids_management.dto.FamilyDto;
import com.kids_management.model.Family;
import com.kids_management.model.Kid;
import com.kids_management.repository.FamilyRepository;
import com.kids_management.repository.KidRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {

    private final FamilyRepository familyRepository;
    private final KidRepository kidRepository;

    public FamilyService(FamilyRepository familyRepository, KidRepository kidRepository) {
        this.familyRepository = familyRepository;
        this.kidRepository = kidRepository;

    }

    public Long createFamily(FamilyDto familyDto) {
        Family family = new Family();
        family.setFamilyName(familyDto.getFamilyName());
        family = familyRepository.save(family);
        return family.getId();
    }

    public List<Family> findByFamilyName(String familyName) {
        return familyRepository.findByFamilyName(familyName);
    }

//    public List<Kid> findKidByFamilyName(String familyName) {
//        return kidRepository.findByFamilyName(familyName);
//    }
}
