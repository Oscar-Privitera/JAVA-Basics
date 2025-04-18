package src;

public class CarManager {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car("Tesla Model Y", 2023, 57831);
        cars[1] = new Car("Audi TT", 2019, 13678);
        cars[2] = new Car("Bugatti Chiron", 2022, 2678);
        cars[3] = new Car("Bugatti Veyron", 2008, 1531);

        for (Car car : cars) {
            car.introduce();
            if (car.isOld()) {
                System.out.println("⚠️ This car is considered old.\n");
            } else {
                System.out.println("This car is recent.\n");
            }
        }
    }
}
