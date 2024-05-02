import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public final class kosan implements tatibKos {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<lantai1> l1 = new ArrayList<>();
    public static ArrayList<lantai2> l2 = new ArrayList<>();
    public static ArrayList<kamar> dataKamar = new ArrayList<>();
    

    @Override
    public void tataTertib() {
        System.out.println("Tatib Kosan:");
        System.out.println("- Waktu malam: Penghuni diminta untuk tidak berisik agar tidak mengganggu istirahat penghuni lain.");
        System.out.println("- Kebersihan: Penghuni diharapkan untuk menjaga kebersihan kamar dan lingkungan kosan.");
        System.out.println("- Kunjungan: Penghuni diharapkan memberitahukan kehadiran tamu kepada pengelola kosan.");
    }

    @Override
    public void konsekuensiTatib() {
        System.out.println("Pelanggaran terhadap aturan kosan akan memiliki konsekuensi sebagai berikut:");
        System.out.println("- Peringatan tertulis.");
        System.out.println("- Denda atau penalti sesuai dengan tingkat pelanggaran.");
        System.out.println("- Penonaktifan fasilitas atau layanan kosan.");
    }

    public static final void displayKamar() throws IOException {
        System.out.println("╔═════════════════════════╗");
        System.out.println("║        Lihat Kamar      ║");
        System.out.println("║   1. Lantai 1           ║");
        System.out.println("║   2. Lantai 2           ║");
        System.out.println("╚═════════════════════════╝");
    
        System.out.print("Input: ");
        String pilih = input.readLine();
    
        if ("1".equals(pilih)) {
            if (l1.size() < 1) {
                System.out.println("Kamar Kosong!");
            } else {
                System.out.println("Kamar Lantai 1 ");
                lantai1 lantaiSatu = new lantai1("", "", 0, 0);
                lantaiSatu.displayLantai1(l1);
            }
        } else if ("2".equals(pilih)) {
            if (l2.size() < 1) {
                System.out.println("Kamar Kosong!");
            } else {
                System.out.println("Kamar Lantai 2 ");
                lantai2 lantaiDua = new lantai2("", "", 0, 0, 0);
                lantaiDua.displayLantai2(l2);
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
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║              Ubah Kamar          ║");
        System.out.println("║     1. Ubah Kamar Lantai 1       ║");
        System.out.println("║     2. Ubah Kamar Lantai 2       ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.print("Input: ");
        String pilih = input.readLine();
    
        if ("1".equals(pilih)) {

            System.out.print("Masukkan nomor kamar yang ingin diupdate: ");
            int updateNo = Integer.parseInt(br.readLine());
            for (int i = 0; i < l1.size(); i++) {
                if (l1.get(i).getNoKamar() == updateNo) {
                    System.out.print("Masukkan nama penghuni baru:");
                    l1.get(i).setNama(br.readLine());
                    System.out.print("Masukkan Nomor Kamar baru:");
                    l1.get(i).setNoKamar(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Tarif Kamar baru:");
                    l1.get(i).setTarif(Integer.parseInt(br.readLine()));
                    System.out.print("Masukkan Fasilitas Kamar baru:");
                    l1.get(i).setFasilitas(br.readLine());
                    System.out.println("-------------------------------------------------");
                    return;
                }
            }
            System.out.println("Nomor kamar tidak ditemukan");
        } else if ("2".equals(pilih)) {
            System.out.print("Masukkan nomor kamar yang ingin diupdate: ");
            int updateNo = Integer.parseInt(br.readLine());
    
            for (int i = 0; i < l2.size(); i++) {
                if (l2.get(i).getNoKamar() == updateNo) {
                    System.out.print("Masukkan nama penghuni baru:");
                    l2.get(i).setNama(br.readLine());
                    System.out.print("Masukkan Nomor Kamar baru:");
                    l2.get(i).setNoKamar(Integer.parseInt(br.readLine()));
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
        
        System.out.print("Input: ");
        String pilih = input.readLine();
        if("1".equals(pilih)){
            System.out.println("Kamar Lantai 1: ");
            if (l1.size() <1 ){
                System.out.println("Kamar Kosong!");
            } else {
                for (int i = 0; i<l1.size(); i++){
                    // l1.get(i).displayLantai1();
                }
                System.out.print("Pilih Nomor: ");
                int hapus = Integer.parseInt(input.readLine());
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i).getNoKamar() == hapus) {
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
                    // l2.get(i).displayKamar();
                }
            }
            System.out.print("Pilih Nomor: ");
            int hapus = Integer.parseInt(input.readLine());
            for (int i = 0; i < l2.size(); i++) {
                if (l2.get(i).getNoKamar() == hapus) {
                    l2.remove(i);
                    System.out.println("Data dengan Nomor Kamar-" + hapus + "berhasil dihapus");
                    return;
                }
            }
            System.out.println("Nomor kamar tidak ditemukan");
            
        }
        
    }
    public static void displayTatib(BufferedReader br, kosan myKosan) throws IOException {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           TATA TERTIB KOSAN          ║");
        System.out.println("║   1. Lihat Tatib Kosan               ║");
        System.out.println("║   2. Lihat Konsekuensi Pelanggaran   ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print("Pilih: ");
        String subMenu = br.readLine();
    
        if (subMenu.equals("1")) {

            myKosan.tataTertib();

        } else if (subMenu.equals("2")) {
            
            myKosan.konsekuensiTatib();

        } else {
            System.out.println("Input yang anda masukkan salah!");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        kosan myKosan = new kosan(); 

        while (true) {
            System.out.println("╔═════════════════════╗");
            System.out.println("║   ==== MENU ====    ║");
            System.out.println("║   1. Tambah Data    ║");
            System.out.println("║   2. Lihat Data     ║");
            System.out.println("║   3. Ubah Data      ║");
            System.out.println("║   4. Hapus Data     ║");
            System.out.println("║   5. Tatib Kos      ║");
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
            } else if (menu.equals("5")) {
                displayTatib(br, myKosan);
            } else if (menu.equals("0")) {
                System.out.println("Program telah berakhir");
                break;
            } else {
                System.out.println("Input yang anda masukkan salah!");
            }
        }
    }
}