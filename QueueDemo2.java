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

    Queue(Queue obj) {
        this.putloc = obj.putloc;
        this. getloc = obj.getloc;
        q = new char[obj.q.length];

        for(int i=getloc+1; i<=putloc; i++) {
            q[i] = obj.q[i];
        }
    }

    Queue(char[] a) {
        putloc = getloc = 0;
        q = new char[a.length+1];

        for(int i=0; i<a.length; i++) {
            put(a[i]);
        }
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


class QueueDemo2 {
    public static void main(String args[]) {
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);

        char ch;
        int i;

        for(i=0; i<10; i++) {
            q1.put((char) ('A' + i));
        }

        Queue q3 = new Queue(q1);

        System.out.println("Content of q1: ");
        for(i=0; i<10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("Content of q2: ");
        for(i=0; i<name.length; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("Content of q3: ");
        for(i=0; i<10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}