package model;

public class BancoIcesiController {
    private Cliente [] clientes;

     /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para satisfacer los requerimientos.
     */

    public BancoIcesiController(int size){
        clientes = new Cliente[size];
    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Añada los metodos que considere hagan falta para satisfacer los requerimientos.
     * Para cada metodo:
     *      Agregue los parametros y retorno que sean pertinentes.
     *      Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos.
     */
    

     public void agregarCuentaCliente(String nombre, String cedula, String nomBanco, TipoCuenta tipoCuenta, double saldo){ 
       Cliente cliente = buscarCliente(cedula);
       if (cliente != null) {
           cliente.addCuenta(nomBanco, tipoCuenta, saldo);
       } 
    }


    public void depositarDineroCuenta() {
    

        }
      
    

    
    public void retirarDineroCuenta(String cedula, int indexCuenta, double monto) {
       Cliente cliente = buscarCliente(cedula);
         if (cliente != null) {
              Cuenta[] cuentas = cliente.getCuentasList();
              if (indexCuenta >= 0 && indexCuenta < cuentas.length && cuentas[indexCuenta] != null) {
                cuentas[indexCuenta].retirarDineroCuenta(monto);
              }
        }
    

    }

    public Cliente[] getClienteList() {
        return clientes;
    }

   

}
