/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22_05_23thbuoi4;

/**
 *
 * @author ADMIN
 */
class PhongMayChuaSuDung extends PhongMay {
    private int soMayTrong;

    public PhongMayChuaSuDung(String tenPhong, int soMay,float dienTich ,int soMayTrong) {
        super(tenPhong, soMay,dienTich);
        this.soMayTrong = soMayTrong;
    }

    @Override
    public void thongTinPhong() {
        super.thongTinPhong();
        System.out.println("Số máy trống: " + soMayTrong);
    }
}
