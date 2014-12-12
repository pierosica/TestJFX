package org.ilpider.testjfx.view;

import org.ilpider.testjfx.Main;
import org.ilpider.testjfx.model.Giocatore;
import org.ilpider.testjfx.model.Partita;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class TestJFXController {

	@FXML
	// fx:id="grpNumeroGiocatori"
	private ToggleGroup grpNumeroGiocatori; // Value injected by FXMLLoader

	@FXML
	// fx:id="rdb2"
	private RadioButton rdb2; // Value injected by FXMLLoader

	@FXML
	// fx:id="rdb3"
	private RadioButton rdb3; // Value injected by FXMLLoader

	@FXML
	// fx:id="rdb4"
	private RadioButton rdb4; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnNuovaPArtita"
	private Button btnNuovaPArtita; // Value injected by FXMLLoader

	private Button btn1; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn2"
	private Button btn2; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn3"
	private Button btn3; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn4"
	private Button btn4; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn5"
	private Button btn5; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn6"
	private Button btn6; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn7"
	private Button btn7; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn8"
	private Button btn8; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn9"
	private Button btn9; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn10"
	private Button btn10; // Value injected by FXMLLoader

	@FXML
	// fx:id="bt11"
	private Button btn11; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn12"
	private Button btn12; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn13"
	private Button btn13; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn14"
	private Button btn14; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn15"
	private Button btn15; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn16"
	private Button btn16; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn17"
	private Button btn17; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn18"
	private Button btn18; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn19"
	private Button btn19; // Value injected by FXMLLoader

	@FXML
	// fx:id="btn20"
	private Button btn20; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnBull"
	private Button btnBull; // Value injected by FXMLLoader

	private Giocatore model;
	private Partita partita;

	public int getNumeroGiocatori() {
		Toggle aaa = grpNumeroGiocatori.getSelectedToggle();
		int numeroGiocatori = (int) aaa.getUserData();
		return numeroGiocatori;
	}

	@FXML
	void doBtnNumero(ActionEvent event) {
		// aaa = model.getNome();
		// System.out.println("Prima: " + aaa);
		// model.setNome("Pippo");
		// bbb = model.getNome();
		// System.out.println(bbb);
		// model.setNome(aaa);
		//System.out.println("Nel bottone leggo quanti giocatori ha la partita: " + getNumeroGiocatori());
		System.out.println(partita.getNumeroGiocatori());
	}

	@FXML
	void doNuovaPartita(ActionEvent event) {
//		partita = new Partita(getNumeroGiocatori());
		Main.nuovaPartita(getNumeroGiocatori());
		System.out.println("La nuova partita avra' " + getNumeroGiocatori() + " giocatori");
	}

	@FXML
	void doRdbNumeroGiocatori(ActionEvent event) {
		Main.nuovaPartita(getNumeroGiocatori());
//		System.out.println(event.getSource());
//		Toggle ccc = (Toggle) event.getSource();
//		System.out.println(ccc.getUserData());
	}

	@FXML
	// This method is called by the FXMLLoader when initialization is
	// complete
	void initialize() {
		assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn3 != null : "fx:id=\"btn3\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn4 != null : "fx:id=\"btn4\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn5 != null : "fx:id=\"btn5\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn6 != null : "fx:id=\"btn6\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn7 != null : "fx:id=\"btn7\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn8 != null : "fx:id=\"btn8\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn9 != null : "fx:id=\"btn9\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn10 != null : "fx:id=\"btn10\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn11 != null : "fx:id=\"btn11\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn12 != null : "fx:id=\"btn12\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn13 != null : "fx:id=\"btn13\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn14 != null : "fx:id=\"btn14\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn15 != null : "fx:id=\"btn15\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn16 != null : "fx:id=\"btn16\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn17 != null : "fx:id=\"btn17\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn18 != null : "fx:id=\"btn18\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn19 != null : "fx:id=\"btn19\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btn20 != null : "fx:id=\"btn20\" was not injected: check your FXML file 'TestJFX.fxml'.";
		assert btnBull != null : "fx:id=\"btnBull\" was not injected: check your FXML file 'TestJFX.fxml'.";

		rdb2.setUserData(2);
		rdb3.setUserData(3);
		rdb4.setUserData(4);
		// System.out.println("All'avvio la nuova partita avra' " + getNumeroGiocatori() + " giocatori");
//		partita = new Partita(getNumeroGiocatori());
	}

	public Giocatore getModel() {
		return model;
	}

	public void setModel(Giocatore model) {
		this.model = model;
	}

	public Partita getPartita() {
		return partita;
	}

	public void setPartita(Partita partita) {
		this.partita = partita;
	}
}
