package SmartLampPBO;

public class SmartLampTeras extends PerangkatLampu{
    public SmartLampTeras(String idPerangkat, String nama){
        super(idPerangkat, nama);
    }
    @Override
    public void aturOtomatis(int cahayaLuar){
        if (cahayaLuar<50){
            setMenyala(true);
            setKecerahan(80);
            System.out.println(getNama()+": Hari mulai malam, lampu teras dinyalakan 80%");
        }else{
            setMenyala(false);
            setKecerahan(0);
            System.out.println(getNama()+": Siang hari, lampu teras dimatikan");
        }
    }
}
