import java.util.Scanner;
public class App {

     float pesoideal, altura;
    public static void main(String[] args) throws Exception {
       System.out.print("Digite sua altura (em metros): ");
        try (Scanner entrada = new Scanner(System.in)) {
            float altura = entrada.nextFloat();
              float pesoideal = (float) (( 72.7* altura ) - 58);
                    System.out.println("Seu peso ideal é de: "+ pesoideal +" kg.");
        }
    }
}
