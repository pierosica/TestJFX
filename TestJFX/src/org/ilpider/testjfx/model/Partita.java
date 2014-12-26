package org.ilpider.testjfx.model;

import java.util.ArrayList;
import java.util.List;

public class Partita {

	private int numeroGiocatori;

	public Partita(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public int getNumeroGiocatoriAttuali() {
		return numeroGiocatori;
	}

	public void setNumeroGiocatori(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public List<Giocatore> listaGiocatori(int numeroGiocatori) {
		List<Giocatore> giocatori = new ArrayList<>();

		for (int i = 0; i < numeroGiocatori; i++) {
			Giocatore g = new Giocatore("Giocatore n" + i, 0);
			g.setNome("giocatore " + i);
			giocatori.add(g);
		}

		return giocatori;
	}
}
