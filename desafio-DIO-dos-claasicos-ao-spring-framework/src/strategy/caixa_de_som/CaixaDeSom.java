package strategy.caixa_de_som;

public class CaixaDeSom {
	protected Conexao conexao;
	protected Reproducao reproducao;
	
	public void definirConexao(Conexao conexao) {
		this.conexao=conexao;
	};
	
	
	public void definirReproducao(Reproducao reproducao) {
		this.reproducao=reproducao;
	}
	

	
	public void reproduzir() {
		reproducao.reproduzir();
	}

	public void conectar() {
		conexao.conectar();
	}

}

	


	
	
	



