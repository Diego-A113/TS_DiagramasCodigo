package com.tsdiagramas;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;

    protected boolean logIn(){
        return true;
    }
    protected boolean logOut(){
        return false;
    }

}
