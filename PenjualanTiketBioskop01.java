import java.util.Scanner;

public class PenjualanTiketBioskop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        double diskon;
        double totalBayar;

        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = sc.nextInt();

        int i = 1;

        while (i <= jumlahPelanggan) {
            System.out.println("\nPelanggan ke-" + i);
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

            // Jika jumlah tiket negatif
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Masukkan ulang.");
                continue;
            }

            // Menghitung harga sebelum diskon
            double subtotal = jumlahTiket * hargaTiket;

            // Menentukan diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            // Menghitung total setelah diskon
            totalBayar = subtotal - (subtotal * diskon);

            // Menambahkan total penjualan
            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + totalBayar);

            i++;
        }

        System.out.println("\n===== REKAP PENJUALAN HARIAN =====");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }

}

