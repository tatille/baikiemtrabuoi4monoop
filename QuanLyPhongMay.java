
package pkg22_05_23thbuoi4;

import java.util.ArrayList;
import java.util.List;


public class QuanLyPhongMay {
    public static void main(String[] args) {
        List<PhongMay> danhSachPhongMay = new ArrayList<>();

        PhongMaySuDung phongMaySuDung = new PhongMaySuDung("Phòng Máy A",500, 20, 10);
        danhSachPhongMay.add(phongMaySuDung);

        PhongMayChuaSuDung phongMayChuaSuDung = new PhongMayChuaSuDung("Phòng Máy B",350, 15, 15);
        danhSachPhongMay.add(phongMayChuaSuDung);

        for (PhongMay phongMay : danhSachPhongMay) {
            phongMay.thongTinPhong();
            System.out.println("----------");
        }
    }
}