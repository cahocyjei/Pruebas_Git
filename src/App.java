public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario usuario =new Usuario("Omar", "Cabarcas");
        Usuario usuario2 =new Usuario("Camilo", "Cabarcas");

        System.out.println("Nombre de usuario y apellido: " + usuario.getName()+" " + usuario.getApellido());

    }
}
