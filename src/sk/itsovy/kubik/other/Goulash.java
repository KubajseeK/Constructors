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
}
