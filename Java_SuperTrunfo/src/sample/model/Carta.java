package model;

    public class Carta {
        public static int quantidadeCarta;
        private Boolean disponivel;
        private String nome;
        private int ataque;
        private int controle;
        private int suporte;
        private int iniciacao;
    public Carta(String nome, int ataque , int controle , int suporte , int iniciacao ){
        this.nome = nome;
        this.ataque = ataque;
        this.controle = controle;
        this.suporte = suporte;
        this.iniciacao = iniciacao;
        quantidadeCarta++;
        this.disponivel = true;
        
       
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
       public void info(){
        System.out.println("\n --------------------- ");
        System.out.printf("\n%s",getNome());
        System.out.printf("\nAtaque: %d ",getAtaque());
        System.out.printf("\nControle: %d ",getControle());
        System.out.printf("\nSuporte: %d ",getSuporte());
        System.out.printf("\nIniciacao: %d ",getIniciacao());
       }
       public Boolean getDisponivel(){
        return this.disponivel;
       }
       public void setDisponivel( Boolean disponivel){
        this.disponivel = disponivel;
       }



}       

        
    

