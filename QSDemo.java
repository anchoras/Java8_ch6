/*
    demo program demonstrates QuickSort
*/

class Quicksort {
    static void qsort (char items[]) {
        qs(items, 0, items.length-1);
    }

    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left+right)/2];
        System.out.println("pivot is: " + x);

        do {
            while((items[i]<x) && (i<right)) i++;
            while((x<items[j]) && (j>left)) j--;

            if(i<=j) {
                System.out.print("sorting... ");
                for(int cnt=left; cnt<=right; cnt++)
                    System.out.print(items[cnt] + " ");
                System.out.print("\ni: " + i + " j: " + j + "\n");
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while(i <= j);
        System.out.println("\n");
/*         for(int cnt=0; cnt<items.length; cnt++) {
            System.out.print(items[cnt] + " ");
        }
        System.out.println(); */

        if(left<j) qs(items, left, j);
        if(i<right) qs(items, i, right);
    }
}


class QSDemo {
    public static void main(String args[]) {
        //char[] a = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        char[] a = { 'h', 'k', 'e', 'f', 'c', 'g', 'c' };
        System.out.println("Unsorted array: ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        Quicksort.qsort(a);

        System.out.println("Sorted array: ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}