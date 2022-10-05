public class Main {
    public static void main (String[] args) {
        Facade facada = new Facade();

        facada.criarProduto("Halter", "Haecchan", 20.5);
        System.out.println(facada.listarProdutos());
        facada.criarProduto("iPhone", "Taeyong", 244444.5);
        System.out.println(facada.listarProdutos());
    }
}