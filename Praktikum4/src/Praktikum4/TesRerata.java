package Praktikum4;

/**
 *
 * @author YudaPratam
 */
public class TesRerata {
    public static void main(String[] args) {
        RerataNilai rn = new RerataNilai();
        System.out.println("Rerata nilai 21 dan 13 adalah : "+rn.average(21, 13));
        System.out.println("Rerata nilai 19.3 dan 39.5 adalah : "+rn.average(19.3, 39.5));
        System.out.println("Rerata nilai 123, 576 dan 774 adalah : "+rn.average(123, 576, 744));
    } 
}
