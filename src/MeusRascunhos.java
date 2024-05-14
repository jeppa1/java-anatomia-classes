public class MeusRascunhos {
   public static void main (String [] args) {
    System.out.print ( "Hello, jeppa, welcome to java's world!" );
      String primeiroNome = "Jadson";
      String segundoNome = "Chagas";
      String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
      System.out.println(nomeCompleto);
 // Declarando metodos em Java segue uma estrutura simples:

// Estrutura:
// tipoRetorno NomeObjetivoNoInfitinitivo Parâmetro(s)
// exemplo:
//      int somar (int numeroUm, int numero2);
//      String formatarCep (long cep);
}
   public static String nomeCompleto (String primeiroNome, String segundoNome){
      return " Your full name is " + primeiroNome.concat(" ").concat(segundoNome) + "!";
   }
}
