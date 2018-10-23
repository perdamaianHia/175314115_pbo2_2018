package Model;

import java.util.ArrayList;

public class Klinik {

    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public static void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public static Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).
                    getNamaKlinik().equalsIgnoreCase(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }
    private String idKlinik;
    private String namaKlinik;

    public Klinik() {
    }

    public Klinik(String idKlinik, String namaKlinik) {
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }

    /**
     * @return the idKlinik
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**
     * @param idKlinik the idKlinik to set
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * @return the namaKlinik
     */
    public String getNamaKlinik() {
        return namaKlinik;
    }

    /**
     * @param namaKlinik the namaKlinik to set
     */
    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }

}
