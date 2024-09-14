package com.kids_management.service;

import com.kids_management.dto.KidDto;
import com.kids_management.model.Kid;
import com.kids_management.repository.KidRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KidService {
    private final KidRepository kidRepository;

    public KidService(KidRepository kidRepository) {
        this.kidRepository = kidRepository;
    }

    public List<Kid> findByFirstName(String firstName) {
        return kidRepository.findByFirstName(firstName);
    }

    public Long createKid(KidDto kidDto) {
        Kid kid = new Kid();
        kid.setFirstName(kidDto.getFirstName());
        kid = kidRepository.save(kid);
        return kid.getId();
    }
}
