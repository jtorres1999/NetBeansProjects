
import java.sql.Connection;
import java.sql.DriverManager;


public class conex {
    Connection con;
    public conex() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db=registro","root","Aa012345678");
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
}
}
