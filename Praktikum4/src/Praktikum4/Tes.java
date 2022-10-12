package Praktikum4;

/**
 *
 * @author YudaPratam
 */
public class Tes {
    public static void main(String[] args) {
        System.out.println("Memasukkan Identitas Dosen 1 : Agus");
        Dosen dosen1 = new Dosen("Agus");
 
        System.out.println("Memasukkan Identitas Dosen 2 : Budi, NIP. 1458");
        Dosen dosen2 = new Dosen("Budi", 1458);
 
        System.out.println("Memasukkan Identitas Dosen 3 : Iwan, NIP. 121, umur 47");
        Dosen dosen3 = new Dosen("Iwan", 1215, 47);

        System.out.println();
        dosen1.info();
        System.out.println();
        dosen2.info();
        System.out.println();
        dosen3.info();
    }    
}
