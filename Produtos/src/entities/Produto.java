package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	private String categoria;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double valorEmEstoque()
	{
		return quantidade * preco;
	}
	
	public int adicionaProduto(int quantidade) {
		return this.quantidade += quantidade;
	}
	
	public int removeProduto(int quantidade) {
		return this.quantidade -= quantidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "produto : " + nome
				+"\nPreço: " + preco
				+"\nQuantidade: " + quantidade
				+"\nValor total em estoque: " + valorEmEstoque();
	}
	

}
