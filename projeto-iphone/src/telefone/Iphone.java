package telefone;

public class Iphone extends Telefones {

	public static void main(String[] args) {
		
		Telefones iphone = new Telefones();
		
		System.out.println("iphone chamando...");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		
		System.out.println("");
		
		System.out.println("iphone reproduzindo música...");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		System.out.println("");
		
		System.out.println("iphone acessando a web");
		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
	}
}
