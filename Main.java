import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int confT = 0;
    int confA = 0;
    String cpf;
    Integer senha;
    ArrayList<String> Login = new ArrayList<>();
    ArrayList<Integer> Senha = new ArrayList<>();
    Scanner scn = new Scanner(System.in);
    ADM adm = new ADM();
    Titular1 T1 = new Titular1();
    Titular2 T2 = new Titular2();
    Titular3 T3 = new Titular3();
    Titular4 T4 = new Titular4();
    Titular5 T5 = new Titular5();
    Login.add(0, T1.getCpfLogin1());
    Login.add(1, T2.getCpfLogin2());
    Login.add(2, T3.getCpfLogin3());
    Login.add(3, T4.getCpfLogin4());
    Login.add(4, T5.getCpfLogin5());
    Login.add(5, adm.getLoginCpf());
    Senha.add(0, T1.getSenha1());
    Senha.add(1, T2.getSenha2());
    Senha.add(2, T3.getSenha3());
    Senha.add(3, T4.getSenha4());
    Senha.add(4, T5.getSenha5());
    Senha.add(5, adm.getSenhaAdm());
    int opcao = -1;
    Banco Bank = new Banco();
    int op = -1;
    while (op != 0) {
      System.out.println("       Bem Vindo Ao Banco!      ");
      System.out.println("|1- Login ADM    |");
      System.out.println("|2- Login Titular|");
      op = scn.nextInt();
      opcao = -1;
      switch (op) {
        case 1:
          String cpfA = "";
          int senhaA = 0;
          do {
            System.out.println(" ___________________________________");
            System.out.println("|              LOGIN ADM           |");
            System.out.println(" ----------------------------------- ");
            System.out.println("\r\nDigite o Login: ");
            cpfA = scn.next();
            System.out.println("\r\nDigite a Senha: ");
            senhaA = scn.nextInt();

            if (Login.indexOf(cpfA) == -1 || Senha.indexOf(senhaA) == -1) {
              confA = -1;
              System.out.println("Login ou senha incorretos");
            } else if (Login.indexOf(cpfA) == 5 && Senha.indexOf(senhaA) == 5) {
              confA = 1;
            }
          } while (confA != 1);

          while (opcao != 0) {
            System.out.println("Operações Disponives");
            System.out.println("|1-Repor Notas|\r\n|2-Saldo   |\r\n|0-Sair    |");

            opcao = scn.nextInt();

            switch (opcao) {
              case 1:

                System.out.println("Operação de deposito escolhida!\r\n");
                if (Bank.getQuantNotas1() == 0 && Bank.getQuantNotas2() == 0 && Bank.getQuantNotas3() == 0
                    && Bank.getQuantNotas4() == 0) {
                  System.out.println("Nenhuma nota foi retirada do caixa");
                } else {
                  System.out.println("Essa é a quantidade de nota(s) a ser(em) depositada(s)");
                  if (Bank.getQuantNotas1() > 0) {
                    System.out.println("Notas de 2: " + Bank.getQuantNotas1());
                    Bank.setNotas1();
                  }
                  if (Bank.getQuantNotas2() > 0) {
                    System.out.println("Notas de 10: " + Bank.getQuantNotas2());
                    Bank.setNotas2();
                  }
                  if (Bank.getQuantNotas3() > 0) {
                    System.out.println("Notas de 20: " + Bank.getQuantNotas3());
                    Bank.setNotas3();
                  }
                  if (Bank.getQuantNotas4() > 0) {
                    System.out.println("Notas de 50: " + Bank.getQuantNotas4());
                    Bank.setNotas4();
                  }
                  System.out.println("Notas depositadas com sucesso!");
                  Bank.setNotas0();

                }

                break;

              case 2:
                System.out.println("O valor do caixa do banco é " + Bank.getSaldoBancoTotal());
                System.out.println("Esses são os valores das notas:");
                System.out.println("Notas de 2:  " + Bank.getNota2());
                System.out.println("Notas de 10: " + Bank.getNota10());
                System.out.println("Notas de 20: " + Bank.getNota20());
                System.out.println("Notas de 50: " + Bank.getNota50());

                break;

              case 0:
                op = -1;
            }
          }
          break;

        case 2:

          int indiceT = -1;
          do {
            System.out.println("___________________________________");
            System.out.println("|             LOGIN TITULAR        |");
            System.out.println("----------------------------------- ");
            System.out.println("\r\nDigite o Login: ");
            cpf = scn.next();
            System.out.println("\r\nDigite a Senha: ");
            senha = scn.nextInt();
            if (Login.indexOf(cpf) == -1 || Senha.indexOf(senha) == -1) {
              System.out.println("\r\nLogin Não encontrado! Tente Novamente!\r\n");
              confT = -1;
            }
            if (Login.indexOf(cpf) == 0 && Senha.indexOf(senha) == 0) {
              indiceT = 0;
              confT = 1;
            } else if (Login.indexOf(cpf) == 1 && Senha.indexOf(senha) == 1) {
              indiceT = 1;
              confT = 1;
            } else if (Login.indexOf(cpf) == 2 && Senha.indexOf(senha) == 2) {
              indiceT = 2;
              confT = 1;
            } else if (Login.indexOf(cpf) == 3 && Senha.indexOf(senha) == 3) {
              indiceT = 3;
              confT = 1;
            }
          } while (confT != 1);

          switch (indiceT) {
            case 0:
              int tOpera1 = 0;
              do {
                System.out.println("Operações Disponives");
                System.out.println("|1-Saque   |\r\n|2-Deposito|\r\n|3-Saldo   |\r\n|0-Sair    |");
                tOpera1 = scn.nextInt();
                if (tOpera1 == 1) {
                  if (Bank.getAcumula() != 1640) {
                    System.out.println("Operação 1 escolhida!\r\n");
                    System.out.println("Digite o Valor que Deseja Sacar: ");
                    int valorS = scn.nextInt();
                    T1.setSaque1(Bank, valorS);
                  } else {
                    System.out.println("Todas as notas estão zeradas! Operação de saque indisponível%n");
                  }
                } else if (tOpera1 == 2) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Depositar: ");
                  int valorD = scn.nextInt();
                  T1.setDepositoIndivi1(valorD);
                } else if (tOpera1 == 3) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Saldo Da Conta: R$ " + T1.getSaldo1() + ",00\r\n");
                }
              } while (tOpera1 != 0);
              break;

            case 1:
              int tOpera2 = 0;
              do {
                System.out.println("Operações Disponives");
                System.out.println("|1-Saque   |\r\n|2-Deposito|\r\n|3-Saldo   |\r\n|0-Sair    |");
                tOpera2 = scn.nextInt();
                if (tOpera2 == 1) {
                  System.out.println("Operação 1 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Sacar: ");
                  int valorS = scn.nextInt();
                  T2.setSaque2(Bank, valorS);
                } else if (tOpera2 == 2) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Depositar: ");
                  int valorD = scn.nextInt();
                  T2.setDepositoIndivi2(valorD);
                } else if (tOpera2 == 3) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Saldo Da Conta: R$ " + T2.getSaldo2() + ",00\r\n");
                }
              } while (tOpera2 != 0);
              break;

            case 2:
              int tOpera3 = 0;
              do {
                System.out.println("Operações Disponives");
                System.out.println("|1-Saque   |\r\n|2-Deposito|\r\n|3-Saldo   |\r\n|0-Sair    |");
                tOpera3 = scn.nextInt();
                if (tOpera3 == 1) {
                  System.out.println("Operação 1 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Sacar: ");
                  int valorS = scn.nextInt();
                  T3.setSaque3(Bank, valorS);
                } else if (tOpera3 == 2) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Depositar: ");
                  int valorD = scn.nextInt();
                  T3.setDepositoIndivi3(valorD);
                } else if (tOpera3 == 3) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Saldo Da Conta: R$ " + T3.getSaldo3() + ",00\r\n");
                }
              } while (tOpera3 != 0);
              break;

            case 3:
              int tOpera4 = 0;
              do {
                System.out.println("Operações Disponives");
                System.out.println("|1-Saque   |\r\n|2-Deposito|\r\n|3-Saldo   |\r\n|0-Sair    |");
                tOpera4 = scn.nextInt();
                if (tOpera4 == 1) {
                  System.out.println("Operação 1 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Sacar: ");
                  int valorS = scn.nextInt();
                  T4.setSaque4(Bank, valorS);
                } else if (tOpera4 == 2) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Depositar: ");
                  int valorD = scn.nextInt();
                  T4.setDepositoIndivi4(valorD);
                } else if (tOpera4 == 3) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Saldo Da Conta: R$ " + T4.getSaldo4() + ",00\r\n");
                }
              } while (tOpera4 != 0);
              break;

            case 4:
              int tOpera5 = 0;
              do {
                System.out.println("Operações Disponives");
                System.out.println("|1-Saque   |\r\n|2-Deposito|\r\n|3-Saldo   |\r\n|0-Sair    |");
                tOpera5 = scn.nextInt();
                if (tOpera5 == 1) {
                  System.out.println("Operação 1 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Sacar: ");
                  int valorS = scn.nextInt();
                  T5.setSaque5(Bank, valorS);
                } else if (tOpera5 == 2) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Digite o Valor que Deseja Depositar: ");
                  int valorD = scn.nextInt();
                  T5.setDepositoIndivi5(valorD);
                } else if (tOpera5 == 3) {
                  System.out.println("Operação 2 escolhida!\r\n");
                  System.out.println("Saldo Da Conta: R$ " + T5.getSaldo5() + ",00\r\n");
                }
              } while (tOpera5 != 0);
              break;
          }
          break;

      }

    }

  }
}
