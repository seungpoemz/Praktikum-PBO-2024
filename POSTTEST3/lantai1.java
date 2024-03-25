public class lantai1 extends kamar {
    private String fasilitas;



    public lantai1(String namaPenghuni, String fasilitas, int noKamar, int tarif) {
        super(namaPenghuni, noKamar, tarif);
        this.fasilitas = fasilitas;
    }

    public String getfasilitas() {
        return fasilitas;
    }

    public void setfasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
}


