package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperaConexao() throws SQLException {
		return DriverManager.getConnection
				("jdbc:mysql://localhost/testando?useTimezone=true&serverTimezone=UTC", "root", "Senai@123");
	}

}
