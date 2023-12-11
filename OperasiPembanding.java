public class OperasiPembanding {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean hasilXLebihDariY = (x > y); // false
        System.out.println(hasilXLebihDariY);

        boolean hasilXKurangDariY = (x < y); // true
        System.out.println(hasilXKurangDariY);

        boolean hasilXSamaDenganY = (x == y); // false
        System.out.println(hasilXSamaDenganY);

        boolean hasilXTidakSamaDenganY = (x != y); // true
        System.out.println(hasilXTidakSamaDenganY);

        boolean hasilXLebihDariSamaDenganY = (x >= y); // false
        System.out.println(hasilXLebihDariSamaDenganY);

        boolean hasilXKurangDariSamaDenganY = (x <= y); // true
        System.out.println(hasilXKurangDariSamaDenganY);
    }
}
