package sk.itsovy.learning;

public class Calculator {

    private boolean power;
    private String name;

    public Calculator(String name) {
        this.name = name;
        power = false;
    }

    public int add(int a, int b) {
       return a + b;
    }


    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }


}
