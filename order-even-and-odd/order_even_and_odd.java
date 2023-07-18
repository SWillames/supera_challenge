import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;

public class order_even_and_odd {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidades de entrada: ");
    int n = scanner.nextInt();
    List<Integer> listNumbers = new ArrayList<>();
    List<Integer> evens = new ArrayList<>();
    List<Integer> odds = new ArrayList<>();
    List<Integer> finalList = new ArrayList<>();

    System.out.println("\nNumero de entradas ");
    System.out.println(n);
    System.out.println("\n*********************");

    for (int i= 0; i < n; i++) {
      int number = scanner.nextInt();
      
      if (number > 100000 || number < 1) {
        System.out.println("Erro!! digite numeros no intervalo entre 1 e 100000");
        i -= 1;
      } else {
        listNumbers.add(number);
      }

    }

    for(Integer i: listNumbers){
      if (i % 2 == 0) {
        evens.add(i);
      } else {
        odds.add(i);
      }
    }

    System.out.println("\n*********************");

    finalList.addAll(evens.stream().sorted().collect(Collectors.toList()));
    finalList.addAll(odds.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    System.out.println("\nLista Final");
    finalList.forEach(System.out::println);

  }

}