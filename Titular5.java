public class Titular5 extends TitularMaster{

    public Titular5() {
        super(5451,555555555,581393);
        setSaldo5(2000);
    }
    public Integer getCodTitular5() {
        return super.getCodTitular();
    }
    //public void setCodTitular() {
       // super.setCodTitular();
    //}
    public Integer getCpfLogin5() {
        return super.getCpfLogin();
    }
    public void setCpfLogin5(Integer novoLogin) {
      super.setCpfLogin(novoLogin);
    }
    public Integer getSenha5() {
        return super.getSenha();
    }
    public void setSenha5(Integer novaSenha) {
        super.setSenha(novaSenha);
    }
    public Integer getSaldo5() {
        return super.getSaldo();
    }
    public void setSaldo5(Integer saldo) {
        super.setSaldo(saldo);
    }

    public Integer getQuantidadeSaque5() {
        return super.getQuantidadeSaque();
    }

    public void setSaque5(Banco bank,Integer valorSaque,Integer tipoNota[],int quant[]){
        super.setSaque(bank, valorSaque, tipoNota, quant);
        

    }
     public void setDepositoIndivi5(Integer valorD) {
        super.setDepositoIndivi(valorD);
     }
}
