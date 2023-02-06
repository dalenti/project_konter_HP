import java.sql.DriverManager;
import java.util.Scanner;

public class ShowData extends Connect {
    static int nim;
    Scanner sc = new Scanner(System.in);
    // Method Menampilkan data mahasiswa yang telah mengambil sks
    public void showUser() {
        int i = 0;
        try {
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            state = con.createStatement();
            String query = "select * from user";
            rs = state.executeQuery(query);

            while (rs.next()) {
                i++;
                System.out.println("-------------------------------------------");
                System.out.println("No : " + i);
                System.out.println("ID user : " + rs.getInt("id_user"));
                System.out.println("Nama : " + rs.getString("username"));
                System.out.println("-------------------------------------------");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void showRelevan() {
        int i = 0;
        try {

            System.out.print("Cari barang apa berdasarkan nama ? : ");
            String nama = sc.next();

            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            // state = con.createStatement();
            String query = "select * from barang where nama like ?";
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + nama + "%");
            rs = ps.executeQuery();


            while (rs.next()) {
                i++;
                System.out.println("-------------------------------------------");
                System.out.println("No : " + i);
                System.out.println("Nama Barang : " + rs.getString("nama"));
                System.out.println("-------------------------------------------");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
