import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class kamar {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<lantai1> l1 = new ArrayList<>();
    static ArrayList<lantai2> l2 = new ArrayList<>();
    private String namaPenghuni;
    private int noKamar, tarif;

    public kamar(String namaPenghuni, int noKamar, int tarif) {
        this.namaPenghuni = namaPenghuni;
        this.tarif = tarif;
        this.noKamar = noKamar;
    }

    void setNama(String namaPenghuni) {
        this.namaPenghuni = namaPenghuni;
    }

    String getNama() {
        return this.namaPenghuni;
    }

    void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

    int getNoKamar() {
        return this.noKamar;
    }

    void setTarif(int tarif) {
        this.tarif = tarif;
    }

    int getTarif() {
        return this.tarif;
    }

    protected void displayKamar(ArrayList<? extends kamar> lantai, int lantaiPilihan) {
        if (lantaiPilihan == 1) {
            displayLantai1(lantai);
        } else if (lantaiPilihan == 2) {
            displayLantai2(lantai);
        } else {
            System.out.println("Pilihan lantai tidak valid.");
        }
    }

    private void displayLantai1(ArrayList<? extends kamar> lantai) {
        // Implementasi display untuk lantai 1
        System.out.println("Kamar Lantai 1 ");
        if (l1.size() < 1) {
            System.out.println("Kamar Kosong!");
        } else {
            for (int i = 0; i < l1.size(); i++) {
                System.out.println("==========================");
                System.out.println("Penghuni ke-" + (i + 1));
                System.out.println("Nama: " + l1.get(i).getNama());
                System.out.println("No. Kamar: " + l1.get(i).getNoKamar());
                // Perhatikan bahwa l1 tidak memiliki metode getfasilitas() dan getFasilitasTambahan()
                // Ini harus disesuaikan dengan atribut dan metode yang ada di kelas lantai1
                System.out.println("Fasilitas: " + l1.get(i).getFasilitas());
                System.out.println("Tarif Kamar: " + l1.get(i).getTarif());
                System.out.println("==========================");
            }
        }
    }

    private void displayLantai2(ArrayList<? extends kamar> lantai) {
        // Implementasi display untuk lantai 2
        System.out.println("Kamar Lantai 2 ");
        if (l2.size() < 1) {
            System.out.println("Kamar Kosong!");
        } else {
            for (int i = 0; i < l2.size(); i++) {
                System.out.println("==========================");
                System.out.println("Penghuni ke-" + (i + 1));
                System.out.println("Nama: " + l2.get(i).getNama());
                System.out.println("No. Kamar: " + l2.get(i).getNoKamar());
                System.out.println("Tarif Kamar: " + l2.get(i).getTarif());
                System.out.println("Fasilitas Tambahan: " + l2.get(i).getFasilitasTambahan());
                System.out.println("Tarif Tambahan: " + l2.get(i).getTarifTambahan());
                System.out.println("==========================");
            }
        }
    }
}
