import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class kosan {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
    static ArrayList<lantai1> l1 = new ArrayList<>();
    static ArrayList<lantai2> l2 = new ArrayList<>();
    public static ArrayList<kamar> dataKamar = new ArrayList<>();

    public static void displayKamar() throws IOException{
        System.out.println("╔═════════════════════════╗");
        System.out.println("║        Lihat Kamar      ║");
        System.out.println("║   1. Lantai 1           ║");
        System.out.println("║   2. Lantai 2           ║");
        System.out.println("╚═════════════════════════╝");

        System.out.print("Input: ");
        String pilih = input.readLine();
        if("1".equals(pilih)){
            System.out.println("Kamar Lantai 1: ");
            if (l1.size() <1 ){
                System.out.println("Kamar Kosong!");
            } else {
                for (int i = 0; i<l1.size(); i++){
                    System.out.println("==========================");
                    System.out.println("Penghuni ke-" + (i + 1));
                    System.out.println("Nama: " + l1.get(i).getNama());
                    System.out.println("No. Kamar: " + l1.get(i).getnoKamar());
                    System.out.println("Fasilitas:" + l1.get(i).getfasilitas());
                    System.out.println("Tarif Kamar:" + l1.get(i).getTarif());
                    System.out.println("==========================");  
                }
            }
        } else if ("2".equals(pilih)){
            System.out.println("Kamar Lantai 2: ");
            if (l2.size() <1 ){
                System.out.println("Kamar Kosong!");
            } else {
                for (int i = 0; i<l2.size(); i++){
                    System.out.println("==========================");
                    System.out.println("Penghuni ke-" + (i + 1));
                    System.out.println("Nama: " + l2.get(i).getNama());
                    System.out.println("No. Kamar: " + l2.get(i).getnoKamar());
                    System.out.println("Tarif Kamar:" + l2.get(i).getTarif());
                    System.out.println("Fasilitas Tambahan:" + l2.get(i).getFasilitasTambahan());
                    System.out.println("Tarif Tambahan:" + l2.get(i).getTarifTambahan());
                    System.out.println("==========================");   
                }
            }
        }
    }

    public static void tambahKamar(BufferedReader br) throws IOException {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║          Tambah Kamar          ║");
        System.out.println("║   1. Tambah Kamar Lantai 1     ║");
        System.out.println("║   2. Tambah Kamar Lantai 2     ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.print("Input: ");

        String pilih = input.readLine();
        if("1".equals(pilih)){
            System.out.print("Masukkan Nama Penghuni: ");
            String namaPenghuni = br.readLine();
            System.out.print("Masukkan Nomor Kamar: ");
            int noKamar = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Tarif Kamar: ");
            int tarif = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Fasilitas (Kasur, Lemari, Kipas Angin): ");
            String fasilitas = br.readLine();
            lantai1 dataLantai1 = new lantai1 (namaPenghuni, fasilitas, noKamar, tarif);
            l1.add(dataLantai1);

        } else if ("2".equals (pilih)){
            System.out.print("Masukkan Nama Penghuni: ");
            String namaPenghuni = br.readLine();
            System.out.print("Masukkan Nomor Kamar: ");
            int noKamar = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Tarif Kamar: ");
            int tarif = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Fasilitas Tambahan (AC/Kulkas/TV): ");
            String fasilitasTambahan = br.readLine();
            System.out.print("Masukkan Tarif Tambahan: ");
            int tarifTambahan = Integer.parseInt(br.readLine());
            lantai2 dataLantai2 = new lantai2 (namaPenghuni, fasilitasTambahan, noKamar, tarif, tarifTambahan);
            l2.add(dataLantai2);
        }
    }

    public static void updateKamar(BufferedReader br) throws IOException {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║            Ubah Kamar           ║");
        System.out.println("║   1. Ubah Kamar Lantai 1        ║");
        System.out.println("║   2. Ubah Kamar Lantai 2        ║");
        System.out.println("╚════════════════════════════════=══╝");
        System.out.print("Input: ");
        String pilih = input.readLine();
    
        if ("1".equals(pilih)) {
            System.out.println("Masukkan nomor kamar yang ingin diupdate: ");
            int updateNo = Integer.parseInt(br.readLine());
            for (int i = 0; i < l1.size(); i++) {
                if (l1.get(i).getnoKamar() == updateNo) {
                    System.out.print("Masukkan nama penghuni baru:");
                    l1.get(i).setNama(br.readLine());
                    System.out.print("Masukkan Nomor Kamar baru:");
                    l1.get(i).setnoKamar(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Tarif Kamar baru:");
                    l1.get(i).setTarif(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Fasilitas Kamar baru:");
                    l1.get(i).setfasilitas(br.readLine());
                    System.out.println("-------------------------------------------------");
                    return;
                }
            }
            System.out.println("Nomor kamar tidak ditemukan");
        } else if ("2".equals(pilih)) {
           displayKamar();
            System.out.println("Masukkan nomor kamar yang ingin diupdate: ");
            int updateNo = Integer.parseInt(br.readLine());
    
            for (int i = 0; i < l2.size(); i++) {
                if (l2.get(i).getnoKamar() == updateNo) {
                    System.out.print("Masukkan nama penghuni baru:");
                    l2.get(i).setNama(br.readLine());
                    System.out.print("Masukkan Nomor Kamar baru:");
                    l2.get(i).setnoKamar(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Tarif Kamar baru:");
                    l2.get(i).setTarif(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Fasilitas Tambahan Kamar baru:");
                    l2.get(i).setFasilitasTambahan(br.readLine());
                    System.out.print("Masukkan Tarif Tambahan baru:");
                    l2.get(i).setTarifTambahan(Integer.parseInt(br.readLine()));
                    System.out.println("-------------------------------------------------");
                    return;
                }
            }
            System.out.println("Nomor kamar tidak ditemukan");
        } else {
            System.out.println("Input yang Anda masukkan tidak valid.");
        }
    }
    

    public static void hapusKamar(BufferedReader br) throws IOException {
        System.out.println("╔════════════════════╗");
        System.out.println("║      Hapus Kamar   ║");
        System.out.println("║   1. Lantai 1      ║");
        System.out.println("║   2. Lantai 2      ║");
        System.out.println("╚════════════════════╝");
        
        System.out.println("Input: ");
        String pilih = input.readLine();
        if("1".equals(pilih)){
            System.out.println("Kamar Lantai 1: ");
            if (l1.size() <1 ){
                System.out.println("Kamar Kosong!");
            } else {
                for (int i = 0; i<l1.size(); i++){
                    System.out.println("==========================");
                    System.out.println("Penghuni ke-" + (i + 1));
                    System.out.println("Nama: " + l1.get(i).getNama());
                    System.out.println("No. Kamar: " + l1.get(i).getnoKamar());
                    System.out.println("Fasilitas:" + l1.get(i).getfasilitas());
                    System.out.println("Tarif Kamar:" + l1.get(i).getTarif());
                    System.out.println("==========================");  
                }
                System.out.println("Pilih Nomor: ");
                int hapus = Integer.parseInt(input.readLine());
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i).getnoKamar() == hapus) {
                        l1.remove(i);
                        System.out.println("Data dengan Nomor Kamar-" + hapus + "berhasil dihapus");
                        return;
                    }
                }
                System.out.println("Nomor kamar tidak ditemukan");     
            }
        } else if ("2".equals(pilih)){
            System.out.println("Kamar Lantai 2: ");
            if (l2.size() <1 ){
                System.out.println("Kamar Kosong!");
            } else {
                for (int i = 0; i<l2.size(); i++){
                    System.out.println("==========================");
                    System.out.println("Penghuni ke-" + (i + 1));
                    System.out.println("Nama: " + l2.get(i).getNama());
                    System.out.println("No. Kamar: " + l2.get(i).getnoKamar());
                    System.out.println("Tarif Kamar:" + l2.get(i).getTarif());
                    System.out.println("Fasilitas Tambahan:" + l2.get(i).getFasilitasTambahan());
                    System.out.println("Tarif Tambahan:" + l2.get(i).getTarifTambahan());
                    System.out.println("==========================");   
                }
            }
            System.out.println("Pilih Nomor: ");
            int hapus = Integer.parseInt(input.readLine());
            for (int i = 0; i < l2.size(); i++) {
                if (l2.get(i).getnoKamar() == hapus) {
                    l2.remove(i);
                    System.out.println("Data dengan Nomor Kamar-" + hapus + "berhasil dihapus");
                    return;
                }
            }
            System.out.println("Nomor kamar tidak ditemukan");
            
        }
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("╔═════════════════════╗");
            System.out.println("║   ==== MENU ====    ║");
            System.out.println("║   1. Tambah Data    ║");
            System.out.println("║   2. Lihat Data     ║");
            System.out.println("║   3. Ubah Data      ║");
            System.out.println("║   4. Hapus Data     ║");
            System.out.println("║   0. Exit           ║");
            System.out.println("╚═════════════════════╝");
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