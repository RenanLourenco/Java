import java.util.Scanner;

public class Banco {

    public String ContaNome;
    public String ContaTipoConta;
    public double ContaSaldo;

    public Banco(String nome, String tipoConta, double saldo){
        ContaNome = nome;
        ContaTipoConta = tipoConta;
        ContaSaldo = saldo;
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Renan de Melo Lourenco";
        String tipoConta = "Conta Corrente";
        double saldo = 0;
        Banco banco = new Banco(nome,tipoConta,saldo);

        int encerrar = 0;

        while(encerrar == 0){
            banco.mostraMenu();
            int opcaoUsuario = leitura.nextInt();

            switch (opcaoUsuario){
                case 1:
                    double saldoUsuario = banco.getContaSaldo();
                    System.out.println(String.format("Saldo da Conta: %f", saldoUsuario));
                    break;
                case 2:
                    System.out.println("Insira o valor para depositar");
                    double valorParaDepositar = leitura.nextDouble();
                    banco.depositar(valorParaDepositar);
                    System.out.println(String.format("Valor depositado! Saldo: %f", banco.getContaSaldo()));
                    break;
                case 3:
                    System.out.println("Insira o valor para depositar");
                    double valorParaTransferir = leitura.nextDouble();
                    banco.transferir(valorParaTransferir);
                    System.out.println(String.format("Valor tranferido! Saldo: %f", banco.getContaSaldo()));
                    break;
                case 4:
                    encerrar = opcaoUsuario;
            }

        }

    }

    public double transferir(double valor){
        ContaSaldo -= valor;
        return ContaSaldo;
    }

    public double depositar(double valor){
        ContaSaldo += valor;
        return ContaSaldo;
    }

    public double getContaSaldo() {
        return ContaSaldo;
    }

    public void mostraMenu() {
        System.out.println(String.format("""
                *********************************
                Dados iniciais do cliente:
                
                Nome:  %s
                Tipo Conta: %s
                Saldo Inicial: %.2f   
                
                Opcoes do App
                1. Consultar saldo
                2. Receber Valor
                3. Transferir Valor
                4. Sair            
                
      
                """, ContaNome, ContaTipoConta, ContaSaldo));

    }

}
