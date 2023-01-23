import javax.xml.xpath.XPathEvaluationResult;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

              l[0] = new  Lutador("Pretty", "França",31,1.75f,68.9f,11,2,1);
              l[1] = new  Lutador("Putt","Brasil",29,1.68f,57.8f,14,2,3);
              l[2] = new  Lutador("Snap","Eua",35,1.65f,80.9f,12,2,1);
              l[3] = new  Lutador("UFOcobol","Brasil",37,1.70f,119.3f,5,4,3);
              l[4] = new  Lutador("DeadCode","Autralia",28,1.93f,81.6f,13,0,2);
              l[5] = new  Lutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);


              Luta luta = new Luta();

              luta.marcarLuta(l[1],l[0]); //settar lutadores
              luta.lutar(); //iniciar lutar

             //Status depois da luta
              l[0].status();
              l[1].status();

    }
}