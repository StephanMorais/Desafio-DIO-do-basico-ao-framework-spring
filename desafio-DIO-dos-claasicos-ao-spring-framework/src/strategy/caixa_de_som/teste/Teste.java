package strategy.caixa_de_som.teste;

import strategy.caixa_de_som.CaixaDeSom;
import strategy.caixa_de_som.Conexao;
import strategy.caixa_de_som.Reproducao;
import strategy.caixa_de_som.conexao.ConexaoP2;
import strategy.caixa_de_som.conexao.ConexaoUSB;
import strategy.caixa_de_som.reproducao.ReproducaoAvancar;
import strategy.caixa_de_som.reproducao.ReproducaoTocar;
import strategy.caixa_de_som.conexao.*;


public class Teste {
		
	    public static void main(String[] args) {
	        Conexao bluetooth = new ConexaoBluetooth();
	        Conexao usb = new ConexaoUSB();
	        Conexao p2 = new ConexaoP2();
	        Reproducao tocar =new ReproducaoTocar();
	        Reproducao avancar =new ReproducaoAvancar();

	        CaixaDeSom caixaDeSom = new CaixaDeSom();
	        
	        caixaDeSom.definirConexao(usb);
	        caixaDeSom.conectar();

	        caixaDeSom.definirReproducao(tocar);
	        caixaDeSom.reproduzir();
	        caixaDeSom.definirReproducao(avancar);
	        caixaDeSom.reproduzir();
	        caixaDeSom.definirReproducao(tocar);
	        caixaDeSom.reproduzir();

	       
	       
	
	    }
	
	

	
	
	
	

}
