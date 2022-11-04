public class Pegawai_bereaksi {
    public static void main(String[] args) {
        //Membuat Objek
        Manager manager = new Manager();
        manager.Nama = "Dadang";
        manager.GajiPokok = 6000000;
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("============================");
        Programmer programer = new Programmer();
        programer.Nama = "Aang";
        programer.GajiPokok = 5000000;
        programer.cetakinfo();
        programer.cetakBonus();
    }
}
