package sk.itsovy.learning;

public class Person {
    private String name;
    private int age;
    private boolean isMale; //T = Male, F = Female
    private double height;
    private int weight;
    private char status; //S = Single, M = Married, D = Divorced, W = Widowed
    private Mobile mobile;

    public Person(String name, int age, boolean isMale, double height, int weight, char status) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.height = height;
        this.weight = weight;
        this.status = status;
    }
    public Person() {

    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
    public String sayHi() {
        return "Hi!";
    }
    void about() {
        System.out.println("Hello I am neviem čo a ty si buzerant.");
    }
     double calculateBMI() {
        double bmi;
         bmi = (weight / (height * height));
         return bmi;
     }
     String getBMIStatus() {
        if (calculateBMI() < 20 && calculateBMI() >= 15) {
            return "Underweight";
        }
        if (calculateBMI() >= 20 && calculateBMI() <= 25) { // referencia metódy musí byť vypisovaná osobitne f.e (if calculateBMI() ... && calculateBMI()
            return "Optimal";
         }
         if (calculateBMI() > 25 && calculateBMI() <= 30) {
             return "Overweight";
         }
         if (calculateBMI() > 30) {
             return "Obese";
         } else {
             return null;
         }
     }

     int getYearOfBirth() {
        return 2019 - age;
     }
     public void setName(String meno) {
        name = meno;
     }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public char getStatus() {
        return status;
    }
}
