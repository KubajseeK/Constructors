package sk.itsovy.learning;

public class Calculator {

    private boolean power;
    private String name;

    public Calculator(boolean power, String name) {
        this.power = power;
        this.name = name;
    }

    public int add(int a, int b) {
        int adding = (a + b);
        return adding;
    }


    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }
}
