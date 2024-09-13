package com.kids_management.controller;

import com.kids_management.dto.FamilyDto;
import com.kids_management.service.FamilyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/families")
public class FamilyController {
    public final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    @PostMapping()
    public ResponseEntity<Long> createFamily(
            @RequestBody()
            @Valid
            FamilyDto familyDto
    ) {
       Long familyId =  familyService.createFamily(familyDto);
       return new ResponseEntity<>(familyId, HttpStatus.CREATED);
    }

}
