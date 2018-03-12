package Compania;

import java.util.ArrayList;

public abstract class Cliente implements Fechable{

    private class Direccion{

        String codPost;
        String provincia;
        String pobblacion;

        public Direccion() {
        }

        public Direccion(Direccion otraDireccion) {
            this.codPost = otraDireccion.codPost;
            this.provincia = otraDireccion.provincia;
            this.pobblacion = otraDireccion.pobblacion;
        }
    }

    private String nombre;
    private String nif;
    private Direccion dirección;
    private String correoElec;
    private OurCalendar fechaAlta;
    private Tarifa tarifa;
    private ArrayList<Factura> conjuntoFacturas;

    public Cliente (){
    }

   
    
    
    public Cliente( Cliente otroCliente) {
        this.nombre = otroCliente.nombre;
        this.nif = otroCliente.nif;
        this.dirección = otroCliente.dirección;
        this.correoElec = otroCliente.correoElec;
        this.fechaAlta = otroCliente.fechaAlta;
        this.tarifa = otroCliente.tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return nif;
    }

    public void setNIF(String NIF) {
        this.nif = NIF;
    }

    public Direccion getDirección() {
        return dirección;
    }

    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public void setFechaAlta(OurCalendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public ArrayList<Factura> getConjuntoFacturas() {
        return conjuntoFacturas;
    }
    
 

    public void setConjuntoFacturas(ArrayList<Factura> conjuntoFacturas) {
        this.conjuntoFacturas = conjuntoFacturas;
    }

    public OurCalendar getFecha() {
        return fechaAlta;
    }
}
