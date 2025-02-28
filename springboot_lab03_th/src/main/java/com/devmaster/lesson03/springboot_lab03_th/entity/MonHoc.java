package com.devmaster.lesson03.springboot_lab03_th.entity;

public class MonHoc {
    Long mamh;
    String tenmh;
    int sotiet;

    public MonHoc(Long mamh, String tenkh, int sotiet) {
        this.mamh = mamh;
        this.tenmh = tenkh;
        this.sotiet = sotiet;
    }

    public Long getMamh() {
        return mamh;
    }
    public void setMamh(Long mamh) {
        this.mamh = mamh;
    }

    public String getTenmh() {
        return tenmh;
    }
    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public int getSotiet() {
        return sotiet;
    }
    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
    }
}
