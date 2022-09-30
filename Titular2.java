public class Titular2 extends TitularMaster{

    public Titular2() {
        super(4596, "222222222",65893);
        setSaldo2(2000);
    }
    public Integer getCodTitular2() {
        return super.getCodTitular();
    }
    //public void setCodTitular() {
       // super.setCodTitular();
    //}
    public String getCpfLogin2() {
        return super.getCpfLogin();
    }
    public void setCpfLogin2(String novoLogin) {
      super.setCpfLogin(novoLogin);
    }
    public Integer getSenha2() {
        return super.getSenha();
    }
    public void setSenha2(Integer novaSenha) {
        super.setSenha(novaSenha);
    }
    public Integer getSaldo2() {
        return super.getSaldo();
    }
    public void setSaldo2(Integer saldo) {
        super.setSaldo(saldo);
    }

    public Integer getQuantidadeSaque2() {
        return super.getQuantidadeSaque();
    }

    public void setSaque2(Banco bank,Integer valorSaque){
        super.setSaque(bank, valorSaque);
    }
     public void setDepositoIndivi2(Integer valorD) {
        super.setDepositoIndivi(valorD);
     }
}
