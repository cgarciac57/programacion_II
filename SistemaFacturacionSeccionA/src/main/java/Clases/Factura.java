
package Clases;

import java.util.ArrayList;

public class Factura {
    
    int IdFactura;
    Cliente Clientes;
    String Fecha;
    ArrayList<DetalleFactura> DetalleFactura;
    boolean Anulada;

    public Factura(int IdFactura, Cliente Clientes, String Fecha) {
        this.IdFactura = IdFactura;
        this.Clientes = Clientes;
        this.Fecha = Fecha;
        this.DetalleFactura = new ArrayList<>();
        this.Anulada = false; //Será cuándo mi factura está activa.
    }
    
    //Crear Detalle Factura
    public void CrearFacturaDetalle(DetalleFactura detalle){
     //Agregar el detalle
     DetalleFactura.add(detalle);
    }
    
    //Anular Factura
    public void AnularFactura(){
        
        if(this.Anulada = false){
         this.Anulada = true;
            System.out.println("La Factura No. " + this.IdFactura + " fue anulada");
        }
        
    }
    
}
