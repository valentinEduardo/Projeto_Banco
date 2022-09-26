abstract class TitularMaster {
    private Integer codTitular;
    private  Integer cpfLogin;
    private Integer senha;
    private Integer saldo;
    private Integer quantidadeSaque;
    public TitularMaster(Integer cod,Integer cpfLogin,Integer senha) {
        this.codTitular = cod;
        this.cpfLogin = cpfLogin;
        this.senha = senha;
    }

    
    public Integer getCodTitular() {
        return this.codTitular;
    }
    public void setCodTitular(int codTitular) {
        this.codTitular = codTitular;
    }
    public Integer getCpfLogin() {
        return this.cpfLogin;
    }
    public void setCpfLogin(Integer cpfLogin) {
        this.cpfLogin = cpfLogin;
    }
    public Integer getSenha() {
        return this.senha;
    }
    public void setSenha(Integer senha) {
        this.senha = senha;
    }
    public Integer getSaldo() {
        return this.saldo;
    }
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getQuantidadeSaque() {
        return quantidadeSaque;
    }

   public void setSaque(Banco bank,Integer valorSaque){
        if(valorSaque%2 == 0 ){
        bank.setSaldoBancoTotalSaque(valorSaque);
        System.out.println("\r\nSaque feito con Sucesso!\r\n");
        }else {
            System.out.println("Ocorreu um Erro! Valor Solicitado e Impar!");
            System.out.println("\r\nPor favor, Insira um Valor Par!!");
        }       

    }
   
    public void setDepositoIndivi(Integer valorD) {
        this.saldo += valorD;
        System.out.println("\r\nValor Depositado Com Sucesso!\r\n");
    }
   

    
}
