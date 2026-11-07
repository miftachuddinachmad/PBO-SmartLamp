package SmartLampPBO;
//abstract class
abstract class PerangkatLampu {
    //konstanta global
    public static final String PROTOKOL="Miftach-Lampu";
    //konstanta atribut instan kekal
    private final String idPerangkat;

    //enkapsulasi
    private String nama;
    private boolean menyala;
    private int kecerahan;

    //overloading constructor 1
    public PerangkatLampu(String idPerangkat, String nama){
        this(idPerangkat, nama, false);
    }
    //overloading constructor 2
    public PerangkatLampu(String idPerangkat, String nama, boolean menyala){
       this.idPerangkat=idPerangkat;
       this.nama=nama;
       this.menyala=menyala;
       this.kecerahan=menyala?50:0;
    }

    //abstract method
    public abstract void aturOtomatis(int cahayaLuar);

    //method prosedur atau void
    public void tampilkanStatus(){
        System.out.println("["+idPerangkat+"] "+nama);
        System.out.println("Kondisi "+(menyala ? "on" : "off")+" dengan kecerahan "+kecerahan+"%");
    }

    //method fungsi(memiliki return)
    public int hitungDayaWatt(){
        return menyala ? (kecerahan*10)/100 : 0;
    }

    //getter setter
    public String getIdPerangkat(){
        return idPerangkat;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public boolean isMenyala() {
        return menyala;
    }
    public void setMenyala(boolean menyala) {
        this.menyala = menyala;
    }
    public int getKecerahan() {
        return kecerahan;
    }
    public void setKecerahan(int kecerahan){
        this.kecerahan=kecerahan;
    }
}
