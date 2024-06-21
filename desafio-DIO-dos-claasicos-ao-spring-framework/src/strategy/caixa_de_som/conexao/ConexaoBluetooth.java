package strategy.caixa_de_som.conexao;
import strategy.caixa_de_som.Conexao;

public class ConexaoBluetooth implements Conexao {
	
	@Override
	public void conectar() {
		System.out.println("Buscando dispositivos bluetooth...");
		System.out.println("Dispositivo encontrado, conectando...");
		System.out.println("Dispositivo conectado");
		
		
	}

}
