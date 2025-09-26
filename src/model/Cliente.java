package model;

public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private Cuenta[] cuentas;

    public Cliente(String nombre, int edad, String cedula){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.cuentas = new Cuenta[10];
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre= nombre;

    }
    
    public int getedad() {
        return edad;
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public String getcedula(){
        return cedula;
    }

    public void setcedula(String cedula){
        this.cedula = cedula;
    }

/*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria.
     */
    public Cuenta[] getCuentasList() {
        return cuentas;
    
    }

    public void addCuenta(String nomBanco, TipoCuenta tipoCuenta, double saldo) {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                cuentas[i] =  new Cuenta(nomBanco, tipoCuenta, saldo);
                break;
            }
        }

    }
} 

     

    

