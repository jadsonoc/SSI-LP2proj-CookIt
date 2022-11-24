package models;

public class Unit {

    private Integer id;

    private String name;

    private String abbreviation;

    public Unit(Integer id, String name, String abbreviation) {
        this.id = id;
        this.setName(name);
        this.setAbbreviation(abbreviation);
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    
}