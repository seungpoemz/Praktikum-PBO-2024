import java.util.ArrayList;

public class lantai1 extends kamar {
    private String fasilitas;

    public lantai1(String namaPenghuni, String fasilitas, int noKamar, int tarif) {
        super(namaPenghuni, noKamar, tarif);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return this.fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }


    @Override
    public void displayKamar(ArrayList<? extends kamar> lantai, int lantaiPilihan) {
        if (lantaiPilihan == 1) {
            displayLantai1(lantai);
        } else {
            System.out.println("Pilihan lantai tidak valid.");
        }
    }

        @Override
        public void displayLantai1(ArrayList<? extends kamar> lantai) {
        if (lantai.size() < 1) {
            System.out.println("Kamar Kosong!");
        } else {
            for (int i = 0; i < lantai.size(); i++) {
                System.out.println("==========================");
                System.out.println("Penghuni ke-" + (i + 1));
                System.out.println("Nama: " + lantai.get(i).getNama());
                System.out.println("No. Kamar: " + lantai.get(i).getNoKamar());
                System.out.println("Fasilitas: " + ((lantai.get(i) instanceof lantai1) ? ((lantai1) lantai.get(i)).getFasilitas() : ""));
                System.out.println("Tarif Kamar: " + lantai.get(i).getTarif());
                System.out.println("==========================");
            }
        }
    }

    @Override
    public void displayLantai2(ArrayList<? extends kamar> lantai) {
        
    }
}