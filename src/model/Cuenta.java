package model;

public class Cuenta {
    private String nomBanco;
    private TipoCuenta  tipoCuenta;
    private double saldo;
    
    public Cuenta (String nomBanco, TipoCuenta tipoCuenta, double saldo){
        this.nomBanco = nomBanco;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }


    public String getnomBanco(){
        return nomBanco;
    }

    public void setnomBanco(String nomBanco){
        this.nomBanco = nomBanco;
    }

    public TipoCuenta getTipoCuenta(){
        return tipoCuenta;
     }

    public void setTipoCuenta(TipoCuenta tipoCuenta){
        this.tipoCuenta = tipoCuenta;
    }

    public double getsaldo(){
        return saldo;
     }

     public void setsaldo(double saldo){
        this.saldo = saldo;
    }

    public double retirarDineroCuenta(double monto) {
        if (saldo < 0) {
            System.out.println("No se puede retirar esa cantidad de dinero");
            return 0;
        } else {
            this.saldo = saldo - monto;
            return monto;
        }
        
    }

}
    


