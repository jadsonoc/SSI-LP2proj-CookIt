package models;

import java.util.List;

import util.Sequences;

public class User {

    private Integer id;
    
    private String name;

    private String email;

    private int skillsLevel;

    private boolean lactoseIntolerant;

    private boolean celiac;

    private Login loginUser;

    private List<Recipe> favourites;

    private List<Recipe> prepared;

    public User(String name, String email, String username, String password) {
        this.setId(Sequences.SEQ_USER++);
        this.setName(name);
        this.setEmail(email);
        this.setLoginUser(new Login(username, password));
    }

    public User(String name, String email, String username, String password, int skillsLevel, boolean lactoseIntolerant,
            boolean celiac) {
        this.setId(Sequences.SEQ_USER++);
        this.setName(name);
        this.setEmail(email);
        this.setLoginUser(new Login(username, password));
        this.setSkillsLevel(skillsLevel);
        this.setLactoseIntolerant(lactoseIntolerant);
        this.setCeliac(celiac);
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
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

    public List<Recipe> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Recipe> favourites) {
        this.favourites = favourites;
    }

    public List<Recipe> getPrepared() {
        return prepared;
    }

    public void setPrepared(List<Recipe> prepared) {
        this.prepared = prepared;
    }

    private void setLoginUser(Login login) {
        if (login != null) {
            this.loginUser = login;
        } else {
            throw new RuntimeException("Erro de Cadastro de Usuário: Necessário informar os dados de Login.");
        }
    }
    
}