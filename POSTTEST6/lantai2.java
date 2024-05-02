import java.util.ArrayList;

public class lantai2 extends kamar {
    private String fasilitasTambahan;
    private double tarifTambahan;

    public lantai2(String namaPenghuni, String fasilitasTambahan, int noKamar, int tarif, int tarifTambahan) {
        super(namaPenghuni, noKamar, tarif);
        this.fasilitasTambahan = fasilitasTambahan;
        this.tarifTambahan = tarifTambahan; 
    }

    public lantai2(String namaPenghuni, String fasilitasTambahan, int noKamar, int tarif, double tarifTambahan) {
        super(namaPenghuni, noKamar, tarif);
        this.fasilitasTambahan = fasilitasTambahan;
        this.tarifTambahan = tarifTambahan; 
    }

    public String getFasilitasTambahan() {
        return fasilitasTambahan;
    }

    public void setFasilitasTambahan(String fasilitasTambahan) {
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public double getTarifTambahan() {
        return tarifTambahan;
    }

    public void setTarifTambahan(double tarifTambahan) {
        this.tarifTambahan = tarifTambahan;
    }

    @Override
    public void displayKamar(ArrayList<? extends kamar> lantai, int lantaiPilihan) {
        if (lantaiPilihan == 2) {
            displayLantai2(lantai);
        } else {
            System.out.println("Pilihan lantai tidak valid.");
        }
    }

    @Override
    public void displayLantai2(ArrayList<? extends kamar> lantai) {
        if (lantai.size() < 1) {
            System.out.println("Kamar Kosong!");
        } else {
            for (int i = 0; i < lantai.size(); i++) {
                 System.out.println("==========================");
                System.out.println("Penghuni ke-" + (i + 1));
                System.out.println("Nama: " + lantai.get(i).getNama());
                System.out.println("No. Kamar: " + lantai.get(i).getNoKamar());
                System.out.println("Tarif Kamar: " + lantai.get(i).getTarif());
                System.out.println("Fasilitas Tambahan: " + ((lantai.get(i) instanceof lantai2) ? ((lantai2) lantai.get(i)).getFasilitasTambahan() : ""));
                System.out.println("Tarif Tambahan: " + ((lantai.get(i) instanceof lantai2) ? ((lantai2) lantai.get(i)).getTarifTambahan() : ""));
                System.out.println("==========================");
            }
        }
    }

    @Override
    public void displayLantai1(ArrayList<? extends kamar> lantai) {

    }
}