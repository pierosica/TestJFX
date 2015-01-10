package org.ilpider.testjfx.model;

import javafx.scene.layout.BorderPane;

public class Giocatore {

	private int ID;
	private String nome;
	private BorderPane viewGiocatore;
	private int punti;

	public Giocatore(String nome) {
		super();
		this.nome = nome;
	}

	public Giocatore(String nome, int punti) {
		super();
		this.nome = nome;
		this.punti = punti;
	}

	public Giocatore(int iD, String nome, BorderPane viewGiocatore, int punti) {
		super();
		ID = iD;
		this.nome = nome;
		this.viewGiocatore = viewGiocatore;
		this.punti = punti;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BorderPane getViewGiocatore() {
		return viewGiocatore;
	}

	public void setViewGiocatore(BorderPane viewGiocatore) {
		this.viewGiocatore = viewGiocatore;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}
}
