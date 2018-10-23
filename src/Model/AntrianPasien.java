package Model;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user only
 */
public class AntrianPasien {

    public static ArrayList<AntrianPasien> daftarAntrian
            = new ArrayList<AntrianPasien>();

    public static void buatAntrian(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // cari antrian dalam list daftarAntri
        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            // tambah dalam list antrian
            daftarAntrian.add(antrian);
        } else {
            System.out.println("antrian sudah ada");
        }
    }

    public static int cariAntrian(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        return -1; // index list
    }

    public static void daftarPasien(
            Pasien pasien,
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        // cari antrian ada apa tidak
        // jika ada
        // panggil fungsi mendaftar dari objek antrian
        // jika tidak ada
        // buat antrian baru, panggil gungsi daftar pasien dari objek antrian
        // tambahkan objek antrian baru ke list daftar antrian
    }
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;

    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();

    public AntrianPasien() {
    }

    public AntrianPasien(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }

    public void mendaftar(Pasien pasien) {
        getDaftarPasien().add(pasien);
    }

    /**
     * @return the daftarPasienAntri
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasienAntri;
    }

    /**
     * @param daftarPasien the daftarPasienAntri to set
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasienAntri = daftarPasien;
    }

    /**
     * @return the tanggalAntrian
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * @param tanggalAntrian the tanggalAntrian to set
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * @return the bulanAntrian
     */
    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**
     * @param bulanAntrian the bulanAntrian to set
     */
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * @return the tahunAntrian
     */
    public int getTahunAntrian() {
        return tahunAntrian;
    }

    /**
     * @param tahunAntrian the tahunAntrian to set
     */
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    /**
     * @return the klinik
     */
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * @param klinik the klinik to set
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik()
                + klinik.getNamaKlinik();
    }

}
