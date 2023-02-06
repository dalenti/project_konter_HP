import java.util.Scanner;
import java.sql.DriverManager;
import java.util.Random;

public class InsertData extends Connect {
    Scanner sc = new Scanner(System.in);

    public void tambahBarang() {

        System.out.print("Masukan Id barang  : ");
        int id_barang = sc.nextInt();
        System.out.print("Nama Barang : ");
        String nama = sc.next();
        System.out.print("Harga : ");
        int harga = sc.nextInt();
        System.out.print("Stok : ");
        int stok = sc.nextInt();

        try {
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);

            String query = "insert into barang values(?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setInt(1, id_barang);
            ps.setString(2, nama);
            ps.setInt(3, harga);
            ps.setInt(4, stok);

            if (ps.executeUpdate() > 0) {
                System.out.println("--------------------------------");
                System.out.println("Berhasil Insert Barang ");
            } else {
                System.out.println("Proses Insert gagal");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
