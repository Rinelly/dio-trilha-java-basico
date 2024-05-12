public class CaixaEletronico {
    public static void main(String[] args) {
       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo) //esta instrução precisa ser verdadeira para que a de baixo sejja executada
             saldo = saldo - valorSolicitado; //saldo mostrado, será o resultado de saldo menos (-) valorSolicitado
      else
        System.out.print("Saldo insuficiente");

        System.out.println(saldo);

    }
}
