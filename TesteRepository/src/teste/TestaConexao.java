package teste;

import java.sql.Connection;

import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conection = connectionFactory.recuperaConexao();
				
		conection.close();
	}

}
