package models;

public class Login implements Cloneable {
    
    private String username;

    private String password;

    Login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    private void setUsername(String username) {
        if (username.isEmpty() || username == null || username.equals("")) {
            throw new RuntimeException("Erro de Login: Necessário informar o usuário.");
        } else
            this.username = username;
    
    }

    private void setPassword(String password) {
        if (password.isEmpty() || password == null || password.equals("")) {
            throw new RuntimeException("Erro de Login: Necessário informar a senha.");
        } else
            this.password = password;
    }
    
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public boolean validateLogin(String username, String password) {
        if (this.isValidUsername(username) && this.isValidPassword(password)) {
            return true;
        } else {
            if (this.isValidUsername(username)) {
                throw new RuntimeException("Password informado é inválido!");
            } else {
                throw new RuntimeException("Usuário informado é inválido!");
            }
        }
    }
    
    private String getUsername() {
        return username;
    }

    private String getPassword() {
        return password;
    }

    private boolean isValidUsername(String username) {
        return this.getUsername().equals(username);
    }

    private boolean isValidPassword(String password) {
        return this.getPassword().equals(password);
    }

}