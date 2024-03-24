class PersegiPanjang {
    private int panjang;
    private int lebar;

    public PersegiPanjang() {
        panjang = 0;
        lebar = 0;
    }

    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(); 
        PersegiPanjang pp2 = new PersegiPanjang(30, 40); 
        PersegiPanjang pp3 = new PersegiPanjang(25, 35); 

        pp1.setPanjang(1);
        pp1.setLebar(1);

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
