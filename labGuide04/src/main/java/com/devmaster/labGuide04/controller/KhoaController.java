package com.devmaster.labGuide04.controller;

import com.devmaster.labGuide04.dto.KhoaDTO;
import com.devmaster.labGuide04.entity.Khoa;
import com.devmaster.labGuide04.service.KhoaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/khoa")
public class KhoaController {
    @Autowired
    private final KhoaService khoaService;

    @GetMapping("/list")
    public List<Khoa> getKhoaList() {
        return khoaService.findAllKhoa();
    }

    @GetMapping("/{makh}")
    public Khoa getKhoa(@PathVariable String makh) {
        return khoaService.getKhoa(makh);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addKhoa(@Valid @RequestBody KhoaDTO khoaDTO) {
        khoaService.addKhoa(khoaDTO);
        return ResponseEntity.ok("Khoa added successfully");
    }

    @PutMapping("/{makh}")
    public KhoaDTO updateKhoa(@Valid @RequestBody KhoaDTO khoaDTO) {
        khoaService.updateKhoa(khoaDTO);
        return khoaDTO;
    }

    @DeleteMapping("{makh}")
    public void deleteKhoa(@PathVariable String makh) {
        khoaService.deleteKhoa(makh);
    }
}
