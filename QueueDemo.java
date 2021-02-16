/*
    demo program for demonstrate queue basics
*/

class Queue {
    private char q[];
    private int putloc, getloc; //index of put into location and get from location

    Queue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc==q.length-1) {
            System.out.println("Queue is full");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}


class QueueDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue littleQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using queue bigQ for save alphabet");
        for(i=0; i<26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.println("variables in the bigQ are: ");
        for(i=0; i<26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) {
                System.out.print(ch + " ");
            }
        }

        System.out.println("\n");

        System.out.println("Using queue littleQ for errors generation");
        for(i=0; i<5; i++) {
            System.out.print("Trying save " + (char) ('Z' - i));
            littleQ.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.println("variables in the littleQ are: ");
        for(i=0; i<5; i++) {
            ch = littleQ.get();
            if(ch != (char) 0) {
                System.out.print(ch + " ");
            }
        }
    }
}