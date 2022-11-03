package org.example;

public class Persona {
    private String skill;
    public Persona() {
        this.skill = "Alegre";
    }
    public Persona(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "skill='" + skill + '\'' +
                '}';
    }
}
