public class Usuario {
  private String name;
  private String apellido;
  
  public Usuario(String name, String apellido) {
    this.name = name;
    this.apellido = apellido;
  }

  public String getName() {
    return "Nombre: " + name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getApellido() {
    return "Apellido :" + apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  
}
