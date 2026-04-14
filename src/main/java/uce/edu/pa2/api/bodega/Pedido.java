package uce.edu.pa2.api.bodega;

public class Pedido {
    private String cliente;
    private String produto;
    private double total;
    private String destino;
    private String telefono;

    public Pedido() {

    }

    public Pedido(String cliente, String produto, double total, String correo, String telefono) {
        this.cliente = cliente;
        this.produto = produto;
        this.total = total;
        this.destino = correo;
        this.telefono = telefono;
    }

    // Metodos getter y setter
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String correo) {
        this.destino = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
