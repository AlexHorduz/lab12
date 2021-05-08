package lab12;

import lab12.models.Rectangle;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 5);

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(Rectangle::new)
                .filter(Rectangle::isSquareStatic)
                .filter(Rectangle::isSquare)
                .filter(r::equals)
                .forEach(System.out::println);
    }
}
