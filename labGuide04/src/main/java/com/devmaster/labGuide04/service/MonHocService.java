package com.devmaster.labGuide04.service;

import com.devmaster.labGuide04.dto.MonHocDTO;
import com.devmaster.labGuide04.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("monhoc")
public class MonHocService {
    List<MonHoc> monHocList= new ArrayList<MonHoc>();

    public MonHocService() {

    }

    public List<MonHoc> findAllMonHoc() {
        return monHocList;
    }

    public MonHoc getMonHoc(String mamh) {
        for (MonHoc monHoc : monHocList) {
            if (monHoc.getMamh().equals(mamh)) {
                return monHoc;
            }
        }
        return null;
    }

    public Boolean addMonHoc(MonHocDTO monHocDTO) {
        try {
            MonHoc monHoc = new MonHoc();
            monHoc.setMamh(monHocDTO.getMamh());
            monHoc.setTenmh(monHocDTO.getTenmh());
            monHoc.setSotiet(monHocDTO.getSotiet());

            monHocList.add(monHoc);
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean updateMonHoc(MonHocDTO monHocDTO) {
        for (MonHoc monHoc : monHocList) {
            if (monHoc.getMamh().equals(monHocDTO.getMamh())) {
                monHoc.setMamh(monHocDTO.getMamh());
                monHoc.setTenmh(monHocDTO.getTenmh());
                monHoc.setSotiet(monHocDTO.getSotiet());
                monHocList.add(monHoc);
            }
        }
        return true;
    }

    public Boolean deleteMonHoc(String mamh) {
        return monHocList.removeIf(monHoc -> monHoc.getMamh().equals(mamh));
    }
}
