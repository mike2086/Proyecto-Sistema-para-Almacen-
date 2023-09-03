
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//las etiquetas con @ son el mapeo de la entidad y declaracion de relacion de datos
@Entity
public class Venta implements Serializable {
    
    @Id
    int idVenta;
    
    @Basic
    double importeTotal;
    boolean tieneDescuento;
    
    @Temporal (TemporalType.DATE)
    Date fechaVenta;
    
    @OneToMany
    // variable de tipo lista para guardar todos los productos y relacionarlos con la tabla producto
    List <Producto> listaProducto = new ArrayList <Producto> ();

    public Venta() {
    }

    public Venta(int idVenta, Date fechaVenta, double importeTotal, boolean tieneDescuento, ArrayList<Producto> listaProducto) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.importeTotal = importeTotal;
        this.tieneDescuento = tieneDescuento;
        this.listaProducto = listaProducto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    
    
}
    
