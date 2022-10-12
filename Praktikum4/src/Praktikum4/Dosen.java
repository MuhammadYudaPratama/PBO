package Praktikum4;

/**
 *
 * @author YudaPratam
 */
public class Dosen extends Org {
    private int nip;
    public Dosen(String nama){
        this.nama=nama;
    }
    public Dosen(String nama, int nip){
        this.nama=nama;
        this.nip=nip;
    }
    public Dosen(String nama, int nip, int umur){
        this.nama=nama;
        this.umur=umur;
        this.nip=nip;
    }

    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println ("NIP : " + nip);
        System.out.println("Umur : " + umur);
    }
}

