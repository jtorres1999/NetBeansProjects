
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
            sr=st.executeQuery("select * from fabricante");
            while (sr.next()) {                
                System.out.println(sr.getString("Nombre")+" "+sr.getInt("id")+" "+sr.getString("Profesion"));
            }
            cone.con.close();
        } catch (Exception e) {
        }
    }
    
}
