public class kalku_gravitasi{
    public static void main(String[] args){
        //x(t) = 0.5 * at^2 + v(t) + x (Perhitungan untuk menentukan posisi akhir benda)
        double gravitasi = -9.81; // Gravitasi Bumi
        double VelositasAwal = 0.0; // Titik awal objek (v)
        double WaktuJatuh = 10.0; // Waktu jatuh dalam detik (t)
        double PosisiAwal = 0.0; // Posisi awal dalam meter
        

        double x = 0.5 * gravitasi*WaktuJatuh*WaktuJatuh + WaktuJatuh*VelositasAwal + PosisiAwal;
        System.out.println("Hasil = "+ x);
    }
}