import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/nama_database";
    static final String username = "root";
    static final String password = "";

    static Connection con;
    static ResultSet rs;
    static Statement state;
    static PreparedStatement ps;

}