package collection.comparableandcomparator;

public class Car1 implements Comparable<Car1> {

    String carName;
    String carType;

    public Car1() {

    }

    public Car1(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    @Override
    public int compareTo(Car1 o) {
        return this.carName.compareTo(o.carName);
    }

    @Override
    public String toString() {
        return "Car1{" +
                "carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
