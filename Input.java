import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String inputNama = "Nama saya "+scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String inputAlamat = "Saya tinggal di "+scanner.nextLine();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();
        int usia = 2023 - tahunLahir;
        String inputTahunLahir = "Usia saya "+usia+" Tahun";
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("Data Diri.txt")))) {
            writer.println(inputNama);
            writer.println(inputAlamat);
            writer.println(inputTahunLahir);
            if (usia <= 18){
                writer.println("Karena masih muda, maka saya Unyu");
            } else {
                writer.println("Karena sudah tua, sepertinya saya perlu banyak berserah diri");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
