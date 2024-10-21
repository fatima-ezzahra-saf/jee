package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class MyBean {
    private String password;
    private String email;
    private String message;

    public String submit() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (email.equals("fati@gmail.com") && password.equals("fati123")) {
            return "nextPage?faces-redirect=true";
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Nom ou mot de passe incorrect", null));
            return null; // Stay on the same page
        }
    }

    // Getters and Setters


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() { // Add getter for email
        return email;
    }

    public void setEmail(String email) { // Add setter for email
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
