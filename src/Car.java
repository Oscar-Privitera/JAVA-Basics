package src;

public class Car {
    private String model;
    private int productionYear;
    private int distance;

    public Car(String model, int productionYear, int distance) {
        this.model = model;
        this.productionYear = productionYear;
        this.distance = distance;
    }

    public void introduce() {
        System.out.println(
                "Model : " + model + " Production year : " + productionYear + " Distance : " + distance + "km");
    }

    public boolean isOld() {
        return productionYear < 2015;
    }

}
