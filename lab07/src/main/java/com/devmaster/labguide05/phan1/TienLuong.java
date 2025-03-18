package com.devmaster.labguide05.phan1;

/**
 * @author Devmaster
 */
public class TienLuong {
    public static final float trungCap = 1.55f;
    public static final float caoDang = 1.80f;
    public static final float daiHoc = 2.34f;

    public static final double LUONG_CO_BAN =2889000;
    public static final float heSoBHXH = 16;
    public static final float heSoThamNien = 5;

    /**
     * Hàm tính lương cơ bản
     *
     * @param hocVi Gồm 3 cấp độ học vị sẵn có
     * @param namCongTac Số năm Nhân viên đã công tác tại doanh nghiệp
     * @return tiền lương cơ bản
     */

    public static double luongCoBan(float hocVi, int namCongTac) {
        double luongCoBan = (hocVi * LUONG_CO_BAN)+ namCongTac * (5 / 100 * LUONG_CO_BAN);
        return luongCoBan;
    }
}

