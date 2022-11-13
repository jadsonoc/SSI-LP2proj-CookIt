package models;

public class Login {
    
    private String username;

    private String password;

    Login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        if ( ! username.isEmpty() ) {
            this.username = username;
        } 
        else throw new RuntimeException("Erro de Login: Necessário informar o usuário.");
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        if ( ! username.isEmpty() ) {
            this.password = password;
        } 
        else throw new RuntimeException("Erro de Login: Necessário informar a senha.");
    }

}