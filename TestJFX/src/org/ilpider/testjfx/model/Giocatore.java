package org.ilpider.testjfx.model;

public class Giocatore {

	private String nome;
	private int punti;
	private boolean isN1Chiuso;
	private boolean isN1Morto;

	public Giocatore(String nome, int punti) {
//		super();
		this.nome = nome;
		this.punti = punti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public boolean isN1Chiuso() {
		return isN1Chiuso;
	}

	public void setN1Chiuso(boolean isN1Chiuso) {
		this.isN1Chiuso = isN1Chiuso;
	}

	public boolean isN1Morto() {
		return isN1Morto;
	}

	public void setN1Morto(boolean isN1Morto) {
		this.isN1Morto = isN1Morto;
	}

}
