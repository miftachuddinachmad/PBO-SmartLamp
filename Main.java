package SmartLampPBO;

public class Main {
    public static void main(String[] args){
        System.out.println("Simulasi SmartLamp Protokol: "+PerangkatLampu.PROTOKOL);

        //intansiasi subclass
        SmartLampKamar lampuKamar=new SmartLampKamar("L01", "Lampu Kamar");
        SmartLampTeras lampuTeras=new SmartLampTeras("L02", "Lampu Teras");

        System.out.println("---Status Awal---");
        lampuKamar.tampilkanStatus();
        lampuTeras.tampilkanStatus();

        System.out.println("\n---Atur Otomatis Memakai Percabangan dan Abstract Method---");
        lampuKamar.aturOtomatis(20);
        lampuTeras.aturOtomatis(70);

        System.out.println("\n---Multiple Interface dan Return---");
        lampuKamar.ubahWarna("Kuning Hangat");
        System.out.println("Konsumsi Daya dari "+lampuKamar.getNama()+"adalah "+lampuKamar.hitungDayaWatt()+" Watt");

        System.out.println("\n---Poimorfisme Interface---");
        Konektivitas konekWiFi=lampuKamar;
        konekWiFi.hubungkanWiFi(true);

        //method getter dan setter
        System.out.println("\n---Detail Status Lampu Kamar---");
        System.out.println("ID Perangkat : "+lampuKamar.getIdPerangkat());
        System.out.println("Status Menyala: "+lampuKamar.isMenyala());
        System.out.println("Tingkat Kecerahan: "+lampuKamar.getKecerahan() + "%");
        lampuKamar.setNama("Lampu Kamar Tidur Utama");
        System.out.println("Nama Baru: "+lampuKamar.getNama());

        System.out.println("\n---Status Akhir---");
        lampuTeras.setMenyala(true);
        lampuTeras.setKecerahan(49);
        lampuKamar.tampilkanStatus();
        lampuTeras.tampilkanStatus();
    }
}
