import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
	public static Connection getConexion(){

		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://192.168.64.149/puntodeventa";
			String usuario = "twk";
			String contrasenia ="twk";
			
			con = DriverManager.getConnection(url,usuario,contrasenia);
			
			
			System.out.println("exito");
			
		} catch (ClassNotFoundException e) {
			System.out.println("error al cargar driver");
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("error base de datos");
			e.printStackTrace();
		}
		
		return null;}

}
