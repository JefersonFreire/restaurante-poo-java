public class Main {
    public static void main(String[] args) {
        Endereco enderecoRestauranteCami = new Endereco();
        Endereco enderecoRestauranteCami2 = new Endereco("13568-100","Endereco Restaurante Cami");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante da Cami");
        restaurante.setCnpj("000.000.000-00");
        restaurante.setEndereco(enderecoRestauranteCami2);

        System.out.println(restaurante);
        System.out.println(enderecoRestauranteCami);
        System.out.println(enderecoRestauranteCami2);
    }
}