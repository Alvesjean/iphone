package telefone;

import classes.AparelhoTelefonico;
import classes.NavegadorInternet;
import classes.ReprodutorMusical;

public class Telefones implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	
	public void ligar() {
		System.out.println("ligando");

	}
	
	
	public void atender() {
		System.out.println("atendendo");
		
	}
	
	
	public void iniciarCorreioDeVoz() {
		System.out.println("iniciando correio de voz");
		
	}
	
	
	public void tocar() {
		System.out.println("tocando música");
		
	}
	

	public void pausar() {
		System.out.println("musica interrompida");
		
	}
	
	
	public void selecionarMusica() {
		System.out.println("selecionando música");
		
	}
	
	
	public void exibirPagina() {
		System.out.println("exibindo página web");
		
	}
	
	
	public void atualizarPagina() {
		System.out.println("atualizando página web");
		
	}
	
	
	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba");
		
	}
	
	
	

}
