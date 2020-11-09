// Classe que armazena o cliente da firma
import java.util.ArrayList;

public class Cliente extends Pessoa {
	private int clienteId;
	private double limiteCredito;
	private String filiacao, statusClient;
	private ArrayList<Pedido> pedidos;
	
	//Construtor
	public Cliente(int clienteId, int telefoneClient,String nomeClient, double limiteCredito,
			String enderecoClient, String filiacao, String statusClient, ArrayList<Pedido> pedidos) {
		super(nomeClient, enderecoClient, telefoneClient);
		this.clienteId = clienteId;
		this.limiteCredito = limiteCredito;
		this.filiacao = filiacao;
		this.statusClient = statusClient;
		this.pedidos = pedidos;
	}
	//Gets e Sets;
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	public String getStatusClient() {
		return statusClient;
	}
	public void setStatusClient(String statusClient) {
		this.statusClient = statusClient;
	}

	public void adicionaPedido(Pedido p1) {
		pedidos.add(p1);
	}
	
	public String toString() {
		return "Código Cliente : "+clienteId+"\nTelefone: \nLimite Credito: "
				+limiteCredito+"\nNomeCliente: \nEndereço Cliente: \nFiliacao: "+filiacao+
				"\nStatusCliente: "+statusClient+"\nPedidos:"+pedidos;
				
	}

}
