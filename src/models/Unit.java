package models;

import util.Sequences;

public class Unit {

    private Integer id;

    private String name;

    private String abbreviation;

    public Unit(String name, String abbreviation) {
        this.setId();
        this.setName(name);
        this.setAbbreviation(abbreviation);
    }

    private void setId() {
        this.id = Sequences.SEQ_UNIT++;
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