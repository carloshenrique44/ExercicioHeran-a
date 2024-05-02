public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Mercedes", "E63S", 4);
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + ", Número de Portas: " + carro.getNumeroPortas());

        Moto moto = new Moto("BMW", "S1000RR", 1000);
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo() + ", Cilindrada: " + moto.getCilindrada() + "cc");
    }
}