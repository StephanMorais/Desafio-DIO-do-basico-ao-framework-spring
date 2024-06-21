package strategy.caixa_de_som.conexao;

import strategy.caixa_de_som.Conexao;

public class ConexaoUSB implements Conexao {
	@Override
	public void conectar(){ 
	System.out.println("Dispositivo USB detectado! Lendo mídia");
	System.out.println("Mídia identificada! Pronto para reproduzir!");
	

}}
