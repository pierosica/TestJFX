package org.ilpider.testjfx.model;

import java.util.List;

public class Partita {

	private int numeroGiocatori;
	private List<Giocatore> listaGiocatori;

	public Partita(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public void setNumeroGiocatori(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public int getNumeroGiocatori() {
		return numeroGiocatori;
	}

	public void setListaGiocatori(List<Giocatore> listaGiocatori) {
		this.listaGiocatori = listaGiocatori;
	}

	public List<Giocatore> getListaGiocatori() {
		return listaGiocatori;
	}
}
