package org.ilpider.testjfx;

import java.util.ArrayList;
import java.util.List;

import org.ilpider.testjfx.model.Giocatore;
import org.ilpider.testjfx.model.Partita;
import org.ilpider.testjfx.view.GiocatoreController;
import org.ilpider.testjfx.view.TestJFXController;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;

public class MainTestJFX extends Application {

	private Stage primaryStage; // la finestra dell'applicazione
	private BorderPane root; // il layout del TestJFX.fxml
	private GridPane layoutGiocatore; // il layout che contiene l'arrayGiocatore
	private Partita partita; // il modello della partita
	private List<Giocatore> listaGiocatori;
	private TestJFXController controllerRoot; // il controller del root (TestJFX.fxml)
	private GiocatoreController giocatoreController; // il controller del layoutGiocatore(Giocatore.fxml)

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TestJFX");

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainTestJFX.class
					.getResource("view/TestJFX.fxml"));
			root = loader.load();

			controllerRoot = loader.getController();
			controllerRoot.setMainTestJFX(this);

			// creo la prima listaGiocatori giusto per non partire con la finestra vuota
			// creaListaGiocatori(controllerRoot.leggiNumeroGiocatori());

			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("view/application.css")
							.toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public Partita getPartita() {
		return partita;
	}

	private List<Giocatore> creaListaGiocatori(int numeroGiocatori) {

		// creo la lista dei giocatori 
		listaGiocatori = new ArrayList<Giocatore>();

		// popolo la lista creando tutti i Giocatore 
		for (int i = 0; i < numeroGiocatori; i++) {
			Giocatore g = new Giocatore("Giocatore " + i);
			g.setID(i);
			listaGiocatori.add(i, g);
		}

		try {
			// creo il layout che contiene i pannelli dei singoli Giocatore 
			FXMLLoader loaderLayoutGiocatore = new FXMLLoader(); // è il "contenitore" in cui metto i pannelli di tutti i giocatori
			loaderLayoutGiocatore.setLocation(getClass().getResource("view/LayoutGiocatori.fxml"));
			layoutGiocatore = (GridPane) loaderLayoutGiocatore.load();

			// ciclo sulla lista per assegnare a ciascun membro il suo pannello Giocatore.fxml
			for (Giocatore g : listaGiocatori) {

				FXMLLoader loaderGiocatore = new FXMLLoader(); // è il pannello di ciascuno dei giocatori
				loaderGiocatore.setLocation(getClass()
						.getResource("view/Giocatore.fxml"));
				BorderPane viewGiocatore = (BorderPane) loaderGiocatore.load();
				g.setViewGiocatore(viewGiocatore);

				giocatoreController = loaderGiocatore.getController();
				giocatoreController.setNomeGiocatore(g.getNome());
				
				/*
					Qualche println per testare gli elementi della lista
				
				System.out.println("id: " + g.getID());
				System.out.println("nome: " + g.getNome());
				System.out.println("punti: " + g.getPunti());
				System.out.println("view: " + g.getViewGiocatore());
				System.out.println();
				*/

				layoutGiocatore.add(g.getViewGiocatore(), g.getID(), 0);
			}
			System.out.println("fine for");

			root.setCenter(layoutGiocatore);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaGiocatori;
	}

	public void nuovaPartita(int numeroGiocatori) {

		partita = new Partita(numeroGiocatori);
		creaListaGiocatori(numeroGiocatori);
		partita.setListaGiocatori(listaGiocatori);

		controllerRoot.setPartita(partita);
	}
}
