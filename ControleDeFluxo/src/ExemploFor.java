public class ExemploFor {
  public static void main(String[] args) {
    
    for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {

      if (carneirinhos > 1)
        System.out.println(carneirinhos + " carneirinhos...");
      else
        System.out.println(carneirinhos + " carneirinho...");

      if (carneirinhos == 20)
        System.out.println("zzzzzz...");
    }
  }
}
