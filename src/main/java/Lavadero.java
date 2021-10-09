
public class Lavadero {
    String Placa,Nombre,Vehiculo,Servicio;
    

    public Lavadero(String Placa, String Nombre, String Vehiculo, String Servicio) {
        this.Placa = Placa;
        this.Nombre = Nombre;
        this.Vehiculo = Vehiculo;
        this.Servicio = Servicio;
    }

    Lavadero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setAuto(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setCamio(String Servicio) {
        this.Servicio = Servicio;
    }
    
}
