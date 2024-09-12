public class ExemploForArray {
  public static void main(String[] args) {
    String alunos [] = {"John", "Paul", "George", "Ringo"};

    for ( int x = 0; x < alunos.length; x++) {
      System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
    }

    for (String aluno : alunos) {
      System.out.println("O aluno da vez é " + aluno);
    }
  }
}
