package br.edu.univas.softengineer.decoratorrpg;

public class Arma extends Equipamentos{

	public Arma(Criatura alvo) {
		super(alvo);
	}

	@Override
	public int getDefesa() {
		return getAlvo().getDefesa();
	}

	@Override
	public int getAtaque() {
		return (int) (getAlvo().getAtaque() * 1.2);
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
