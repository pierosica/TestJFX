package org.ilpider.testjfx.view;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class GiocatoreController {

	private String nomeGiocatore;

	@FXML
    private TextField txtNomeGiocatore;
    
    @FXML
    void initialize() {
        assert txtNomeGiocatore != null : "fx:id=\"txtNomeGiocatore\" was not injected: check your FXML file 'Giocatore.fxml'.";

        setNomeGiocatore(nomeGiocatore);
    }

	
    public String getNomeGiocatore() {
		return nomeGiocatore;
	}

	public void setNomeGiocatore(String nomeGiocatore) {
		this.nomeGiocatore = nomeGiocatore;
        txtNomeGiocatore.setText(nomeGiocatore);
	}

	public TextField getTxtNomeGiocatore() {
		return txtNomeGiocatore;
	}

	public void setTxtNomeGiocatore(TextField txtNomeGiocatore) {
		this.txtNomeGiocatore = txtNomeGiocatore;
	}
}