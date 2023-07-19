package count_money;
import java.util.Scanner;

public class CountMoney {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    int value = 0;
    int[] money_notes = new int[]{100, 50, 20, 10, 5, 2};
    int[] coins = new int[]{100, 50, 25, 10, 5, 1};

    System.out.println("NOTAS: ");
            
    for (int i = 0; i < money_notes.length; i++){
      value = (int) payment / money_notes[i];
      System.out.printf("%d nota(s) de R$" + money_notes[i] + ".00%n", value);
      payment = payment % money_notes[i];
    }
    
    payment = payment * 100.0;

    System.out.println("MOEDAS: ");
      
    for (int i = 0; i < coins.length; i++){
      
      value = (int) payment / coins[i] ;
     
      if (i == 0) {
        System.out.printf("%d moeda(s) de R$ 1.00%n", value);
      } else if (i == coins.length -1){
        System.out.printf("%d moedas de R$ 0.0" + coins[i] + "%n", value);
      } else {
        System.out.printf("%d moedas de R$ 0." + coins[i] + "%n", value);
      }
      payment = payment % coins[i];

    }
  }
}
