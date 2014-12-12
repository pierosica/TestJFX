package org.ilpider.testjfx.model;

import org.ilpider.testjfx.view.TestJFXController;

public class Partita {

	private int numeroGiocatori;
	private TestJFXController controller;

	public Partita(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public int getNumeroGiocatori() {
		return numeroGiocatori;
	}

	public void setNumeroGiocatori(int numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public TestJFXController getController() {
		return controller;
	}

	public void setController(TestJFXController controller) {
		this.controller = controller;
	}
}
