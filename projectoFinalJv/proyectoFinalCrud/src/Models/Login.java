package Models;

public class Login {
    Long id;
    String nombre;
    String email;
    String ususario;
    String contrasenia;
    
    public Login(Long id, String nombre, String email, String ususario, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.ususario = ususario;
        this.contrasenia = contrasenia;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsusario() {
        return ususario;
    }
    public void setUsusario(String ususario) {
        this.ususario = ususario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
