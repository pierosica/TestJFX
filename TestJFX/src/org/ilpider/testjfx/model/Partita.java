package org.ilpider.testjfx.model;

import java.util.ArrayList;
import java.util.List;

//import org.ilpider.testjfx.MainTestJFX;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

public class Partita {

	private int numeroGiocatori;
	private List<Giocatore> listaGiocatori;
	private GridPane layoutGiocatori;
//	private MainTestJFX mainTestJFX;

	public Partita(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
		this.listaGiocatori = creaListaGiocatori(this.numeroGiocatori);
//		System.out.println(this.listaGiocatori);
		creaLayoutGiocatori();
	}

	public List<Giocatore> creaListaGiocatori(int numeroGiocatori) {

//		System.out.println(this.listaGiocatori);

		// creo la lista dei giocatori
		listaGiocatori = new ArrayList<Giocatore>();

		// popolo la lista creando tutti i Giocatore
		for (int i = 0; i < numeroGiocatori; i++) {
			Giocatore g = new Giocatore(i);
			listaGiocatori.add(i, g);
		}
		return listaGiocatori;
	}

	public GridPane creaLayoutGiocatori() { // creo il layout che contiene i pannelli dei singoli Giocatore

		try {
			
			FXMLLoader loaderLayoutGiocatori = new FXMLLoader();
			loaderLayoutGiocatori.setLocation(getClass().getResource(
					"../view/LayoutGiocatori.fxml"));
			layoutGiocatori = (GridPane) loaderLayoutGiocatori.load();
			// ciclo sulla lista per assegnare tutte le viewGiocatore al
			// GridPane LayoutGiocatori
			for (Giocatore g : listaGiocatori) {
				layoutGiocatori.add(g.getViewGiocatore(), g.getID(), 0);
				/*
				 * syso DEBUG
				 */
//				System.out.println("Nome del Giocatore " + g.getID() + " " + g.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return layoutGiocatori;
	}

//	public MainTestJFX getMainTestJFX() {
//		return mainTestJFX;
//	}
//
//	public void setMainTestJFX(MainTestJFX mainTestJFX) {
//		this.mainTestJFX = mainTestJFX;
//	}

	public int getNumeroGiocatori() {
		return numeroGiocatori;
	}

	public List<Giocatore> getListaGiocatori() {
		return listaGiocatori;
	}
}
