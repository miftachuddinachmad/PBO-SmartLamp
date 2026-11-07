package SmartLampPBO;

public class SmartLampKamar extends PerangkatLampu implements Konektivitas, KontrolWarna{
    private String warna;

    public SmartLampKamar(String idPerangkat, String nama){
        super(idPerangkat, nama); //pemanggilan super pada subclass
        this.warna="Putih";
    }

    @Override
    public void aturOtomatis(int cahayaluar){
        //percabangan
        if (cahayaluar<30){
            setMenyala(true);
            setKecerahan(100);
            System.out.println(getNama()+": Ruangan gelap, lampu menyala 100%");
        }else{
            setMenyala(false);
            setKecerahan(0);
            System.out.println(getNama()+": Ruangan terang, lampu mati");
        }
    }
    @Override
    public void tampilkanStatus(){
        //super chaining method
        super.tampilkanStatus();
        System.out.println("Warna cahaya: "+ warna);
    }
    //implementasi interface
    @Override
    public void hubungkanWiFi(boolean status){
        System.out.println(getNama()+ (status ? "terhubung WiFi" : "tidak terhubung WiFi"));
    }
    @Override
    public void ubahWarna(String warna){
        this.warna=warna;
        System.out.println(getNama()+" diubah warnanya menjadi "+warna);
    }

}
