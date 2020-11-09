
// Cadastro de cliente, fornecedor, pedido e produto.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
// Menu de opções
	public static void menu() {
		System.out.println("1 - Cadastrar um Fornecedor");
		System.out.println("2 - Cadastrar um Cliente");
		System.out.println("3 - Realizar um pedido");
		System.out.println("4 - Pedidos efetuados por Cliente");
		System.out.println("5 - Pedidos efetuados no mês");
		System.out.println("6 - Quantidade de produtos em Estoque");
		System.out.println("7 - Quantidade de clientes cadastrados no sistema");
		System.out.println("8 - Fornecedores e produtos fornecidos");
		System.out.println("0 - Fechar o programa");
	}
// Cadastro do fornecedor
	public static void cadastroFornecedor() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do fornecedor: ");
		String nome = ler.next();
		System.out.println("Informe o telefone do fornecedor: ");
		int telefone = ler.nextInt();
		System.out.println("Informe o endereço do fornecedor: ");
		String endereco = ler.next();
		System.out.println("Informe o cnpj do fornecedor: ");
		int cnpj = ler.nextInt();
		List<Produto> produtos = new ArrayList<Produto>();
		while(true) {
			System.out.println("Informe o nome do produto fornecido: ");
			String nomeProduto = ler.next();
			System.out.println("Informe o ID do produto: ");
			int idProduto = ler.nextInt();
			System.out.println("Informe a quantidade fornecida: ");
			int estoque = ler.nextInt();
			System.out.println("Informe a categoria do produto: ");
			String categoria = ler.next();
			System.out.println("informe o preço do produto: ");
			int preco = ler.nextInt();
			System.out.println("informe a data de fabricação do produto: ");
			String dataFabricacao = ler.next();
			System.out.println("Informe a data de validade do protudo: ");
			String dataVencimento = ler.next();
			produtos.add(new Produto (idProduto, estoque, nomeProduto, categoria, preco, dataFabricacao, dataVencimento));
			System.out.println("Deseja registrar outro produto? (Digite 'S'/'s' para sim e 'N'/'n' para não.)");
			char parada = ler.next().charAt(0);
			if (parada == 'S' || parada == 's') {continue;}
			else {break;}
		}
		System.out.println(produtos.toString());
	}
	
// Cadastro do cliente
public static void cadastroCliente() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do Cliente: ");
		String nome = ler.next();
		System.out.println("Informe o telefone do Cliente: ");
		int telefone = ler.nextInt();
		System.out.println("Informe o endereço do Cliente: ");
		String endereco = ler.next();
		System.out.println("Informe o ID do Cliente: ");
		int idCliente = ler.nextInt();
		List<Pedido> pedidos = new ArrayList<Pedido>();
		// Terminar cliente a partir daqui
		while(true) {
			System.out.println("Informe o número do pedido: ");
			int numero = ler.nextInt();
			System.out.println("Informe a Data de elaboração do Pedido ");
			String dataElab = ler.next();
			String dataVencimento = ler.next();
			//produtos.add(new Produto (idProduto, estoque, nomeProduto, categoria, preco, dataFabricacao, dataVencimento));
			System.out.println("Deseja registrar outro produto? (Digite 'S'/'s' para sim e 'N'/'n' para não.)");
			char parada = ler.next().charAt(0);
			if (parada == 'S' || parada == 's') {continue;}
			else {break;}
		}
	}
// Realização de um pedido
public static void realizaPedido() {
	
}
// Consulta dos pedidos efetuados pelo cliente
public static void pedidosCliente() {
	
}
// Pedidos feitos no mês
public static void pedidosMes () {
	
}
// Produtos em Estoque
public static void produtosEstoque () {
	
}
// Clientes cadastrados no sistema
public static void clientesSistema () {
	
}
// relacao fornecedor e produtos
public static void fornecedorProdutos () {
	
}
		
// classe principal do projeto
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		Scanner ler = new Scanner(System.in);
		System.out.println("SONHO VERDE LIMPEZA");
		System.out.println("##################################");
		menu();
		int option = ler.nextInt();
		if (option == 1) {
			cadastroFornecedor();
		}
		System.out.println(produtos.toString());
	}



}
