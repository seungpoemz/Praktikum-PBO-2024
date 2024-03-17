public class kamar {
    private String namaPenghuni, jenis;
    private int noKamar, jumlahPenghuni, tarif;

    public kamar(String namaPenghuni, String jenis, int noKamar, int jumlahPenghuni, int tarif) {
        this.namaPenghuni = namaPenghuni;
        this.jenis = jenis;
        this.noKamar = noKamar;
        this.jumlahPenghuni = jumlahPenghuni;
        this.tarif = tarif;
    }
    
    void setNama (String namaPenghuni){
        this.namaPenghuni = namaPenghuni;
    }
    String getNama(){
        return this.namaPenghuni;
    }
    void setJenis (String jenis){
        this.jenis = jenis;
    }
    String getJenis(){
        return this.jenis;
    }
    void setnoKamar (int noKamar){
        this.noKamar = noKamar;
    }
    int getnoKamar(){
        return this.noKamar;
    }
    void setJumPenghuni (int jumlahPenghuni){
        this.jumlahPenghuni = jumlahPenghuni;
    }
    int getJumPenghuni(){
        return this.jumlahPenghuni;
    }
    void setTarif (int tarif){
        this.tarif = tarif;
    }
    int getTarif(){
        return this.tarif;
    }
}
