package something;

import java.util.Scanner;

abstract class shape {
    Scanner sc = new Scanner(System.in);

    abstract void Area();
}

class circle extends shape {
    int r;

    public circle() {
        System.out.println("Enter Radius of Circle:");
        this.r = sc.nextInt();
    }

    public void Area() {
        System.out.println("AREA OF CIRCLE: " + 3.14 * r * r);
    }
}

class square extends shape {
    int s;

    public square() {
        System.out.println("Enter Side of Square:");
        this.s = sc.nextInt();
    }

    public void Area() {
        System.out.println("AREA OF SQUARE: " + s * s);
    }
}

class BoundedShape<T extends shape> {
    private T obje;

    public BoundedShape(T obje) {
        this.obje = obje;
    }

    public void gotcha() {
        this.obje.Area();
    }

    public static void main(String args[]) {
        BoundedShape<circle> s = new BoundedShape<circle>(new circle());
        s.gotcha();

        BoundedShape<square> t = new BoundedShape<square>(new square());
        t.gotcha();
    }
}
