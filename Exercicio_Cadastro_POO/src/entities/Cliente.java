package entities;

public class Cliente {
	public String nome;
	public String endereco;
	public String telefone;
	public String dataNascimento;
	public String cpf;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + "\n" +
				endereco + "\n" +
				telefone +"\n" +
				dataNascimento + " \n" +
				cpf + "\n" ;
	}
}
