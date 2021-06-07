public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario usuario =new Usuario("Omar", "Cabarcas");

        System.out.println("Nombre de usuario y apellido: " + usuario.getName()+" " + usuario.getApellido());

    }
}
