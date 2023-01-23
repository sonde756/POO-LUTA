import java.util.Random;
import java.util.function.DoubleFunction;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Metodos

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
             this.aprovada = true;
             this.desafiado = l1;
             this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }


    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random random = new Random();
           int vencedor =  random.nextInt(3);

            System.out.println("========== RESULTADO DA LUTA ==========");
            switch (vencedor){
                case 0: System.out.println("Empatou!");
                        this.desafiante.empatarLuta();
                        this.desafiado.empatarLuta();
                        break;
                case 1: System.out.println("VENCEDOR: "+desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLutar();
                        break;
                case 2: System.out.println("VENCEDOR: "+desafiante.getNome());
                        this.desafiante.ganharLuta();
                        this.desafiado.perderLutar();
                        break;
            }
            System.out.println("=======================================");

        }
        else {
            System.out.println("================== Luta não pode acontecer ==================");
        }

    }


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
