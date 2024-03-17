public class kamar {
    String namaPenghuni, jenis;
    int noKamar, jumlahPenghuni, tarif;
    public kamar(String namaPenghuni, String jenis, int noKamar, int jumlahPenghuni, int tarif) {
        this.namaPenghuni = namaPenghuni;
        this.jenis = jenis;
        this.noKamar = noKamar;
        this.jumlahPenghuni = jumlahPenghuni;
        this.tarif = tarif;
    }
    void tampil (){
        System.out.println ("Nama Penghuni: "+ this.namaPenghuni);
        System.out.println ("No Kamar: "+ this.noKamar);
        System.out.println ("Jenis Kamar: "+ this.jenis);
        System.out.println ("Jumlah Penghuni: "+ this.jumlahPenghuni);
        System.out.println ("Tarif Kamar: "+ this.tarif);
    }
}
