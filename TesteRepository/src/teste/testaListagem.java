package teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conection = connectionFactory.recuperaConexao();
		
		//gera o estado de conexão
		Statement stm = conection.createStatement();
		//cria uma execução de consulta que retorna true
		stm.execute("select * from produto");
		
		//apartir do nosso resultado precisamos salvar a lista que foi gerada no retorno do stm.execute
		ResultSet resultado = stm.getResultSet();
		//precisamos de um laço de repetição para passar todos os itens que o foi retornado em resultado
		while(resultado.next()) {
			//cria uma variavel para cada tipo de retorno
			Integer id = resultado.getInt("id");
			//imprime o resultado
			System.out.println(id);
			String nome = resultado.getString("nome");
			System.out.println(nome);
			String descricao = resultado.getString("descricao");
			System.out.println(descricao);
		}
		
		conection.close();

	}

}
