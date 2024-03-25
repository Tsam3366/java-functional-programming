package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
      Optional.ofNullable(null)
              .ifPresentOrElse(
                      value-> System.out.println(value+" Sam"),
                      ()-> System.out.println("Bye")
              );
//        System.out.println(s);
    }
}
