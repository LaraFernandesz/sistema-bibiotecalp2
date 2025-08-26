public class Biblioteca {
    public static void main(String[] args) {
        Usuario user1 = new Usuario(123, "Thiago");
        Usuario user2 = new Usuario(123, "Thiago");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
