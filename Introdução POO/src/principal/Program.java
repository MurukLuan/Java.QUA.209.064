package principal;

import entities.Pessoa;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		//Pessoa pessoa1 = new Pessoa();
		
		pessoa.nome = "Luan";
		//pessoa.idade = 31;
		pessoa.cpf = "001.002.003.10";
		pessoa.sexo = 'M';
		
		pessoa.retornaIdade(1990);
		
		System.out.println(pessoa);
		
		// faça uma classe carro que receba 
		// suas caracteristicas como:
		// modelo, cor, placa, tipo do cambio
		// crie 2 instancias e imprima ma tela

	}

}
