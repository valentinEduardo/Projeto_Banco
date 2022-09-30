public class ADM {
    private Integer codAdm;
    private String LoginCpf;
    private Integer senhaAdm;

    public ADM() {
        this.codAdm = 9997;
        this.LoginCpf = "1001001";
        this.senhaAdm = 456789;
    }

    public Integer getCodAdm() {
        return codAdm;
    }
    
    public String getLoginCpf() {
        return LoginCpf;
    }
    public void setLoginCpf(String loginCpf) {
        LoginCpf = loginCpf;
    }
    public Integer getSenhaAdm() {
        return senhaAdm;
    }
    public void setSenhaAdm(Integer senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

  

}
