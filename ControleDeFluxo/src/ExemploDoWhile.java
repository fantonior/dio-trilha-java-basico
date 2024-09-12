import java.util.Random;

public class ExemploDoWhile {
  public static void main(String[] args) {
    System.out.println("Discando...");
    int numToques = 1;
    do {
      System.out.println("Telefone tocando..." + numToques++);
    } while (tocando());

    System.out.println("Alô !!!");
  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(5) == 1;
    if (atendeu)
       System.out.println("Atendeu!");
    return ! atendeu;
  }  
}
