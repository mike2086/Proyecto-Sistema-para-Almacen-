
package Persistencia;

import Logica.Producto;
import Logica.Venta;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
   
    ProductoJpaController produJPA = new ProductoJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();
    
    //--------------------- Metodos para producto -------------------
    //metodo crear
    public void crearProducto (Producto prod){
        try {
            produJPA.create(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo eliminar
    
    public void eliminarProducto(int codigo){
        try {
            produJPA.destroy(codigo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo editar
    
    public void editarProducto(Producto prod){
        try {
            produJPA.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para buscar un producto
    
    public Producto buscarProducto(int codigo){
    
        return produJPA.findProducto(codigo);
    } 
    
    //metodo para buscar todos los productos de mi BD
    
    public List<Producto> buscartodos(){
    
        return produJPA.findProductoEntities();
    }
    
    //--------------------- Metodos para Venta -------------------
    // metodo alta de venta
    public void CrearVenta(Venta vent){
      
        try {
            ventaJPA.create(vent);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
    //metodo para Eliminar venta
    
    public void EliminarVenta (int IdVenta) {
    
        try {
            ventaJPA.destroy(IdVenta);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo para editar la venta
    public void EditarVenta (Venta vent){
    
        try {
            ventaJPA.edit(vent);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    //metodo para buscar venta
    public Venta BuscarVenta (int IdVenta){
    
        return ventaJPA.findVenta(IdVenta);
        
    }
    //metodo para buscar o traer todas las ventas
    public List <Venta> TraerTodo () {
   
        return ventaJPA.findVentaEntities();
    
    }    
}
