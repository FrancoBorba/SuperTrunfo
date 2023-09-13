package model;

    public class Carta {
        public static int quantidadeCarta;
        private int ID;
        private String nome;
        private int ataque;
        private int controle;
        private int suporte;
        private int iniciacao;
    public Carta(String nome, int ataque , int controle , int suporte , int iniciacao , int ID){
        this.nome = nome;
        this.ataque = ataque;
        this.controle = controle;
        this.suporte = suporte;
        this.iniciacao = iniciacao;
        this.ID = ID;
        quantidadeCarta++;
        
       
     }
        public int getAtaque(){
        return this.ataque;
        }
        public int getControle(){
        return this.controle;
        }
        public int getSuporte(){
        return this.suporte;
        }
        public int getIniciacao(){
        return this.iniciacao;
        }
        public String getNome(){
        return this.nome;
        }
        public int getQuantidadeCarta() {
            return quantidadeCarta;
        }
        public int getId(){
            return this.ID;
        }
        

        
    
}
