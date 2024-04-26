import java.util.ArrayList;

public abstract class kamar {
    private String namaPenghuni;
    private int noKamar, tarif;

    public kamar(String namaPenghuni, int noKamar, int tarif) {
        this.namaPenghuni = namaPenghuni;
        this.tarif = tarif;
        this.noKamar = noKamar;
    }

    public void setNama(String namaPenghuni) {
        this.namaPenghuni = namaPenghuni;
    }

    public String getNama() {
        return this.namaPenghuni;
    }

    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

    public int getNoKamar() {
        return this.noKamar;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getTarif() {
        return this.tarif;
    }

    public abstract void displayKamar(ArrayList<? extends kamar> lantai, int lantaiPilihan);

    public abstract void displayLantai1(ArrayList<? extends kamar> lantai);

    public abstract void displayLantai2(ArrayList<? extends kamar> lantai);
}
