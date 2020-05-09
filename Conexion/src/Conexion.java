
import java.sql.ResultSet;
import java.sql.Statement;


public class Conexion {

    public static void main(String[] args) {
        // TODO code application logic here
        conex cone=new conex();
        Statement st;
        ResultSet sr;
        try {
            st=cone.con.createStatement();
            sr=st.executeQuery("select * from persona");
            while (sr.next()) {                
                System.out.println(sr.getInt("id")+" "+sr.getString("Dni")+" "+sr.getString("Nombre"));
            }
            cone.con.close();
        } catch (Exception e) {
        }
    }
    
}
