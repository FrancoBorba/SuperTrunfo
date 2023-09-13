
import model.Carta;
import model.Jogador;
import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
        Carta c1 = new Carta("Reyna", 5, 1, 0, 2,01);
        Carta c2 = new Carta( "Sage" , 0 , 3,5,2,02);
        Carta c3 = new Carta( " Cypher",1,5,2,3,03);
        Carta c4 = new Carta( " Brim",2,5,2,2,04);
        int quantidadeCarta =4;
        Carta [] monte1 = new Carta[quantidadeCarta/2]; // a ideia aqui é fazer que cada monte receba aleatoriamente as cartas
        Carta [] monte2 = new Carta[quantidadeCarta/2];
        
        
        System.out.printf("Total de cartas %d",c1.getQuantidadeCarta()); // tentativa de pegar a quantidade de cartas inicializadas pelo metodo contrutor
        
        Jogador j1 = new Jogador(monte1);
        Jogador j2 = new Jogador(monte2);
       
        
       

    }
    
    
    
}

