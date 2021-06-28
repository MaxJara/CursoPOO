class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Max Jara";
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Andrea Olivares";
        car2.passegenger = 3;
        car2.printDataCar();
    }
}