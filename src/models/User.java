package models;

import java.util.List;

public class User {
    
    private String name;

    private String email;

    private int skillsLevel;

    private boolean lactoseIntolerant;

    private boolean celiac;

    private Login loginUser;

    private List<Recipe> favourites;

    private List<Recipe> prepared;

    public User(String name, String email, String username, String password) {
        this.setName(name);
        this.setEmail(email);
        this.setLoginUser(new Login(username, password));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSkillsLevel() {
        return skillsLevel;
    }

    public void setSkillsLevel(int skillsLevel) {
        this.skillsLevel = skillsLevel;
    }

    public boolean isLactoseIntolerant() {
        return lactoseIntolerant;
    }

    public void setLactoseIntolerant(boolean lactoseIntolerant) {
        this.lactoseIntolerant = lactoseIntolerant;
    }

    public boolean isCeliac() {
        return celiac;
    }

    public void setCeliac(boolean celiac) {
        this.celiac = celiac;
    }

    private void setLoginUser(Login login) {
        if (login != null) {
            this.loginUser = login;
        } else {
            throw new RuntimeException("Erro de Cadastro de Usuário: Necessário informar os dados de Login.");
        }
    }
    
}