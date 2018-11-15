package minamita.app.kumpulandoa.model;

/**
 * Created by annisatahira on 15/11/18.
 */

public class modelJadwal {
    private String waktu;
    private String jam;

    public modelJadwal(String waktu, String jam){
        this.waktu=waktu;
        this.jam=jam;
    }

    public String getWaktu(){
        return waktu;
    }
    public String getJam(){
        return jam;
    }

}
