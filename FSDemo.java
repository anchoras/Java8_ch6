/*
    demo program demonstrates usin privacy flags for accesabilty of class data
    in this example there is an array, which can be modified and read only by this class methods
*/

class FailSoftArray {
    private int[] a;
    private int errval;

    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            //System.out.print("val: " + a[index]);
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        if(index >=0 & index<length) return true;
        return false;
    }
}


class FSDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        System.out.println("Error processing without printing the output");
        for(int i=0; i<(fs.length*2); i++)
            fs.put(i, i*10);
        
        for(int i=0; i<(fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println();


        System.out.println("\nError processing with printing the ouput");
        for(int i=0; i<(fs.length*2); i++)
            if(!fs.put(i, i*20))
                System.out.println("Index " + i + " is out of the valid range");
/*             else
                System.out.print(); */

        for(int i=0; i<(fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1)
                System.out.print(x + " ");
            else
                System.out.println("Index " + i + " is out of the valid range");
        }
    }
}