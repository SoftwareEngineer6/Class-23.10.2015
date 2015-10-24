package br.edu.univas.softengineer.decoratorrpg;

public class Veiculo extends Equipamentos{

	public Veiculo(Criatura alvo) {
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
		return (int) (getAlvo().getHabilidade() * 1.2);
	}

	@Override
	public int getVelocidade() {
		return getAlvo().getVelocidade();
	}

}
