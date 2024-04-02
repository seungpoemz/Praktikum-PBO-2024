import java.util.ArrayList;

public class lantai2 extends kamar {
    private String fasilitasTambahan;
    private double tarifTambahan;

    // Konstruktor pertama dengan tarifTambahan bertipe int
    public lantai2(String namaPenghuni, String fasilitasTambahan, int noKamar, int tarif, int tarifTambahan) {
        super(namaPenghuni, noKamar, tarif);
        this.fasilitasTambahan = fasilitasTambahan;
        this.tarifTambahan = tarifTambahan; 
    }

    // Overload konstruktor dengan tarifTambahan bertipe double
    public lantai2(String namaPenghuni, String fasilitasTambahan, int noKamar, int tarif, double tarifTambahan) {
        super(namaPenghuni, noKamar, tarif);
        this.fasilitasTambahan = fasilitasTambahan;
        this.tarifTambahan = tarifTambahan; 
    }

    // Metode getter dan setter untuk fasilitasTambahan dan tarifTambahan

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

    public void displayLantai2(ArrayList<? extends kamar> lantai) {
        System.out.println("Kamar Lantai 2 ");
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
}
