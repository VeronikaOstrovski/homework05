public class Car extends Transport {

    int numberVIN;
    int stateNumber;

    public int getNumberVIN() {
        return numberVIN;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public void setNumberVIN(int numberVIN) {
        this.numberVIN = numberVIN;
    }

    public void setStateNumber(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}