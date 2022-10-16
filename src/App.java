import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        linked x = new linked();
        do {
            System.out.println("\n");
            System.out.println("1. Tambah lagu ke playlist");
            System.out.println("2. Cek playlist");
            System.out.println("3. Hapus list");
            System.out.print("masukkan input >> ");
            int option = input.nextInt();
            if (option == 1) {
                System.out.print("Masukkan nama lagu: ");
                String data = input.next();
                x.tambahBelakang(data);
            } else if (option == 2) {
                x.print();
            } else if (option == 3) {
                System.out.println("1.Hapus list depan");
                System.out.println("2.Hapus list belakang");
                option = input.nextInt();
                if (option == 1) {
                    x.hapusDepan();
                } else if (option == 2) {
                    x.hapusBelakang();
                }
            }
        } while (true);
    }
}
