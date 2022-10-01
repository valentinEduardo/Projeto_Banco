import java.util.Arrays;
import java.util.ArrayList;

public class Banco {
  private Integer saldoBancoTotal;
  private Integer nota2 = 20;
  private Integer nota10 = 20;
  private Integer nota20 = 20;
  private Integer nota50 = 20;
  private int[] quantNotas;
  private int acumula = 0;

  public Banco() {
    this.saldoBancoTotal = (this.nota2 * 2) + (this.nota10 * 10) + (this.nota20 * 20) + (this.nota50 * 50);
    // 40 200 400 1000
    quantNotas = new int[4];

  }

  public int getAcumula() {
    return acumula;
  }

  public Integer getNota2() {
    return nota2;
  }

  public Integer getNota10() {
    return nota10;
  }

  public Integer getNota20() {
    return nota20;
  }

  public Integer getNota50() {
    return nota50;
  }

  // Função para retornar o saldo
  public Integer getSaldoBancoTotal() {
    return saldoBancoTotal;
  }

  public void setSaldoBancoTotal(Integer valor) {
    saldoBancoTotal += valor;
  }

  // Metodo Get Para que cada vez que ouver um saque do titular ele retirar o
  // valor do banco de acordo com as notas
  public void setSaldoBancoTotalSaque(Integer saque) {
    for (int f = 0; f < saque / 2; f++) {
      if (saque > 0 && saque >= 50 && this.nota50 > 0 && this.nota50 < 21) {
        this.nota50 -= 1;
        this.saldoBancoTotal -= 50;
        saque -= 50;
        quantNotas[3] += 1;
        acumula += 50;
      }
    }
    for (int f = 0; f < saque / 2; f++) {
      if (saque > 0 && saque >= 20 && this.nota20 > 0 && this.nota20 < 21) {

        this.nota20 -= 1;
        this.saldoBancoTotal -= 20;
        saque -= 20;
        quantNotas[2] += 1;
        acumula += 20;
      }
    }
    for (int f = 0; f < saque / 2; f++) {
      if (saque > 0 && saque >= 10 && this.nota10 > 0 && this.nota10 < 21) {
        this.nota10 -= 1;
        this.saldoBancoTotal -= 10;
        saque -= 10;
        quantNotas[1] += 1;
        acumula += 10;
      }
    }
    for (int p = 0; p <= 20; p++) {
      if (saque > 0 && saque >= 2 && this.nota2 > 0 && this.nota2 < 21) {
        this.nota2 -= 1;
        this.saldoBancoTotal -= 2;
        quantNotas[0] += 1;
        saque -= 2;
        acumula += 2;
      }
    }

    if (this.nota2 == 0) {
      System.out.println("Nota de R$ 2,00 Acabou!");
    }
    if (this.nota10 == 0) {
      System.out.println("Nota de R$ 10,00 Acabou!");
    }
    if (this.nota20 == 0) {
      System.out.println("Nota de R$ 20,00 Acabou!");
    }
    if (this.nota50 == 0) {
      System.out.println("Nota de R$ 50,00 Acabou!");
    }
  }// Fim do Função SaqueSaldoBanco

  public int getQuantNotas1() {

    return quantNotas[0];

  }

  public int getQuantNotas2() {

    return quantNotas[1];

  }

  public int getQuantNotas3() {

    return quantNotas[2];

  }

  public int getQuantNotas4() {

    return quantNotas[3];

  }

  public void setNotas0() {
    Integer zerar = 0;

    for (int i = 0; i < 4; i++) {
      quantNotas[i] = zerar;
    }
    acumula = 0;

  }

  public void setNotas1() {

    nota2 += quantNotas[0];
    saldoBancoTotal += quantNotas[0] * 2;
  }

  public void setNotas2() {

    nota10 += quantNotas[1];
    saldoBancoTotal += quantNotas[1] * 10;
  }

  public void setNotas3() {

    nota20 += quantNotas[2];
    saldoBancoTotal += quantNotas[2] * 20;
  }

  public void setNotas4() {

    nota50 += quantNotas[3];
    saldoBancoTotal += quantNotas[3] * 50;
  }

}
