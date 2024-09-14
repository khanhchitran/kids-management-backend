package com.kids_management.controller;

import com.kids_management.dto.KidDto;
import com.kids_management.model.Kid;
import com.kids_management.repository.KidRepository;
import com.kids_management.service.KidService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/kids")
public class KidController {
    private final KidRepository kidRepository;
    private final KidService kidService;

    public KidController(KidRepository kidRepository, KidService kidService) {
        this.kidRepository = kidRepository;
        this.kidService = kidService;
    }

    @GetMapping()
    public ResponseEntity<List<Kid>> findByFirstName(@RequestParam String firstName) {
        List<Kid> kids = kidRepository.findByFirstName(firstName);

        if (kids.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(kids);
    }

    @PostMapping()
    private ResponseEntity<Long> createKid(@RequestBody @Valid KidDto kidDto) {
        Long kidId = kidService.createKid(kidDto);
        URI location = URI.create("api/v1/kids" + kidId);

        return ResponseEntity.created(location).body(kidId);
    }
}
