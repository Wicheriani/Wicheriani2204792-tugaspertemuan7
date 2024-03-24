class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Constructor tanpa parameter
    public PersegiPanjang() {
        panjang = 0;
        lebar = 0;
    }

    // Constructor dengan parameter
    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

    // Getter untuk luas
    public int getLuas() {
        return panjang * lebar;
    }

    // Getter untuk keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    // Setter untuk panjang
    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    // Setter untuk lebar
    public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        // Membuat tiga objek PersegiPanjang
        PersegiPanjang pp1 = new PersegiPanjang(); // PersegiPanjang dengan panjang dan lebar default
        PersegiPanjang pp2 = new PersegiPanjang(30, 40); // PersegiPanjang dengan panjang 5 dan lebar 3
        PersegiPanjang pp3 = new PersegiPanjang(25, 35); // PersegiPanjang dengan panjang dan lebar default

        // Mengatur panjang dan lebar untuk pp1
        pp1.setPanjang(1);
        pp1.setLebar(1);

        // Menampilkan luas dan keliling dari masing-masing PersegiPanjang
        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
        System.out.println();

        System.out.println("Persegi Panjang 2:");
        System.out.println("Luas: " + pp2.getLuas());
        System.out.println("Keliling: " + pp2.getKeliling());
        System.out.println();

        System.out.println("Persegi Panjang 3:");
        System.out.println("Luas: " + pp3.getLuas());
        System.out.println("Keliling: " + pp3.getKeliling());
    }
}
