package com.sidcleywilker.exceptions;

/**
 * Representa uma Exception caso tentem registrar 
 * um horário que já foi requerido.
 * @author sidcleywilker
 *
 */
@SuppressWarnings("serial")
public class JaRegistrado extends Exception{

	public JaRegistrado(String msg) {
		super(msg);
	}
}
