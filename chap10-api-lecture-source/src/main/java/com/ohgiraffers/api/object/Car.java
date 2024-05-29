package com.ohgiraffers.api.object;

public class Car {

    private String carName;
    private String carColor;
    private int engineCC;

    public Car() {
    }

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {

        return "Car{" +
                "carName=" + carName +
                ", carColor='" + carColor + '\'' +
                ", engineCC='" + engineCC +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car)obj;
        return this.carName.equals(car.carName)  &&
                this.carColor.equals(car.carColor);

    }

    @Override
    public int hashCode() {

        int result = 1;

        final int PRIME = 31;

        result = PRIME * result + this.carName.hashCode();
        result = PRIME * result + this.carColor.hashCode();

        return result;
    }
}
