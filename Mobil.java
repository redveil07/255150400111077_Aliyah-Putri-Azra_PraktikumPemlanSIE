public class Mobil {

    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private int JarakTempuh;

    public void setNopol(String n) {
        nopol = n;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setMerk(String m) {
        merk = m;
    }

    public void setKecepatan(int k) {
        kecepatan = k;
    }

    public void setJarakTempuh(int j) {
        JarakTempuh = j;
    }

    public void HitungJarakTempuh(int waktu) {
        JarakTempuh = kecepatan * waktu;
    }

    public void kecepatanpersecond() {
    double KecepatanPerSecond = kecepatan*1000/3600;        
    System.out.println("Mobil bergerak dalam kecepatan " + KecepatanPerSecond + " mps");

    }



    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
        System.out.println("jarak yang ditempuh " + JarakTempuh + " km");
    }
}
