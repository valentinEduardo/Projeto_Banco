public class Titular4 extends TitularMaster {

    public Titular4() {
        super(6428, 444444444,113352);
        setSaldo4(2000);
    }
    public Integer getCodTitular4() {
        return super.getCodTitular();
    }
    //public void setCodTitular() {
       // super.setCodTitular();
    //}
    public Integer getCpfLogin4() {
        return super.getCpfLogin();
    }
    public void setCpfLogin4(Integer novoLogin) {
      super.setCpfLogin(novoLogin);
    }
    public Integer getSenha4() {
        return super.getSenha();
    }
    public void setSenha4(Integer novaSenha) {
        super.setSenha(novaSenha);
    }
    public Integer getSaldo4() {
        return super.getSaldo();
    }
    public void setSaldo4(Integer saldo) {
        super.setSaldo(saldo);
    }

    public Integer getQuantidadeSaque4() {
        return super.getQuantidadeSaque();
    }

    public void setSaque4(Banco bank,Integer valorSaque,Integer tipoNota[],int quant[]){
        super.setSaque(bank, valorSaque, tipoNota, quant);
        

    }
}
