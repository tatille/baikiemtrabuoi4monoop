
package pkg22_05_23thbuoi4;

class PhongMaySuDung extends PhongMay {
    private int soMayDangSuDung;

    public PhongMaySuDung(String tenPhong, int soMay, float dienTich, int soMayDangSuDung) {
        super(tenPhong, soMay,dienTich);
        this.soMayDangSuDung = soMayDangSuDung;
    }

    @Override
    public void thongTinPhong() {
        super.thongTinPhong();
        System.out.println("Số máy đang sử dụng: " + soMayDangSuDung);
    }
}

