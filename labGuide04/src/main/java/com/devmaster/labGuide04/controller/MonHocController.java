package com.devmaster.labGuide04.controller;

import com.devmaster.labGuide04.dto.MonHocDTO;
import com.devmaster.labGuide04.entity.MonHoc;
import com.devmaster.labGuide04.service.MonHocService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("monhoc")
public class MonHocController {
    @Autowired
    private final MonHocService monHocService;

    @GetMapping("/list")
    public List<MonHoc> getMonHocList() {
        return monHocService.findAllMonHoc();
    }

    @GetMapping("/{mamh}")
    public MonHoc getMonHoc(@PathVariable String mamh) {
        return monHocService.getMonHoc(mamh);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMonHoc(@Valid @RequestBody MonHocDTO monHocDTO) {
        monHocService.addMonHoc(monHocDTO);
        return ResponseEntity.ok("Monhoc added successfully");
    }

    @PutMapping("/{mamh}")
    public MonHocDTO updateMonHoc(@Valid @RequestBody MonHocDTO monHocDTO) {
        monHocService.updateMonHoc(monHocDTO);
        return monHocDTO;
    }

    @DeleteMapping("/{mamh}")
    public void deleteMonHoc(@PathVariable String mamh) {
        monHocService.deleteMonHoc(mamh);
    }
}
