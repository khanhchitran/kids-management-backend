package com.kids_management.controller;

import com.kids_management.dto.FamilyDto;
import com.kids_management.model.Family;
import com.kids_management.model.Kid;
import com.kids_management.service.FamilyService;
import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        Long familyId = familyService.createFamily(familyDto);
        return new ResponseEntity<>(familyId, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Family>> findFamilyByFamilyName(@RequestParam() String familyName) {
      List<Family> families = familyService.findByFamilyName(familyName);
        if(families.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(families);
    }

//    @GetMapping()
//    public ResponseEntity<List<Kid>> findKidByFamilyName(@RequestParam() String familyName){
//        List<Kid> kids = familyService.findKidByFamilyName(familyName);
//        if(kids.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(kids);
//    }

}
