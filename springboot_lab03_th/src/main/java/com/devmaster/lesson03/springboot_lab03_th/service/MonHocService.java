package com.devmaster.lesson03.springboot_lab03_th.service;

import com.devmaster.lesson03.springboot_lab03_th.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("monhoc")
public class MonHocService {
    List<MonHoc> monHocList = new ArrayList<>();

    public MonHocService() {
        monHocList.addAll(Arrays.asList());
    }

    public List<MonHoc> getMonHocList() {
        return monHocList;
    }

    public MonHoc getMonHocById(Long mamh) {
        return monHocList.stream()
                .filter(monHoc -> monHoc.getMamh().equals(mamh))
                .findFirst()
                .orElse(null);
    }

    public MonHoc addMonHoc(MonHoc monHoc) {
        monHocList.add(monHoc);
        return monHoc;
    }

    public MonHoc updateMonHoc(Long mamh, MonHoc monHoc) {
        MonHoc checkMonHoc = getMonHocById(mamh);
        if (checkMonHoc == null) {
            return null;
        }
        monHocList.forEach(mh -> {
            if (mh.getMamh().equals(mamh)) {
                mh.setTenmh(monHoc.getTenmh());
                mh.setSotiet(monHoc.getSotiet());
            }
        });
        return monHoc;
    }

    public boolean deleteMonHoc(Long mamh) {
        MonHoc monHoc = getMonHocById(mamh);
        return monHocList.remove(monHoc);
    }
}
