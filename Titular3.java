public class Titular3 extends TitularMaster{

    public Titular3() {
        super(7854,333333333,32510);
        setSaldo3(2000);
    }
    public Integer getCodTitular3() {
        return super.getCodTitular();
    }
    //public void setCodTitular() {
       // super.setCodTitular();
    //}
    public Integer getCpfLogin3() {
        return super.getCpfLogin();
    }
    public void setCpfLogin3(Integer novoLogin) {
      super.setCpfLogin(novoLogin);
    }
    public Integer getSenha3() {
        return super.getSenha();
    }
    public void setSenha3(Integer novaSenha) {
        super.setSenha(novaSenha);
    }
    public Integer getSaldo3() {
        return super.getSaldo();
    }
    public void setSaldo3(Integer saldo) {
        super.setSaldo(saldo);
    }

    public Integer getQuantidadeSaque3() {
        return super.getQuantidadeSaque();
    }

    public void setSaque3(Banco bank,Integer valorSaque,Integer tipoNota[],int quant[]){
        super.setSaque(bank, valorSaque, tipoNota, quant);
       
    }
     public void setDepositoIndivi3(Integer valorD) {
        super.setDepositoIndivi(valorD);
     }
    
}
