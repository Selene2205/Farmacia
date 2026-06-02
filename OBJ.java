package FARMACIA;

public class OBJ {
    private String CodigoMedicamento;
    private String Nombre;
    private int CantidadDisponible;
    private Double PrecioUnitario;
    private Double TotalInventario;

    public OBJ() {
    }

    public OBJ(String codigoMedicamento, String nombre, int cantidadDisponible, Double precioUnitario,
            Double totalInventario) {
        CodigoMedicamento = codigoMedicamento;
        Nombre = nombre;
        CantidadDisponible = cantidadDisponible;
        PrecioUnitario = precioUnitario;
        TotalInventario = totalInventario;
    }

    public String getCodigoMedicamento() {
        return CodigoMedicamento;
    }

    public void setCodigoMedicamento(String codigoMedicamento) {
        CodigoMedicamento = codigoMedicamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidadDisponible() {
        return CantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        CantidadDisponible = cantidadDisponible;
    }

    public Double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }

    public Double getTotalInventario() {
        return TotalInventario;
    }

    public void setTotalInventario(Double totalInventario) {
        TotalInventario = totalInventario;
    }
}
