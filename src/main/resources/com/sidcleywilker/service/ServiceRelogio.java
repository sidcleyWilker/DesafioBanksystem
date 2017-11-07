package com.sidcleywilker.service;

import com.sidcleywilker.database.DataBase;
import com.sidcleywilker.exceptions.JaRegistrado;
import com.sidcleywilker.exceptions.NaoRegistrado;

public class ServiceRelogio {
	
	public static ServiceRelogio serviceRelogio;
	private DataBase database;
	
	public static ServiceRelogio getInstance () {
		if (serviceRelogio == null) {
			serviceRelogio = new ServiceRelogio();
		}
		return serviceRelogio;
	}
	
	private ServiceRelogio() {
		this.database = new DataBase();
	}

	
	public void adicionar(int hora, int min) {
		String key = hora+":"+min;
		try {
			database.add(key, menorAngulo(hora, min));
		} catch (JaRegistrado e) {
			e.printStackTrace();
		}
	}
	
	
	public float getAngulo(int hora, int min) {
		String h = ""+hora;
		String m = ""+min;
		String key = h+":"+m;
		try {
			return database.getAngulo(key);
		} catch (NaoRegistrado e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public boolean containsHorario(int hora, int min) {
		String h = ""+hora;
		String m = ""+min;
		String key = h+":"+m;
		return database.getBd().containsKey(key);
	}
	
	/**
	 * Calcula o angulo dos ponteiro através da formula H*30 - 11*min / 2.
	 * Subtrai 360 do angulo calculado para saber qual dos dois é o menor.
	 * 
	 * @return O menor angulo
	 */
	public float menorAngulo(int hora, int min) {
		float angulo1 = Math.abs(
				(hora*30) - ((11 * min) / 2)
						);
		float angulo2 = Math.abs(360 - angulo1);
		
		if(angulo1 < angulo2) {
			return angulo1;
		}
		return angulo2;
	}
}
