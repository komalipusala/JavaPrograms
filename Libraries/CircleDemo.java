//1. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, and also use treeset for the same for circle objects and see what happens.

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Circle implements Comparable<Circle> {
    int x, y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Circle(x: " + x + ", y: " + y + ")";
    }

    @Override
    public int compareTo(Circle other) {
        int thisRadiusSum = this.x + this.y;
        int otherRadiusSum = other.x + other.y;
        return Integer.compare(thisRadiusSum, otherRadiusSum);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Set<Circle> hashSet = new HashSet<>();
        hashSet.add(new Circle(1, 2));
        hashSet.add(new Circle(3, 4));
        hashSet.add(new Circle(1, 2));
        hashSet.add(new Circle(5, 6));

        System.out.println("HashSet (duplicates not allowed):");
        for (Circle c : hashSet) {
            System.out.println(c);
        }

        Set<Circle> treeSet = new TreeSet<>();
        treeSet.add(new Circle(1, 2));
        treeSet.add(new Circle(3, 4));
        treeSet.add(new Circle(1, 2));
        treeSet.add(new Circle(5, 6));

        System.out.println("\nTreeSet (duplicates not allowed, sorted by radius sum):");
        for (Circle c : treeSet) {
            System.out.println(c);
        }
    }
}
