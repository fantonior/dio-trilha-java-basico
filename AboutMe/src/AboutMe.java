import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * AboutMe
 */
public class AboutMe {

  public static void main(String[] args) {
    /*String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);
    */
    int idade = 0;
    Double altura = 0.0;
  
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    try {
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        altura = scanner.nextDouble();
    }
    catch (InputMismatchException e) {
      System.err.println("Os campos idade e altura devem ser numéricos");
      return;
    }

    System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm ");
  }  
}