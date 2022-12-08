package br.com.newapp.estrutura.strategy.map;

import java.util.HashMap;
import java.util.Map;

/**
 * eager
 * 
 * @author User
 *
 */
public class Estrategies {
	
	private Map<Integer,IEstrategia> estrategies;
	
	public Estrategies() {
		estrategies = new HashMap<Integer, IEstrategia>();
		estrategies.put(38, new EstrategiaCima());
		estrategies.put(40, new EstrategiaBaixo());
		estrategies.put(39, new EstrategiaDireita());
		estrategies.put(37, new EstrategiaEsquerda());
	}

	public IEstrategia of(int code) {
		return estrategies.get(code);
	}

}
