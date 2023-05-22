/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22_05_23thbuoi4;

/**
 *
 * @author ADMIN
 */
class PhongMay {
    protected String tenPhong;
    protected int soMay;
    protected float dienTich;

    public PhongMay(String tenPhong, int soMay,float dienTich) {
        this.tenPhong = tenPhong;
        this.soMay = soMay;
        this.dienTich=dienTich;
    }
    public void thongTinPhong() {
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện Tích Phòng : " + dienTich);
        System.out.println("Số máy: " + soMay);
    }
}
