package org.ilpider.testjfx.view;

import java.util.Optional;

import org.ilpider.testjfx.MainTestJFX;
import org.ilpider.testjfx.model.Partita;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class TestJFXController {

	@FXML
	private ToggleGroup grpNumeroGiocatori;
	@FXML
	private RadioButton rdb2;
	@FXML
	private RadioButton rdb3;
	@FXML
	private RadioButton rdb4;
	@FXML
	private Button btnNuovaPartita;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btn10;
	@FXML
	private Button btn11;
	@FXML
	private Button btn12;
	@FXML
	private Button btn13;
	@FXML
	private Button btn14;
	@FXML
	private Button btn15;
	@FXML
	private Button btn16;
	@FXML
	private Button btn17;
	@FXML
	private Button btn18;
	@FXML
	private Button btn19;
	@FXML
	private Button btn20;
	@FXML
	private Button btnBull;

	private Partita partita;
	private MainTestJFX mainTestJFX;

	@FXML
	void doBtnNumero(ActionEvent event) {
		// aaa = model.getNome();
		// System.out.println("Prima: " + aaa);
		// model.setNome("Pippo");
		// bbb = model.getNome();
		// System.out.println(bbb);
		// model.setNome(aaa);
		// System.out.println("Nel bottone leggo quanti giocatori ha la partita: "
		// + getNumeroGiocatori());
		// System.out.println(partita.getNumeroGiocatoriAttuali());
	}

	@FXML
	void doNuovaPartita(ActionEvent event) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText("Look, a Confirmation Dialog");
		alert.setContentText("Are you ok with this?");

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK){
		    // ... user chose OK
			int numGiocatori = leggiNumeroGiocatori();
			partita = new Partita(numGiocatori);
			partita.setMainTestJFX(mainTestJFX);
			mainTestJFX.inizializzaLayoutGiocatori(partita.creaLayoutGiocatori());

		} else {
			// ... user chose CANCEL or closed the dialog
			System.out.println("premuto cancel");
		}
	}

	@FXML
	void doRdbNumeroGiocatori(ActionEvent event) {
		// se serve qui posso gestire un event quando cambia il selectedToggle
		// ad esempio con mainTestJFX.nuovaPartita(getNumeroGiocatori());
	}

	@FXML
	// This method is called by the FXMLLoader when initialization is complete
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
	}

	public int leggiNumeroGiocatori() {
		Toggle aaa = grpNumeroGiocatori.getSelectedToggle();
		int numeroGiocatori = (int) aaa.getUserData();
		return numeroGiocatori;
	}

	public void setMainTestJFX(MainTestJFX mainTestJFX) {
		 this.mainTestJFX = mainTestJFX;
	}

	public Partita getPartita() {
		return partita;
	}

	public void setPartita(Partita partita) {
		this.partita = partita;
	}
}
