package sistema_iptu;

public class Main {
    public static void main(String[] args) {
        Municipio brasilia = new Municipio("DF", "Brasilia", 65.5);

        Apartamento apt = new Apartamento(true, 52.0, brasilia, 1);

        System.out.println("IPTU R$: "+ apt.calcularIPTU());
    }
}
