import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 'selesai' atau 'batal' untuk keluar): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("selesai") ) {
                System.out.println("Pemesanan Telah Selesai");
                break;
            }else if(input.equalsIgnoreCase("batal")){
                System.out.println("Pemesanan Telah Dibatalkan");
                break;
            }

            int jumlahTiket;
                jumlahTiket = Integer.parseInt(input);

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, coba lagi.");
                continue;
            }

            int hargaPerTiket = 50000;
            int hargaTotal = jumlahTiket * hargaPerTiket;

            if (jumlahTiket > 10) {
                hargaTotal -= hargaTotal * 0.15;
            } 
            else if (jumlahTiket > 4) {
                hargaTotal -= hargaTotal * 0.10;
            }

            System.out.println("Total harga tiket: Rp " + hargaTotal);
            totalHarga += hargaTotal;
            System.out.println("Total penjualan tiket hari ini: Rp. " + totalHarga);
        }
    }
}