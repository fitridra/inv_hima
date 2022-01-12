package tubes_sda;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class conn{
    private Connection conn;
    public static Connection getConnection()throws SQLException{
        Object conn = null;
        if (conn==null){
            Driver driver = new Driver();
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/inv_hima","root","");
        }
        return (Connection) conn;   
    }

public static void main(String[] args) {
   pilihanlogin kel4=new pilihanlogin();
   kel4.setVisible(true);
    }
}