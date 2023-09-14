package sample;

import sample.model.Carta;
import sample.model.Jogador;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

//Bibliotecas necessárias para a tela aparecer, por enquanto so ignorem
/*import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;*/

public class App {

    //Essa vai ser a Nossa classe App futuramente, a gente vai enviar todos os outros códigos que estão aqui pro controle da tela em cada ação.
    /*public class App extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/view/TesteJogo.fxml"));
        Parent root = loader.load();
        Scene tela = new Scene(root);
        primaryStage.setScene(tela);
        primaryStage.show();
    }*/


    public static void main(String[] args) throws Exception {

        Carta c1 = new Carta("Reyna", 5, 1, 0, 2);
        Carta c2 = new Carta("Sage", 0, 3, 5, 2);
        Carta c3 = new Carta(" Cypher", 1, 5, 2, 3);
        Carta c4 = new Carta(" Brimstone", 2, 5, 2, 2);
        int quantidadeCarta = c1.getQuantidadeCarta();
        ArrayList<Carta> baralho = new ArrayList<>(quantidadeCarta);
        ArrayList<Carta> monte1 = new ArrayList<>();
        ArrayList<Carta> monte2 = new ArrayList<>();

        baralho.add(c1);
        baralho.add(c2);
        baralho.add(c3);
        baralho.add(c4);

        embaralhaMonte(baralho, monte1);
        embaralhaMonte(baralho, monte2);

        monte1.get(0).info();
        monte1.get(1).info();
        monte2.get(0).info();
        monte2.get(1).info();

        jogar(monte1, monte2);

        // O erro tá aqui creio eu:
        monte1.get(0).info();
        monte1.get(1).info();
        monte1.get(2).info();

        Jogador j1 = new Jogador(monte1);
        Jogador j2 = new Jogador(monte2);

    }

    public static void embaralhaMonte(ArrayList<Carta> baralho, ArrayList<Carta> m1) {
        int random;
        do {
            random = new SecureRandom().nextInt(4);
            if (baralho.get(random).getDisponivel()) {
                m1.add(baralho.get(random));
                baralho.get(random).setDisponivel(false);
            }
        } while (m1.size() < 2);
    }

    public static void jogar(ArrayList<Carta> m1, ArrayList<Carta> m2) {
        int menu;
        m1.get(0).info();
        System.out.println("Jogador 1 joga");
        System.out.println("1-Ataque");
        System.out.println("2- Controle");
        System.out.println("3- Suporte");
        System.out.println("4 iniciação");
        Scanner scan = new Scanner(System.in);
        menu = scan.nextInt();
        scan.close();
        switch (menu) {
            case 1:
                if (m1.get(0).getAtaque() > m2.get(0).getAtaque()) {
                    m1.add(m2.get(0));

                } else {
                    m2.add(m1.get(0));
                }
                break;
            case 2:
                if (m1.get(0).getControle() > m2.get(0).getControle()) {
                    m1.add(m2.get(0));
                } else {
                    m2.add(m1.get(0));
                }
                break;
            case 3:
                if (m1.get(0).getSuporte() > m2.get(0).getSuporte()) {
                    m1.add(m2.get(0));
                } else {
                    m2.add(m1.get(0));
                }
                break;
            case 4: {
                if (m1.get(0).getIniciacao() > m2.get(0).getIniciacao()) {
                    m1.add(m2.get(0));
                } else {
                    m2.add(m1.get(0));
                }
                break;
            }

            default:
                System.out.println(" Não foi selecionado uma opção valida");

                break;
        }
    }

    public static void verificaVitoria(ArrayList<Carta> m1, int quantidadeCarta) {
        if (m1.size() == quantidadeCarta) {
            System.out.println("Vitoria do jogador");
        }
    }

}
