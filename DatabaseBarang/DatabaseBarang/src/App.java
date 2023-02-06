import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ShowData show = new ShowData();
        InsertData insert = new InsertData();
        UpdateData update = new UpdateData();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Sistem Database Konter HP ");
        System.out.println("--------------------------------");
        System.out.println("1. Tampilkan Data User");
        System.out.println("2. Mencari Barang");
        System.out.println("3. Masukan Data Barang");
        System.out.println("4. Update Stok Barang");
        System.out.println("--------------------------------");
        System.out.print("Pilih Menu : ");
        int input = sc.nextInt();

        if (input == 1) {
            show.showUser();
        }else if(input == 2){
            show.showRelevan();
        }else if(input == 3){
           insert.tambahBarang();
        }else if(input == 4){
            update.updating();
         }else {
            System.out.println("Inputan Tidak Valid");
        }
    }
}
