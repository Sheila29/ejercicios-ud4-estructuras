package com.company;


public class LineaTicket {

    private String producto;
    private double precio;
    private int unidades;
    private Ticket ticket;

    public LineaTicket(String producto, double precio, int unidades) {
        this.setProducto(producto);
        this.setPrecio(precio);
        this.setUnidades(unidades);
    }

    public double getTotal(){
        return precio*unidades;
    }


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "LineaTicket{" +
                "producto='" + producto + '\'' +
                ", precio=" + precio +
                ", unidades=" + unidades +
                '}';
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
