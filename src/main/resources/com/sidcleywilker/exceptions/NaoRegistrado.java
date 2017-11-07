package com.sidcleywilker.exceptions;

/**
 * Representa uma Exception caso tentem obter um angulo 
 * quem ainda nao foi registrado
 * @author sidcleywilker
 *
 */
@SuppressWarnings("serial")
public class NaoRegistrado extends Exception{

	public NaoRegistrado(String msg) {
		super(msg);
	}
}
