package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MyBean {
    private String name;
    private String password;
    private String message;


    public String submit() {
        if(name.equals("fati") && password.equals("fati123")) return "nextPage?faces-redirect=true";
        else {
           setMessage("name ou mot de passe incorrect");
            return message;
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }
    public String getPassword(){
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password){this.password=password;}

    public String getMessage() {
        return message;
    }
    public String nextPage(){
        return "nextPage?faces-redirect=true";
    }
}