package br.edu.univas.softengineer.decoratorrpg;

public class Ferramenta extends Equipamentos{

	public Ferramenta(Criatura alvo) {
		super(alvo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDefesa() {
		return getAlvo().getDefesa();
	}

	@Override
	public int getAtaque() {
		return getAlvo().getAtaque();
	}

	@Override
	public int getHabilidade() {
		return getAlvo().getHabilidade();
	}

	@Override
	public int getVelocidade() {
		return (int) (getAlvo().getVelocidade() * 1.2);
	}

}
