import java.util.Scanner;  

public class SistemParkir15 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int jenis, durasi, total = 0;  

        while (true) {  
            System.out.print(" Masukkan jenis kendaraan\n1 untuk Mobil\n2 untuk Motor\n0 Keluar : ");  
            jenis = scanner.nextInt();  

            if (jenis == 0) {
                System.out.println("Berhasil keuar dari program");  
                break; 
            }  

            System.out.print("Input durasi (jam): ");  
            durasi = scanner.nextInt();  

            if (jenis == 1) {

                if (durasi > 5) {  
                    total += 12500; 
                } else {  
                    total += durasi * 3000;
                }  
            } else if (jenis == 2) {  
                if (durasi > 5) {  
                    total += 12500;
                } else {  
                    total += durasi * 2000; 
                }  
            } else {  
                System.out.println("Jenis kendaraan tidak valid.");  
            }  
        }  

        System.out.println("Total pembayaran parkir: Rp " + total);  
        scanner.close();  
    }  
}