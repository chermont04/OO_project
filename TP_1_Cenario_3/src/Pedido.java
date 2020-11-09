// Classe que armazena cada pedido realizado
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private int numero, qntProd;
	private Date dataElab;
	private  ArrayList<Produto> produtos;
	private double valorPedido;
	
// Construtor
	public Pedido(int numero, int qntProd, String dataElab, ArrayList<Produto> produtos, double valorPedido) {
		this.numero = numero;
		this.qntProd = qntProd;
		try {
			this.dataElab = new SimpleDateFormat("dd/MM/yyyy").parse(dataElab);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.produtos = produtos;
		this.valorPedido = valorPedido;
	}
	//Gets e sets
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQntProd() {
		return qntProd;
	}
	public void setQntProd(int qntProd) {
		this.qntProd = qntProd;
	}
	public Date getDataElab() {
		return dataElab;
	}
	public void setDataElab(Date dataElab) {
		this.dataElab = dataElab;
	}
	
	public void adicionaProdutos(Produto p1) {
		produtos.add(p1);
	}
	public double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public String toString() {
		return "Numero pedido: : "+numero+"\nQuantidade de produtos: "+qntProd+"\nData de Elaboração: "
				+dataElab+"\nValor do Pedido: "+valorPedido;
	}
	
}
