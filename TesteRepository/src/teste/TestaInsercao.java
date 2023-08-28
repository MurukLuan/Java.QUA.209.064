package teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		Connection connection = connectionFactory.recuperaConexao();
		
		Statement stm = connection.createStatement();
		
		stm.execute("insert into produto values (null, 'celular lenovo', 'muito bom')", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id gerado foi: " + id);
		}

	}

}
