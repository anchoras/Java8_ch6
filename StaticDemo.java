/*
    demo program demonstrates static variables in classes
*/


class StaticDemoClass {
    int x;
    static int y;

    int sum(){
        return x + y;
    }
}

class StaticMeth {
    static int valI = 1024;
    static double valD = 1024.0;

    static int valDiv2() {
        return valI/2;
    }

    static double valDiv2(int div) {
        return valD/div;
    }
}

class StaticDemo {
    public static void main(String args[]) {
        StaticDemoClass obj1 = new StaticDemoClass();
        StaticDemoClass obj2 = new StaticDemoClass();

        obj1.x = 10;
        obj2.x = 20;

        StaticDemoClass.y = 19;

        System.out.println("obj1 sum 1 is: " + obj1.sum());
        System.out.println("obj2 sum 1 is: " + obj2.sum());

        StaticDemoClass.y = 100;

        System.out.println("obj1 sum 2 is: " + obj1.sum());
        System.out.println("obj2 sum 2 is: " + obj2.sum());


        System.out.println();
        System.out.println("val: " + StaticMeth.valI);
        System.out.println("div2: " + StaticMeth.valDiv2());

        StaticMeth.valI = 4;

        System.out.println("val: " + StaticMeth.valI);
        System.out.println("div2: " + StaticMeth.valDiv2());


        System.out.println();
        System.out.println("valD: " + StaticMeth.valD);
        System.out.println("div2D: " + StaticMeth.valDiv2(3));
    }
}