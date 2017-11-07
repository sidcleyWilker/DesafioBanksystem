package com.sidcleywilker.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sidcleywilker.entety.Relogio;
import com.sidcleywilker.service.ServiceRelogio;

@Path("/clock")
public class RelogioResource {

	@GET
	@Path("/pegarAngulo")
	@Produces({ MediaType.APPLICATION_JSON })
	public Relogio pegarAngulo(@QueryParam("hora") int hora, @QueryParam("min") int min) {

		if (validarEntradas(hora, min)) {
			if (ServiceRelogio.getInstance().containsHorario(hora, min)) {
				Relogio re = new Relogio(hora, min);
				re.setAngulo(ServiceRelogio.getInstance().getAngulo(hora, min));
				return re;
			} else {
				ServiceRelogio.getInstance().adicionar(hora, min);
				Relogio re = new Relogio(hora, min);
				re.setAngulo(ServiceRelogio.getInstance().getAngulo(hora, min));
				return re;
			}
		}else {
			return null;
		}
	}

	/**
	 * Validar os parametros de entrada.
	 * 
	 * @param hora
	 *            Hora entre 1 e 12
	 * @param min
	 *            Minuto entre 0 e 60
	 * @return Um boolean validando o horário
	 */
	private boolean validarEntradas(int hora, int min) {
		if (hora < 1 || hora > 12) {
			return false;
		}
		if (min < 0 || min > 60) {
			return false;
		}
		return true;
	}

}
