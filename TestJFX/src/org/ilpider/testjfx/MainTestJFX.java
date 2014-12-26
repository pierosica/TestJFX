package org.ilpider.testjfx;

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

	private Stage primaryStage; //la finestra dell'applicazione
	private BorderPane root; // il layout del TestJFX.fxml
	private GridPane layoutGiocatore; // il layout che contiene l'arrayGiocatore
	private BorderPane[] arrayGiocatore; // l'array dei singolo Giocatore.fxml
	private TestJFXController controllerRoot; // il controller del root (TestJFX.fxml) 
	private GiocatoreController controllerGiocatore; // il controller del root (TestJFX.fxml) 
	private Partita partita; // il modello della partita
	private Giocatore model; // il modello del Giocatore
	private int numeroGiocatori; 

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TestJFX");

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainTestJFX.class
					.getResource("view/TestJFX.fxml"));
			root = loader.load();

			// model = new Giocatore("Pluto", 0);
			controllerRoot = loader.getController();
			controllerRoot.setMainTestJFX(this);
			controllerRoot.setModel(model);
			numeroGiocatori = controllerRoot.getNumeroGiocatori();
			nuovaPartita(numeroGiocatori);
			controllerRoot.setPartita(partita);

			// creaLayout();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("view/application.css")
							.toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

//			creaLayoutGiocatori();

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

	public void nuovaPartita(int numeroGiocatori) {
		partita = new Partita(numeroGiocatori);
		controllerRoot.setPartita(partita);
		System.out.println(partita);

		List<Giocatore> giocatori = partita.listaGiocatori(numeroGiocatori);
		for (Giocatore g : giocatori) {
			System.out.println(g.getNome());
		}
		creaLayoutGiocatori();
	}

	public void creaLayoutGiocatori() {

		try {
			arrayGiocatore = new BorderPane[numeroGiocatori];
			// Load LayoutGiocatore overview
			FXMLLoader loaderLayout = new FXMLLoader();
			loaderLayout.setLocation(MainTestJFX.class
					.getResource("view/LayoutGiocatori.fxml"));
			layoutGiocatore = (GridPane) loaderLayout.load();

			for (int i = 0; i < numeroGiocatori; i++) {
				System.out.println();
				// Load Giocatore overview.
				FXMLLoader loaderGiocatore = new FXMLLoader();
				loaderGiocatore.setLocation(MainTestJFX.class
						.getResource("view/Giocatore.fxml"));
				BorderPane giocatore = (BorderPane) loaderGiocatore.load();
				controllerGiocatore = loaderGiocatore.getController();
				controllerGiocatore.setNomeGiocatore("Questo è il giocatore " + i);
				arrayGiocatore[i] = giocatore;
				arrayGiocatore[i].setUserData("Giocatore"+i+" della partita " +partita);
				layoutGiocatore.add(arrayGiocatore[i], i, 0);

				// Set person overview into the center of root layout.
			}
			root.setCenter(layoutGiocatore);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
