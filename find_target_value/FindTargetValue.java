package find_target_value;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTargetValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor alvo: ");
    int target_value =  scanner.nextInt();
    System.out.println("Digite o tamanho da lista: ");
    int n = scanner.nextInt();
    int count_find = 0;
    int[] list = new int[n];
    System.out.println("Digite os valores da lista: ");
    for (int i = 0; i < n; i++) {
      list[i] = scanner.nextInt();
    }

    for(int i = 0; i < list.length-1; i++){
      for(int j = i+1; j < list.length; j++){
        int a = Math.abs(list[i] - list[j]);
        if (a == target_value) {
          count_find++;
          
        }
      }
    }
    System.out.println("O valor alvo foi encontrado "
                       +count_find+" vezes");
  }
}
