package test;

import java.io.File;
import Model.Pasien;

public class TestStream2 {

    public static void main(String[] args) {
        Pasien.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < Pasien.getDaftarPasien().size(); i++) {
            System.out.println(Pasien.getDaftarPasien().get(i).toString());

        }
    }
}
