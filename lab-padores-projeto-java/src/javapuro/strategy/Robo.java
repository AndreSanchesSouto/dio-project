package javapuro.strategy;

public class Robo {
	
	private Comportamento comportamento;
	
	public void setComportamento(Comportamento comp) {
		this.comportamento = comp;
	}
	
	public void mover() {
		comportamento.mover();
	}
	
}
