public class Titular1 extends TitularMaster{

    public Titular1() {
        super(8569, "1111111111", 123456);
        setSaldo1(2000);
    }
    public Integer getCodTitular1() {
        return super.getCodTitular();
    }
    //public void setCodTitular() {
       // super.setCodTitular();
    //}
    public String getCpfLogin1() {
        return super.getCpfLogin();
    }
    public void setCpfLogin1(String novoLogin) {
      super.setCpfLogin(novoLogin);
    }
    public Integer getSenha1() {
        return super.getSenha();
    }
    public void setSenha1(Integer novaSenha) {
        super.setSenha(novaSenha);
    }
    public Integer getSaldo1() {
        return super.getSaldo();
    }
    public void setSaldo1(Integer saldo) {
        super.setSaldo(saldo);
    }

    public Integer getQuantidadeSaque1() {
        return super.getQuantidadeSaque();
    }

    public void setSaque1(Banco bank,Integer valorSaque){
        super.setSaque(bank, valorSaque);
        

    }
     public void setDepositoIndivi1(Integer valorD) {
        super.setDepositoIndivi(valorD);
     }
}
