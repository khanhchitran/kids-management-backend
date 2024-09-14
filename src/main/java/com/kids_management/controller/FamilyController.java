package com.kids_management.controller;

import com.kids_management.dto.FamilyDto;
import com.kids_management.model.Family;
import com.kids_management.service.FamilyService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/families")
public class FamilyController {
    public final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    @PostMapping()
    public ResponseEntity<Long> createFamily(@RequestBody() @Valid FamilyDto familyDto) {
        Long familyId = familyService.createFamily(familyDto);
        URI location = URI.create("api/v1/families" + familyId);

        return ResponseEntity.created(location).body(familyId);
    }

    @GetMapping()
    public ResponseEntity<List<Family>> findFamilyByFamilyName(@RequestParam() String familyName) {
        List<Family> families = familyService.findByFamilyName(familyName);
        if (families.isEmpty()) {
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
