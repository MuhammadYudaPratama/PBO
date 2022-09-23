package Perbankan;

public class PengambilanUang extends Tabungan{
    public int proteksi;
        public PengambilanUang(int saldo){
            this.saldo=saldo;
        }
        public PengambilanUang(int saldo, int tingkatBunga){
            this.saldo=saldo;
            this.tingkatBunga=tingkatBunga;
        }
        public int getSaldo(){
            return saldo;
        }
        public boolean ambilUang(int jumlah){
            if (jumlah < saldo)
                return false;
            else jumlah = saldo - jumlah;
                return true;
        }
        public boolean ambil(int jumlah){
            if (jumlah > saldo)
                return false;
            else saldo = saldo - jumlah;
                return true;
        }
}
