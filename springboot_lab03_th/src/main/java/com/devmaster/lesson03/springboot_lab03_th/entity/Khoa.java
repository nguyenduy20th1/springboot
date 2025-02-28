package com.devmaster.lesson03.springboot_lab03_th.entity;

public class Khoa {
    Long makh;
    String tenkh;

    public Khoa(Long makh, String tenkh) {
        this.makh = makh;
        this.tenkh = tenkh;
    }

    public Long getMakh() {
        return makh;
    }
    public void setMakh(Long makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
}
