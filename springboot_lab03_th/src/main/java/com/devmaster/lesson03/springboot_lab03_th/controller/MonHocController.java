package com.devmaster.lesson03.springboot_lab03_th.controller;

import com.devmaster.lesson03.springboot_lab03_th.entity.MonHoc;
import com.devmaster.lesson03.springboot_lab03_th.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monhoc")
public class MonHocController {
    @Autowired
    private MonHocService monHocService;

    @GetMapping("/monhoc-list")
    public List<MonHoc> getMonHocList() {
        return monHocService.getMonHocList();
    }

    @GetMapping("/monhoc/{mamh}")
    public MonHoc getMonHocById(@PathVariable String mamh) {
        Long idMonHoc = Long.parseLong(mamh);
        return monHocService.getMonHocById(idMonHoc);
    }

    @PostMapping("/khoa-add")
    public MonHoc addMonHoc(@RequestBody MonHoc monHoc) {
        return monHocService.addMonHoc(monHoc);
    }

    @PutMapping("/monhoc/{mamh}")
    public MonHoc updateMonHoc(@PathVariable String mamh, @RequestBody MonHoc monHoc) {
        Long idMonHoc = Long.parseLong(mamh);
        return monHocService.updateMonHoc(idMonHoc, monHoc);
    }

    @DeleteMapping("/monhoc/{mamh}")
    public boolean deleteMonHoc(@PathVariable String mamh) {
        Long idMonHoc = Long.parseLong(mamh);
        return monHocService.deleteMonHoc(idMonHoc);
    }
}
