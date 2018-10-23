package test;

import Model.Pasien;
import java.io.File;

public class TestStream {

    public static void main(String[] args) {
        Pasien test = new Pasien();
        test.setNoRM("123");
        test.setNama("puspa");
        test.setAlamat("klaten");

        Pasien test2 = new Pasien();
        test2.setNoRM("456");
        test2.setNama("adi");
        test2.setAlamat("klaten");

        System.out.println(test.toString());
        System.out.println(test2.toString());

        Pasien.tambahPasienBaru(test);
        Pasien.tambahPasienBaru(test2);

        Pasien.simpanDaftarPasien(new File("daftar.txt"));
    }
}
