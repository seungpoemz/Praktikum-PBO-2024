public class lantai2 extends kamar {
    private String fasilitasTambahan;
    private int tarifTambahan;

    public lantai2(String namaPenghuni, String fasilitasTambahan, int noKamar, int tarif, int tarifTambahan) {
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
    public int getTarifTambahan() {
        return tarifTambahan;
    }

    public void setTarifTambahan(int tarifTambahan) {
        this.tarifTambahan = tarifTambahan;
    }
}
