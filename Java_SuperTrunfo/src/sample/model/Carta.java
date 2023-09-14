package model;

public class Carta {
    public static int quantidadeCarta;
    private Boolean disponivel;
    private String nome;
    private int ataque;
    private int controle;
    private int suporte;
    private int iniciacao;
    private int tipo;

    public Carta(int tipo) {
        definirTipoCarta(tipo);
        quantidadeCarta++;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getControle() {
        return this.controle;
    }

    public int getSuporte() {
        return this.suporte;
    }

    public int getIniciacao() {
        return this.iniciacao;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeCarta() {
        return quantidadeCarta;
    }

    public void info() {
        System.out.println("\n --------------------- ");
        System.out.printf("\n%s", getNome());
        System.out.printf("\nAtaque: %d ", getAtaque());
        System.out.printf("\nControle: %d ", getControle());
        System.out.printf("\nSuporte: %d ", getSuporte());
        System.out.printf("\nIniciacao: %d ", getIniciacao());
    }

    public Boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

        //Método para definir tipo
    public void definirTipoCarta(int tipo) {
        switch (tipo) {
            case 1:
                this.nome = "Reyna";
                this.ataque = 5;
                this.controle = 1;
                this.suporte = 0;
                this.iniciacao = 2;
                this.disponivel = true;
                break;
            case 2:
                this.nome = "Sage";
                this.ataque = 0;
                this.controle = 3;
                this.suporte = 5;
                this.iniciacao = 2;
                this.disponivel = true;
                break;
            case 3:
                this.nome = "Cypher";
                this.ataque = 1;
                this.controle = 5;
                this.suporte = 2;
                this.iniciacao = 3;
                this.disponivel = true;
                break;
            case 4:
                this.nome = "Brimstone";
                this.ataque = 2;
                this.controle = 5;
                this.suporte = 2;
                this.iniciacao = 2;
                this.disponivel = true;
                break;
            default:
                System.out.println("Tipo inválido");
                break;
        }
    }
}



