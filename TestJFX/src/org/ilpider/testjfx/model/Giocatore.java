package org.ilpider.testjfx.model;

import org.ilpider.testjfx.view.GiocatoreController;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class Giocatore {

	private int ID;
	private String nome;
	private BorderPane viewGiocatore;
	private int punti;
	private GiocatoreController giocatoreController;

	// Costruttore di default
	public Giocatore(int ID) {
		super();
		this.ID = ID;
		this.punti = 0;

		giocatoreController = new GiocatoreController();
		this.nome = giocatoreController.getNomeGiocatore();
		
		/*
		 * syso DEBUG
		 */
//		System.out.println("nome: " + this.nome);
		setViewGiocatore();
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

	public void setViewGiocatore() {

		try {
			FXMLLoader loaderViewGiocatore = new FXMLLoader(); 
			loaderViewGiocatore.setLocation(getClass().getResource("../view/LayoutGiocatore.fxml"));
			this.viewGiocatore =  loaderViewGiocatore.load();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}
}
