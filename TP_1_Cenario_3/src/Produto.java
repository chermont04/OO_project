import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Classe que armazena os produtos disponíveis pela empresa

public class Produto {
	private int produtoId, estoque;
	private String nomeProduto,categoria;
	private double preco;
	private Date dataFabricacao, dataVencimento;
	
	// Construtor	
	public Produto(int produtoId, int estoque, String nomeProduto, String categoria, 
			double preco, String dataFabricacao, String dataVencimento) {
		this.produtoId = produtoId;
		this.estoque = estoque;
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.preco = preco;
		try {
			this.dataFabricacao = new SimpleDateFormat("dd/MM/yyyy").parse(dataFabricacao);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.dataVencimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataVencimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Gets e sets
	public int getEstoque() {
		return estoque;
	}

	public void estoque(int estoque) {
		this.estoque = estoque;
	}

	public int produtoId() {
		return produtoId;
	}
	public void produtoId(int produtoId) {
		this.produtoId = produtoId;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public int ValorEstoque(int estoque) {
		return estoque;
	}
	public String toString() {
		return "produto ID: "+produtoId + " Nome do produto: "+nomeProduto+" Estoque: "+estoque+" Categoria: "+categoria+" Preco: "+preco+" data F: "+dataFabricacao+" Data V: " +dataVencimento;
	}
}
