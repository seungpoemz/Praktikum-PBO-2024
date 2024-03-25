public class kamar {
    private String namaPenghuni;
    private int noKamar, tarif;

    public kamar(String namaPenghuni, int noKamar, int tarif) {
        this.namaPenghuni = namaPenghuni;
        this.tarif = tarif;
        this.noKamar = noKamar;
    }
    
    void setNama (String namaPenghuni){
        this.namaPenghuni = namaPenghuni;
    }
    String getNama(){
        return this.namaPenghuni;
    }
    void setnoKamar (int noKamar){
        this.noKamar = noKamar;
    }
    int getnoKamar(){
        return this.noKamar;
    }
    void setTarif (int tarif){
        this.tarif = tarif;
    }
    int getTarif(){
        return this.tarif;
    }
}