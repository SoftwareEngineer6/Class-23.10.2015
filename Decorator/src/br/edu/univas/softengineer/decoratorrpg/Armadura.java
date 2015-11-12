package br.edu.univas.softengineer.decoratorrpg;

public class Armadura extends Equipamentos{

	public Armadura(Criatura alvo) {
		super(alvo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDefesa() {
		return (int) (getAlvo().getDefesa() * 1.2);
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
		return getAlvo().getVelocidade();
	}

}
