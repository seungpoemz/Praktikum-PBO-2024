import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class kosan {
    public static ArrayList<kamar> dataKamar = new ArrayList<>();

    public static void displayKamar() {
        for (int i = 0; i < dataKamar.size(); i++) {
            kamar kamar = dataKamar.get(i);
            System.out.println("==========================");
            System.out.println("Penghuni ke-" + (i + 1));
            System.out.println("Nama: " + kamar.getNama());
            System.out.println("No. Kamar: " + kamar.getnoKamar());
            System.out.println("Jenis Kamar:" + kamar.getJenis());
            System.out.println("Jumlah Penghuni:" + kamar.getJumPenghuni());
            System.out.println("Tarif Kamar:" + kamar.getTarif());
            System.out.println("==========================");
        }
    }

    public static void tambahKamar(BufferedReader br) throws IOException {
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
    }

    public static void updateKamar(BufferedReader br) throws IOException {
        displayKamar();
        System.out.println("Masukkan nomor kamar yang ingin diupdate: ");
        int updateNo = Integer.parseInt(br.readLine());

        for(int i = 0; i < dataKamar.size(); i++) {
            if (dataKamar.get(i).getnoKamar()==updateNo) {
                System.out.print("Masukkan nama penghuni baru:");
                dataKamar.get(i).setNama(br.readLine());

                System.out.print("Masukkan Nomor Kamar baru:");
                dataKamar.get(i).setnoKamar(Integer.parseInt(br.readLine()));

                System.out.print("Masukkan jenis kamar baru:");
                dataKamar.get(i).setJenis(br.readLine());

                System.out.print("Masukkan Jumlah Penghuni Kamar baru:");
                dataKamar.get(i).setJumPenghuni(Integer.parseInt(br.readLine()));

                System.out.print("Masukkan Tarif Kamar baru:");
                dataKamar.get(i).setTarif(Integer.parseInt(br.readLine()));

                System.out.println("-------------------------------------------------");
                return;
            }
        }
        System.out.println("Nomor kamar tidak ditemukan");
    }

    public static void hapusKamar(BufferedReader br) throws IOException {
        displayKamar();

        System.out.print("Masukkan Nomor Kamar yang ingin dihapus: ");
        int hapusNo = Integer.parseInt(br.readLine());

        for (int i = 0; i < dataKamar.size(); i++) {
            if (dataKamar.get(i).getnoKamar() == hapusNo) {
                dataKamar.remove(i);
                System.out.println("Data dengan Nomor Kamar-" +hapusNo+ "berhasil dihapus");
                return;
            }
        }
        System.out.println("Nomor kamar tidak ditemukan");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Exit");
            System.out.println("==============");
            System.out.print("Pilih: ");
            String menu = br.readLine();

            if (menu.equals("1")) {
                tambahKamar(br);
            } else if (menu.equals("2")) {
                displayKamar();
            } else if (menu.equals("3")) {
                updateKamar(br);
            } else if (menu.equals("4")) {
                hapusKamar(br);
            } else if (menu.equals("0")) {
                System.out.println("Program telah berakhir");
                break;
            } else {
                System.out.println("Input yang anda masukkan salah!");
            }
        }
    }
}
