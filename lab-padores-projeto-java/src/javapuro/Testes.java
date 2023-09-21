package javapuro;

import javapuro.singleton.*;
import javapuro.strategy.Comportamento;
import javapuro.strategy.ComportamentoAgressivo;
import javapuro.strategy.ComportamentoDefensivo;
import javapuro.strategy.ComportamentoNormal;
import javapuro.strategy.Robo;

public class Testes {
	
	public static void main(String[] args) {
		//singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		

		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		
		//strategy:
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo1 = new Robo();
		robo1.setComportamento(normal);
		robo1.mover();
		
		Robo robo2 = new Robo();
		robo2.setComportamento(defensivo);
		robo2.mover();
		
		Robo robo3 = new Robo();
		robo3.setComportamento(agressivo);
		robo3.mover();
		
	}
	
}
