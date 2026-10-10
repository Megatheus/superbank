package AulaBanco;

public class Simulacaolog {
    private String login;
    private String senha;
 
    //Construtor
    public Simulacaolog(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
 
    public String getLogin() {
        return login;
    }
 
    public String getSenha() {
        return senha;
    }
}
