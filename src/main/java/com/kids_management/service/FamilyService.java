package com.kids_management.service;

import com.kids_management.dto.FamilyDto;
import com.kids_management.model.Family;
import com.kids_management.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {

    @Autowired
    private  FamilyRepository familyRepository;

    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    public Long createFamily(FamilyDto familyDto) {
        Family family = new Family();
        family.setFamilyName(familyDto.getFamilyName());
        family = familyRepository.save(family);
        return family.getId();
    }
}
