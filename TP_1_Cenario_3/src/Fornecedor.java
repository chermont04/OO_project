//Classe que armazena os fornecedores dos produtos da empresa

import java.util.ArrayList;

public class Fornecedor extends Pessoa {
	private int cnpj;
	private ArrayList<Produto> produtosFornecidos;
	
//Construtor
	public Fornecedor(int cnpj, int telefoneFornecedor, String nomeFantasia, String enderecoFornecedor,
			ArrayList<Produto> produtosFornecidos) {
		super(nomeFantasia, enderecoFornecedor, telefoneFornecedor);
		this.cnpj = cnpj;
		this.produtosFornecidos = produtosFornecidos;
	}
	//Gets e sets
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public void adicionaProdutos(Produto p1) {
		produtosFornecidos.add(p1);
	}
		
	public String toString() {
		return "CNPJ fornecedor: : "+cnpj+"\nTelefone do Fornecedor: telefoneFornecedor\nNome Fantasia."+
				"\nEndereco do Fornecedor: ";
	}

}

