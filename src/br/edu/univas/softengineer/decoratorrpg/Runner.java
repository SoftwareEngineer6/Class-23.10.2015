package br.edu.univas.softengineer.decoratorrpg;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Runner {
	
	public static void main(String[] args) {
		Criatura humano = new Humano();
		Criatura orc = new Orc();
		
		humano = new Arma(humano);
		humano = new Veiculo(humano);
		
		orc = new Veiculo(orc);
		orc = new Ferramenta(orc);
		
		imprimir(humano, "Humano");
		imprimir(orc, "orc");
		
	}
	
	private static void imprimir(Criatura criatura, String desc){
		System.out.println("Dados da criatura: " + desc);
		System.out.println("Ataque: " + criatura.getAtaque());
		System.out.println("Defesa: " + criatura.getDefesa());
		System.out.println("Habilidade: " + criatura.getHabilidade());
		System.out.println("Velocidade: " + criatura.getVelocidade());
	}
}
	

