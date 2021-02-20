/*
    demo program demonstrates inner class using
*/

class Outer {
    int nums[];

    Outer(int[] n) {
        nums = n;
    }

    static int testIntStatic = 10;
    int testIntPublic = 12;

    void Analyze() {
        Inner inObj = new Inner();

        System.out.println("Minimum: " + inObj.min());
        System.out.println("Maximum: " + inObj.max());
        System.out.println("Average: " + inObj.avg());
    }


    void testMethodOuterPublic() {
        Inner inObj = new Inner();
        
        inObj.testMethodInnerPublic();
    }


    class Inner {
        int testIntPublicInner = -12;
    
        void testMethodInnerPublic() {
            System.out.println("Outer static from Outer: " + testIntStatic);
            System.out.println("Outer normal from Outer: " + testIntPublic);
        }

        int min() {
            int m = nums[0];

            for(int i=1; i<nums.length; i++)
                if(nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];

            for(int i=1; i<nums.length; i++)
                if(nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int sum = 0;

            for(int i=0; i<nums.length; i++)
                sum += nums[i];
                
            return sum/nums.length;
        }
    }
}

class NestedClassDemo {
    public static void main(String args[]) {
        int[] x = { 3, 2, 1, 5, 6, 9, 7, 8 };
        Outer outObj = new Outer(x);

        outObj.Analyze();

        outObj.testMethodOuterPublic();
    }
}