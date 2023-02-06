import java.util.Scanner;
import java.sql.DriverManager;

public class UpdateData extends Connect{
    public void updating(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukan Stok Terbaru: ");
            int stok = sc.nextInt();
            System.out.print("Masukan nama barang yang ingin diubah : ");
            String nama = sc.next();

            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "UPDATE barang SET stok = (?) WHERE nama = (?)";
            ps = con.prepareStatement(query);
            ps.setInt(1, stok);
            ps.setString(2, nama);

            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil");
            } else {
                System.out.println("Proses Update gagal");
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}