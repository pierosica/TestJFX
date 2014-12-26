package org.ilpider.testjfx.model;

import java.util.ArrayList;
import java.util.List;

public class Partita {

	private int numeroGiocatori;
	private List<Giocatore> listaGiocatori;

	public Partita(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public int getNumeroGiocatoriAttuali() {
		return numeroGiocatori;
	}

	public void setNumeroGiocatori(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public void setListaGiocatori(List<Giocatore> listaGiocatori) {
		this.listaGiocatori = listaGiocatori;
	}

	public List<Giocatore> getListaGiocatori(int numeroGiocatori) {
//		System.out.println("aaa "+ listaGiocatori.get(0).getNome());
		listaGiocatori = new ArrayList<>();

		for (int i = 0; i < numeroGiocatori; i++) {
			Giocatore g = new Giocatore("Giocatore n" + i, 0);
			System.out.println("in nome prima di settarlo è " + g.getNome());
			g.setID(i);
			g.setNome("giocatore " + i);
			listaGiocatori.add(g);
		}
		setListaGiocatori(listaGiocatori);
		return listaGiocatori;
	}
}
