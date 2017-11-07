package com.sidcleywilker.database;

import java.util.HashMap;
import java.util.Map;

import com.sidcleywilker.exceptions.JaRegistrado;
import com.sidcleywilker.exceptions.NaoRegistrado;

/**
 * DataBase - Class de base de dados para salvar as consultas 
 * que foram feitas. Salvando o horário e o angulo que formou.
 * 
 * @author sidcleywilker
 *
 */
public class DataBase {
	
	private Map<String, Float> bd = new HashMap<String, Float>();

	/**
	 * Método para salvar.
	 * @param key A hora e o min. Ex 2:21.
	 * @param angulo O angulo que formou através do horário.
	 * @throws JaRegistrado Se o horário já foi salvo antes.
	 */
	public void add(String key, float angulo) throws JaRegistrado {
		if(bd.containsKey(key)) {
			throw new JaRegistrado("Horário já registrado");
		}else {
			bd.put(key, angulo);
		}
	}
	
	/**
	 * 
	 * @param key A hora e o min. Ex 2:21.
	 * @return O angulo que foi formando.
	 * @throws NaoRegistrado Se o horário não tiver sido salvo.
	 */
	public float getAngulo(String key) throws NaoRegistrado {
		if(bd.containsKey(key)) {
			return bd.get(key);
		}else {
			throw new NaoRegistrado("Horário não registrado");
		}
	}

	public Map<String, Float> getBd() {
		return bd;
	}

	public void setBd(Map<String, Float> bd) {
		this.bd = bd;
	}
	
	
}
