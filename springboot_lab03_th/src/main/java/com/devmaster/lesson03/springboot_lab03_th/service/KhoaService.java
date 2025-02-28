package com.devmaster.lesson03.springboot_lab03_th.service;

import com.devmaster.lesson03.springboot_lab03_th.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("khoa")
public class KhoaService {
    List<Khoa> khoaList = new ArrayList<>();

    public KhoaService() {
        khoaList.addAll(Arrays.asList());
    }

    public List<Khoa> getKhoaList() {
        return khoaList;
    }

    public Khoa getKhoa(Long makh) {
        return khoaList.stream()
                .filter(khoa -> khoa.getMakh().equals(makh))
                .findFirst()
                .orElse(null);
    }

    public Khoa addKhoa(Khoa khoa) {
        khoaList.add(khoa);
        return khoa;
    }

    public Khoa updateKhoa(Long makh, Khoa newKhoa) {
        for (Khoa khoa : khoaList) {
            if (khoa.getMakh().equals(makh)) {
                khoa.setMakh(newKhoa.getMakh());
                khoa.setTenkh(newKhoa.getTenkh());
                return khoa;
            }
        }
        return null;
    }

    public boolean deleteKhoa(Long makh) {
        Khoa khoa = getKhoa(makh);
        return khoaList.remove(khoa);
    }
}
