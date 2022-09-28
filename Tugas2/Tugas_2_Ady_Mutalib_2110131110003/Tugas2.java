import java.util.Scanner;
public class Tugas2{
public static void main(String[] args) {
    int data_a,data_b;
    String op;
    Scanner sc =new Scanner (System.in);
    
    System.out.print("Data A = ");
    data_a = sc.nextInt();
    System.out.print("Data B = ");
    data_b = sc.nextInt();
    
    System.out.print("Operator (+,x,/,-) = ");
    op =sc.next();
    switch (op){
    case "+":
        System.out.print("Hasil = ");
        System.out.println(data_a+data_b);
        break;
    case "-":
    	System.out.print("Hasil = ");
         System.out.println(data_a-data_b);
        break;
    case "x":
    	System.out.print("Hasil = ");
        System.out.println(data_a*data_b);
    case "/":
    	System.out.print("Hasil = ");
        System.out.println(data_a/data_b);
    default :
		// throw new RuntimeException("inputan tidak valid!");
	}
}
}
