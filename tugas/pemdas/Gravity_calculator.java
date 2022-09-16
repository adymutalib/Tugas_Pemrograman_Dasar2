public class Gravity_calculator{
    public static void main(String[] args){
        //x(t) = 0.5 * at^2 + v(t) + x
        double gravity = -9.81; //Gravitasi Bumi (m/s^2) (a)
        double initialVelocity = 0.0; //Titik awal objek (t)
        double FallingTime = 10.0; // waktu jatuh dalam detik (v)
        double initialPosition = 0.0; // Posisi awal dalam meter, perhitungan akan menentukan posisi akhir dalam meter (x)
        double FinalPosition = 0.0 ; 

        double x = (0.5 * ((gravity*FallingTime)*(gravity*FallingTime) + (FallingTime*initialVelocity) + initialPosition));
        System.out.println("Hasil = "+ x);
    }
}