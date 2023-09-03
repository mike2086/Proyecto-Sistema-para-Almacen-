
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;


public class AlmacenJPA {

   
    public static void main(String[] args) {
        
        //crear un producto
       Producto prod = new Producto(137, "Bolero", 34, 13.50);
       Producto prod1 = new Producto(138, "kit kat", 130, 9.80);
       Producto prod2 = new Producto(139, "Chessetress", 48, 6.30);
       Producto prod3 = new Producto(140, "Doritos", 24, 11.90);
       
        //inicializo instancia a mi controladora persistencia
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        //llamar al control para crear producto
        //control.crearProducto(prod);
        //control.crearProducto(prod1);
       //control.crearProducto(prod2);
        //control.crearProducto(prod3);
         
        //creo lista para mis productos y agrego los que quiero en la venta
        ArrayList <Producto> listaProducto = new ArrayList <Producto> ();
        listaProducto.add(prod2);
        listaProducto.add(prod3);
                
        //Venta vent = new Venta(2445, new Date ("02/12/2021"), 2500, true, listaProducto);
        //Venta vent = new Venta(2446, new Date ("02/13/2021"), 1300, true, listaProducto);
        Venta vent = new Venta(2447, new Date ("02/11/2021"), 870.60, true, listaProducto);
        
        control.CrearVenta(vent);
                
        //eliminar producto por codigo
        //control.eliminarProducto(132);
        
        //prod.setNombre("Marquesa");
        //prod.setCantidad(123);
        //control.editarProducto(prod);
        
        
        //buscar producto
        //Producto productoBuscado = control.buscarProducto(23);
        
        //if(productoBuscado == null){
       //     System.out.println("El codigo de producto buscado no existe en el Inventario");
       // }
       // else{
       // System.out.println("Codigo: " + productoBuscado.getCodigo() + " Nombre: " + productoBuscado.getNombre() + " Precio: " + productoBuscado.getPrecio());
       // }
        
        //List <Producto> listaProducto = new ArrayList <Producto>();
       
       // listaProducto = control.buscartodos();
        
        //for (Producto p : listaProducto){
        //System.out.println("Codigo: " + p.getCodigo() + " Cantidad " + p.getCantidad() + " Nombre: " + p.getNombre() + " Precio: " + p.getPrecio());
            
       // }
    }
    
}
