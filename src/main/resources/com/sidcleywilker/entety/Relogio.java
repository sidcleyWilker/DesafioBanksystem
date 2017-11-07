package com.sidcleywilker.entety;

/**
 * Representa o relogio com seu horário e o angulo formado #'Menor'
 * @author sidcleywilker
 *
 */
public class Relogio {

	private int hora;
	private int min;
	private float angulo;
	
	public Relogio() {
		
	}

	public Relogio(int hora, int min) {
		this.hora = hora;
		this.min = min;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public float getAngulo() {
		return angulo;
	}

	public void setAngulo(float angulo) {
		this.angulo = angulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hora;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relogio other = (Relogio) obj;
		if (hora != other.hora)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Relogio [hora=" + hora + ", min=" + min + ", angulo=" + angulo + "]";
	}
	
}
