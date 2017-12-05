import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
  
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			con = DriverManager.getConnection("jdbc:hsqldb:file:C:\\hsqldb\\", "SA", "");
			stmt = con.createStatement();
 
			result = stmt.executeQuery("SELECT * FROM USUARIO");
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt("ID")+" | "+
				               result.getString("NOMBRE"));
				}
			}
		
		}  catch (Exception e) {
			e.printStackTrace(System.out);
		}
		System.out.println("Conexion con BBDD con exito");
		
	}

}
