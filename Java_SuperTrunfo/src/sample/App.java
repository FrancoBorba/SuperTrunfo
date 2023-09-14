
import model.Carta;
import model.Jogador;
import java.security.SecureRandom;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carta c1 = new Carta("Reyna", 5, 1, 0, 2);
        Carta c2 = new Carta( "Sage" , 0 , 3,5,2);
        Carta c3 = new Carta( " Cypher",1,5,2,3);
        Carta c4 = new Carta( " Brim",2,5,2,2);
        int quantidadeCarta = 4;
        ArrayList <Carta> baralho = new ArrayList<>(quantidadeCarta); 
        ArrayList <Carta> monte1 = new ArrayList<>();
        ArrayList <Carta> monte2 = new ArrayList<>();
      
        baralho.add(c1);
       baralho.add(c2);
        baralho.add(c3);
        baralho.add(c4);

       embaralhaMonte(baralho, monte1, monte2);

        System.out.println(monte1.size());
         monte1.get(0).info();
         monte1.get(1).info();
       // System.out.println(monte1.get(2).getNome());
        


        Jogador j1 = new Jogador(monte1);
        Jogador j2 = new Jogador(monte2);

        
       
        

    }
    public static void embaralhaMonte(ArrayList <Carta> baralho,ArrayList <Carta> m1 , ArrayList <Carta> m2){
        int random;
        
     
             do{
                random = new SecureRandom().nextInt(4);
                if(baralho.get(random).getDisponivel()){
                    m1.add(baralho.get(random));
                    baralho.get(random).setDisponivel(false);
                   
                }
               
                
             }while(m1.size() < 2);
           

          /*   do{
                random = new  SecureRandom(null).nextInt(4);
            if(baralho.get(random).getDisponivel()){
               m2.add(baralho.get(random)); 
                baralho.get(random).setDisponivel(false);
            }

            }while( m2.size() < 2);*/

        }
    }
    
    


