
package Clases;


public class Cliente {
    
    int idCliente;
    String NombreCliente;
    String ApellidoCliente;
    String NitCliente;
    String TelefonoCliente;
    String CorreoECliente;
    String DireccionCliente; 
    String EstadoCliente;

    public Cliente(int idCliente, String NombreCliente, String ApellidoCliente, String NitCliente, String TelefonoCliente, String CorreoECliente, String DireccionCliente, String EstadoCliente) {
        this.idCliente = idCliente;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.NitCliente = NitCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.CorreoECliente = CorreoECliente;
        this.DireccionCliente = DireccionCliente;
        this.EstadoCliente = EstadoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getNitCliente() {
        return NitCliente;
    }

    public void setNitCliente(String NitCliente) {
        this.NitCliente = NitCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getCorreoECliente() {
        return CorreoECliente;
    }

    public void setCorreoECliente(String CorreoECliente) {
        this.CorreoECliente = CorreoECliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public String getEstadoCliente() {
        return EstadoCliente;
    }

    public void setEstadoCliente(String EstadoCliente) {
        this.EstadoCliente = EstadoCliente;
    }
    
    public boolean CrearCliente(){
    return true;
    }
    
}
