class Estoque {

	Produto[] produtos;

	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");

		int totalProdutos = 0;

		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
			totalProdutos += produtos[i].quantidade;
		}

		System.out.println("------------------------");
		System.out.println("\nTotal de produtos no estoque: " + totalProdutos);
	}

}