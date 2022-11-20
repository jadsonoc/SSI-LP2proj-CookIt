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

    private List<Recipe> favouriteRecipes;

    private List<Recipe> preparedRecipes;

    public User(String name, String email, String username, String password) {
        if (username != null && password != null) {
            this.setId(Sequences.SEQ_USER++);
            this.setName(name);
            this.setEmail(email);
            this.setLoginUser(new Login(username, password));
        }
    }

    public User(String name, String email, String username, String password, int skillsLevel, boolean lactoseIntolerant,
            boolean celiac) {
        if (username != null && password != null) {
            this.setId(Sequences.SEQ_USER++);
            this.setName(name);
            this.setEmail(email);
            this.setLoginUser(new Login(username, password));
            this.setSkillsLevel(skillsLevel);
            this.setLactoseIntolerant(lactoseIntolerant);
            this.setCeliac(celiac);
        }
    }

    public boolean Logar(String username, String password) {
        return this.loginUser.validateLogin(username, password);
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

    public List<Recipe> getFavouriteRecipes() {
        return favouriteRecipes;
    }

    public void setFavouriteRecipes(List<Recipe> favouriteRecipes) {
        this.favouriteRecipes = favouriteRecipes;
    }

    public List<Recipe> getPreparedRecipes() {
        return preparedRecipes;
    }

    public void setPreparedRecipes(List<Recipe> preparedRecipes) {
        this.preparedRecipes = preparedRecipes;
    }

    private void setLoginUser(Login login) {
        if (login != null) {
            this.loginUser = login;
        } else {
            throw new RuntimeException("Erro de Cadastro de Usuário: Necessário informar os dados de Login.");
        }
    }
    
}