package br.edu.univas.softengineer.decoratorrpg;

public abstract class Equipamentos implements Criatura{
	
	private Criatura alvo;
	
	public Equipamentos(Criatura alvo) {
		this.alvo = alvo;
	}
	
	protected Criatura getAlvo() {
		return alvo;
	}

}
