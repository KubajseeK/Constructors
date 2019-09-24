package sk.itsovy.learning;


public class Calculator {

    private boolean power;
    private String name;

    public Calculator(String name) {
        this.name = name;
        power = false;
    }

    public int add(int a, int b) {
        if (isPower()) {
            return a + b;
        } else {
            return 0;
        }
    }


    public boolean isPower() {
        return power;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public int calculateSquareArea (int a) {
        if (isPower()) {
            return (a * a);
        }else {
            return 0;
        }
    }

    public double centimeterToInch(double a) {
        if (isPower()) {
            return (a * 0.393);
        }else {
            return 0;
        }
    }

    public double inchToCentimeter(double a) {
        if (isPower()) {
            return (a * 2.54);
        }else {
            return 0;
        }
    }
    public void togglePower() {
        if (isPower()) {
            turnOff();
        }else {
            turnOn();

            //power = !power;
        }
    }

    public String convertDecimalToHexadecimal(int a) {
        if (isPower()) {
            return Integer.toHexString(a);
        }else {
            return null;
        }
    }


}
