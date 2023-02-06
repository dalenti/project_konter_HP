import java.sql.DriverManager;

public class DeleteData extends Connect {
    static int nim;

    public void keluar() {
        int i = 0;

        try {
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "delete from tbl_mahasiswa where nim = (?) ";
            ps = con.prepareStatement(query);
            ps.setInt(1, nim);

            if (ps.executeUpdate() > 0) {
                System.out.println("Mengundurkan diri Berhasil, Dadah...");
            } else {
                System.out.println("Data tidak ditemukan");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}