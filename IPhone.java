package iPhone;

public class IPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
	
	//Funcionalidades do app Aparelho Telefonico, sendo exibidas na tela,
	// reproduzidas no alto-falante e capturando sons pelo microfone do iPhone
	
	@Override
	public void ligar() {
		System.out.println("Efetuando ligação");
	}
	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}

	//Funcionalidades do app Navegador de Internet, sendo exibidas na tela do iPhone
	
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página do navegador");
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página exibida");
	};

	//Funcionalidades do app Reprodutor Musical, sendo exibidas na tela e
	// reproduzidas no alto-falante do iPhone 
	
	@Override
	public void tocar() {
		System.out.println("Tocando música");
	}
	@Override
	public void pausar() {
		System.out.println("Reprodução em pausa");
	}
	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música");
	}

}
