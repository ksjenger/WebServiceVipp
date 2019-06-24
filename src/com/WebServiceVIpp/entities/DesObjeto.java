package com.WebServiceVIpp.entities;

public class DesObjeto {

    private String desObjeto;

    public DesObjeto() {

    }

    public DesObjeto(String desObjeto) {
        this.desObjeto = desObjeto;
    }

    public String getDesObjeto() {
        return desObjeto;
    }

    public void setDesObjeto(String desObjeto) {
        this.desObjeto = desObjeto;
    }

    @Override
    public String toString() {
        return "DesObjeto{" + "desObjeto=" + desObjeto + '}';
    }

    
}
