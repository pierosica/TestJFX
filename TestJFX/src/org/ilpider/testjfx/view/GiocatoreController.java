package org.ilpider.testjfx.view;

/**
 * Sample Skeleton for 'Giocatore.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GiocatoreController {
	
	private String nomeGiocatore;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // fx:id="btn1"
    private Button btn1; // Value injected by FXMLLoader

    @FXML // fx:id="btn2"
    private Button btn2; // Value injected by FXMLLoader

    @FXML // fx:id="btn3"
    private Button btn3; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn4"
    private Button btn4; // Value injected by FXMLLoader

    @FXML // fx:id="btn5"
    private Button btn5; // Value injected by FXMLLoader

    @FXML // fx:id="btn6"
    private Button btn6; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn7"
    private Button btn7; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn8"
    private Button btn8; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn9"
    private Button btn9; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn10"
    private Button btn10; // Value injected by FXMLLoader

    @FXML // fx:id="btn11"
    private Button btn11; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn12"
    private Button btn12; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn13"
    private Button btn13; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn14"
    private Button btn14; // Value injected by FXMLLoader

    @FXML // fx:id="btn15"
    private Button btn15; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn16"
    private Button btn16; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn17"
    private Button btn17; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn18"
    private Button btn18; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn19"
    private Button btn19; // Value injected by FXMLLoader
    
    @FXML // fx:id="btn20"
    private Button btn20; // Value injected by FXMLLoader
    
    @FXML // fx:id="btnBull"
    private Button btnBull; // Value injected by FXMLLoader

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtNomeGiocatore"
    private TextField txtNomeGiocatore; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn3 != null : "fx:id=\"btn3\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn4 != null : "fx:id=\"btn4\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn5 != null : "fx:id=\"btn5\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn6 != null : "fx:id=\"btn6\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn7 != null : "fx:id=\"btn7\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn8 != null : "fx:id=\"btn8\" was not injected: check your FXML file 'Giocatore.fxml'.";
    	assert btn9 != null : "fx:id=\"btn9\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn10 != null : "fx:id=\"btn10\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn11 != null : "fx:id=\"btn11\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn12 != null : "fx:id=\"btn12\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn13 != null : "fx:id=\"btn13\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn14 != null : "fx:id=\"btn14\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn15 != null : "fx:id=\"btn15\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn16 != null : "fx:id=\"btn16\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn17 != null : "fx:id=\"btn17\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn18 != null : "fx:id=\"btn18\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn19 != null : "fx:id=\"btn19\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btn20 != null : "fx:id=\"btn20\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert btnBull != null : "fx:id=\"btnBull\" was not injected: check your FXML file 'Giocatore.fxml'.";
        assert txtNomeGiocatore != null : "fx:id=\"txtNomeGiocatore\" was not injected: check your FXML file 'Giocatore.fxml'.";

    }

	public String getNomeGiocatore() {
		return nomeGiocatore;
	}

	public void setNomeGiocatore(String nomeGiocatore) {
		this.nomeGiocatore=nomeGiocatore;
		txtNomeGiocatore.setPromptText(this.nomeGiocatore);
	}

	public TextField getTxtNomeGiocatore() {
		return txtNomeGiocatore;
	}

	public void setTxtNomeGiocatore(TextField txtNomeGiocatore) {
		this.txtNomeGiocatore = txtNomeGiocatore;
	}

}










































