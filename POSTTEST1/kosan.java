import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;

public class kosan {
    public static void main(String[] args) throws IOException {
        ArrayList<kamar> dataKamar = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Exit");
            System.out.print("Pilihan: ");
            String menu = br.readLine();

            if (menu.equals("1")) {
                System.out.println("Tambah Data");
                System.out.print("Masukkan Nama Penghuni: ");
                String namaPenghuni = br.readLine();
                System.out.print("Masukkan Nomor Kamar: ");
                int noKamar = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Jenis Kamar: ");
                String jenis = br.readLine();
                System.out.print("Masukkan Jumlah Penghuni Kamar: ");
                int jumlahPenghuni = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Tarif Kamar: ");
                int tarif = Integer.parseInt(br.readLine());

                kamar kamarNew = new kamar(namaPenghuni, jenis, noKamar, jumlahPenghuni, tarif);
                dataKamar.add(kamarNew);

            } else if (menu.equals("2")) {
                System.out.println("Lihat Data");
                for (int i = 0; i < dataKamar.size(); i++) {
                    System.out.println("Kamar ke-" + (i + 1));
                    dataKamar.get(i).tampil();
                    System.out.println("----------------");
                }

            } else if (menu.equals("3")) {
                System.out.println("Ubah Data");
                for (int i = 0; i < dataKamar.size(); i++) {
                    System.out.println("Kamar ke-" + (i + 1));
                    dataKamar.get(i).tampil();
                    System.out.println("----------------");
                }

                System.out.print("Mau ubah data nomor berapa:");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= dataKamar.size() && ubah > 0) {
                    System.out.print("Masukkan nama penghuni baru:");
                    dataKamar.get(ubah - 1).namaPenghuni = br.readLine();
                    System.out.print("Masukkan Nomor Kamar baru:");
                    dataKamar.get(ubah - 1).noKamar = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Jenis Kamar baru:");
                    dataKamar.get(ubah - 1).jenis = br.readLine();
                    System.out.print("Masukkan Jumlah Penghuni Kamar baru:");
                    dataKamar.get(ubah - 1).jumlahPenghuni = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Tarif Kamar baru:");
                    dataKamar.get(ubah - 1).tarif = Integer.parseInt(br.readLine());
                    System.out.println("\nBerhasil Ubah Data");

                } else {
                    System.out.println("Data tidak tersedia!");
                }

            } else if (menu.equals("4")) {
                System.out.println("Hapus Data");
                for (int i = 0; i < dataKamar.size(); i++) {
                    System.out.println("Kamar ke-" + (i + 1));
                    dataKamar.get(i).tampil();
                    System.out.println("----------------");
                }
                System.out.print("Mau hapus data nomor berapa:");
                int hapus = Integer.parseInt(br.readLine());

                if (hapus <= dataKamar.size() && hapus > 0) {
                    dataKamar.remove(hapus - 1);
                    System.out.println("Data berhasil dihapus");
                } else {
                    System.out.println("Data tidak tersedia");
                }

            } else if (menu.equals("0")) {
                System.out.println("Program telah berakhir");
                break;
            } else {
                System.out.println("Input Salah");
            }
        }
    }
}
