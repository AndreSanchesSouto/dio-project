package javapuro.facade.subsistema2;

public class Cep {
	
	private static Cep instancia = new Cep();
	
	private Cep() {
		super();
	}
	
	public static Cep getInstancia() {
		return instancia;
	}
	
	public String recupererCidade() {
		return "a";
	}
	
}
