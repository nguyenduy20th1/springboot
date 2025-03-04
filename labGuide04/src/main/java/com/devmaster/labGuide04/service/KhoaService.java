package com.devmaster.labGuide04.service;

import com.devmaster.labGuide04.dto.KhoaDTO;
import com.devmaster.labGuide04.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("khoa")
public class KhoaService {
    List<Khoa> khoaList = new ArrayList<Khoa>();

    public KhoaService() {

    }

    public List<Khoa> findAllKhoa() {
        return khoaList;
    }

    public Khoa getKhoa(String makh) {
        for (Khoa k : khoaList) {
            if (k.getMakh().equals(makh)) {
                return k;
            }
        }
        return null;
    }

    public Boolean addKhoa(KhoaDTO khoaDTO) {
        try {
            Khoa khoa = new Khoa();
            khoa.setMakh(khoaDTO.getMakh());
            khoa.setTenkh(khoaDTO.getTenkh());

            khoaList.add(khoa);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean updateKhoa(KhoaDTO khoaDTO) {
        for (Khoa k : khoaList) {
            if (k.getMakh().equals(khoaDTO.getMakh())) {
                k.setMakh(khoaDTO.getMakh());
                k.setTenkh(khoaDTO.getTenkh());
            }
        }
        return true;
    }

    public Boolean deleteKhoa(String makh) {
        return khoaList.removeIf(k -> k.getMakh().equals(makh));
    }
}
