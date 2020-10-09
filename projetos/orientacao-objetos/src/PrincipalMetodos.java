
public class PrincipalMetodos {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
	}
	
}
