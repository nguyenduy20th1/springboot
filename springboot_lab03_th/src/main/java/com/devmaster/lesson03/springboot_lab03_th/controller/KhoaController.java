package com.devmaster.lesson03.springboot_lab03_th.controller;

import com.devmaster.lesson03.springboot_lab03_th.entity.Khoa;
import com.devmaster.lesson03.springboot_lab03_th.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khoa")
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @GetMapping("/khoa-list")
    public List<Khoa> getAllKhoaList() {
        return khoaService.getKhoaList();
    }

    @GetMapping("/khoa/{makh}")
    public Khoa getKhoaById(@PathVariable String makh) {
        Long idKhoa = Long.parseLong(makh);
        return khoaService.getKhoa(idKhoa);
    }

    @PostMapping("/khoa-add")
    public Khoa addKhoa(@RequestBody Khoa khoa) {
        return khoaService.addKhoa(khoa);
    }

    @PutMapping("/khoa/{makh}")
    public Khoa updateKhoa(@PathVariable String makh, @RequestBody Khoa khoa) {
        Long idKhoa = Long.parseLong(makh);
        return khoaService.updateKhoa(idKhoa, khoa);
    }

    @DeleteMapping("/khoa/{makh}")
    public boolean deleteKhoa(@PathVariable String makh) {
        Long idKhoa = Long.parseLong(makh);
        return khoaService.deleteKhoa(idKhoa);
    }
}
