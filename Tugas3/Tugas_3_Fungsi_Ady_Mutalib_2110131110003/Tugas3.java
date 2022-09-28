// Tugas kalkulator menjadi Fungsi

import java.util.Scanner;

public class Tugas3{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String operasi;
        double first, two, hasil;


        System.out.print("Masukkan bilangan pertama = "); 
        first = keyboard.nextInt();
        
        System.out.print("Masukkan bilangan kedua = ");
        two = keyboard.nextInt();

        System.out.print("operasi (+, -, x, /) = ");
        operasi = keyboard.next();
        
            switch(operasi){
                case "+":                           
                    hasil = penjumlahan(first, two);
                    System.out.println(first + " + " + two + " = " + hasil);
                    break;
                case "-":                           
                    hasil = pengurangan(first, two);
                    System.out.println(first + " - " + two + " = " + hasil);
                    break;
                case "x":                           
                    hasil = perkalian(first, two);
                    System.out.println(first + " x " + two + " = " + hasil);
                    break;
                case "/":                           
                    hasil = pembagian(first, two);
                    System.out.println(first + " / " + two + " = " + hasil);
                    break;
                default:
                    System.out.println("Operasi tidak ada!!!");
                // default:
            
        }

    }
    static double penjumlahan(double x, double y){
        double hasil;
        hasil = x + y;
        return hasil;
    }
        static double pengurangan(double x, double y){
        double hasil;
        hasil = x - y;
        return hasil;
    }
        static double perkalian(double x, double y){
        double hasil;
        hasil = x * y;
        return hasil;
    }
        static double pembagian(double x, double y){
        double hasil;
        hasil = x / y;
        return hasil;
    }
}