class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo\n");
        Car car = new Car();
        car.driver = "Camilo Cuervo";
        car.license = "GCW294";
        car.printDataCar();

        Car car2 = new Car();
        car2.driver = "Ana Rivera";
        car2.license = "AFZ394";
        car2.printDataCar();
    }
}