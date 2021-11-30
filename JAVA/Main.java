class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo\n");
        Car car = new Car("GCW294", new Account("Camilo Cuervo", "CC1015451722"));
        car.printDataCar();

        Car car2 = new Car("AFZ394", new Account("Ana Rivera", "CC169842563"));
        car2.printDataCar();
    }
}