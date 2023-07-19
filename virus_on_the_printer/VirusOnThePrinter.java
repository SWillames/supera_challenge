package virus_on_the_printer;

import java.util.Scanner;

public class VirusOnThePrinter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      String phrase = scanner.nextLine(); 
      do {
        phrase = scanner.nextLine();
      } while (phrase.isEmpty());
      StringBuilder halfPhrase1 = new StringBuilder(phrase.substring(0, phrase.length() / 2));
      StringBuilder halfPhrase2 = new StringBuilder(phrase.substring(phrase.length()/2, phrase.length()));
      halfPhrase1.reverse();
      halfPhrase2.reverse();
      System.out.println(halfPhrase1.toString()+halfPhrase2);

    }
  }
}
