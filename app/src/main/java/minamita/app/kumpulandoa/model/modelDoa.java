package minamita.app.kumpulandoa.model;

/**
 * Created by annisatahira on 15/11/18.
 */

public class modelDoa {
    private String judul;
    private String ayat;
    private String baca;
    private String arti;


    public modelDoa(String judul, String ayat, String baca, String arti) {
        this.judul = judul;
        this.ayat = ayat;
        this.baca = baca;
        this.arti = arti;
    }

    public String getNama() {
        return judul;
    }

    public String getSurah() {
        return ayat;
    }

    public String getBaca() {
        return baca;
    }

    public String getArti() {
        return arti;
    }
}
