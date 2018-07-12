package ObserverPackage;

import java.util.Scanner;

public class demo
{
 public static void main(String[] args)
 {
     Subject sub = new Subject();
     new USDObserver(sub);
     new GBPObserver(sub);
     new EuroObserver(sub);
     Scanner scan = new Scanner(System.in);
     for (int i = 0; i < 5; i++) {
         System.out.print("\nEnter a number: ");
         sub.setState(scan.nextInt());
     }


 }
}
