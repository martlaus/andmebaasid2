package andmebaasid2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mart on 4.11.15.
 */
@Entity(name = "kauba_staatus" )
public class KaubaStaatus {

    @Id
    @GeneratedValue
    private int kauba_staatuse_kood;

    @Column
    private String nimetus;

    @Column
    private String kirjeldus;

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public int getKauba_staatuse_kood() {
        return kauba_staatuse_kood;
    }

    public void setKauba_staatuse_kood(int kauba_staatuse_kood) {
        this.kauba_staatuse_kood = kauba_staatuse_kood;
    }
}
