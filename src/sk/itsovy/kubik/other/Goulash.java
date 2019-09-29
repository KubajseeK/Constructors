package sk.itsovy.kubik.other;

public class Goulash {
    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayNHello(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print("Hello ");
            i++;
        }
        System.out.println(); //odriadkovanie
    }

    public void sayHi() {
        System.out.print("Hi ");
    }

    public void sayNHi(int n) {
        for (int i = 1; i <= n; i++) {
            sayHi();
        }
        System.out.println();
    }

    public int getEvenNumber(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            a++;
            return a;
        }

    }

    public double getPozicka(int mes, double urok, double suma) {
        return (suma * urok + suma) / mes;

    }

    public void test() {
        int time = 514623; //sekundy
            int day = time / 86400;
            time = time % 86400;
            int hour = time / 3600;
            time = time % 3600;
            int minute = time / 60;
            time = time % 60;
        System.out.println(day + " " + hour + " " + minute + " ");
        }

        public void addingNumbers() {
        int sum = 0;
        int value = 1;
            for (int i = 1; i <= 30; i++) {
                System.out.println(sum+value);
                value = value * 2;
            }
            System.out.println(sum / 100);
        }
    }


