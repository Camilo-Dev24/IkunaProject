package org.surotec.ikunaproject.roll;

public class User {

    //Atributos

    private String roll;
    private String password;
    private String name;
    private String email;

    public User(){

    }

    public User(String roll, String password, String name, String email){
        this.roll = roll;
        this.password=password;
        this.name=name;
        this.email=email;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
