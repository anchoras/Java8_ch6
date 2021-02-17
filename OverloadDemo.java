/*
    demo program demonstrates methods overload in Java
*/

class Overload {
    void ovlDemo() {
        System.out.println("No parameters");
    }
    
    void ovlDemo(int a) {
        System.out.println("1 int parameter: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("2 int parameters: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("2 double parameters: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(int a, double b) {
        System.out.println("1 int parameter 1 double parameter: " + a + " " + b);
        return a - b;
    }
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload obj = new Overload();
        int resI;
        double resD;

        obj.ovlDemo();
        System.out.println();

        obj.ovlDemo(2);
        System.out.println();

        resI = obj.ovlDemo(4, 6);
        System.out.println("result (int 4, int 6) is: " + resI);
        System.out.println();

        resD = obj.ovlDemo(1.1, 2.32);
        System.out.println("result (double 1.1, double 2.32) is: " + resD);
        System.out.println();

        resD = obj.ovlDemo(1, 2.32);
        System.out.println("result (int 1, double 2.32) is: " + resD);
        System.out.println();
    }
}