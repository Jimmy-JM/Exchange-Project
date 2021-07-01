package 환전;
import java.util.Scanner;

public class 환전_20210621_종민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dbUSD, inputKRW, exchangeRate;
		int USD, remainKRW;
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("환율 : ");
		exchangeRate = myInput.nextDouble();
		System.out.print("환전할 원화는: ");
		inputKRW = myInput.nextDouble();
		
		dbUSD = inputKRW / exchangeRate;
		USD = (int) dbUSD;
        remainKRW = (int) ((dbUSD - USD) * exchangeRate);
        remainKRW = remainKRW / 10 *10;
       
        System.out.printf("\n환전 결과는 %d달러 입니다.\n", USD);
        System.out.printf("남은 원화는 %d원 입니다.\n", remainKRW);

        System.out.printf("\n환전 금액은\n100달러 %d장\n", USD/100);
        System.out.printf("50달러 %d장\n", USD%100/50);
        System.out.printf("20달러 %d장\n", USD%100%50/20);
        System.out.printf("10달러 %d장\n", USD%100%50%20/10);
        System.out.printf("5달러 %d장\n", USD%100%50%20%10/5);
        System.out.printf("2달러 %d장\n", USD%100%50%20%10%5/2);
        System.out.printf("1달러 %d장으로 줍니다.\n\n", USD%100%50%20%10%5%2/1);
        
        System.out.printf("남은 원화는\n1000원 %d장", remainKRW/1000);
        System.out.printf("\n500원 %d개", remainKRW%1000/500);
        System.out.printf("\n100원 %d개", remainKRW%1000%500/100);	
        System.out.printf("\n50원 %d개", remainKRW%1000%500%100/50);	
        System.out.printf("\n10원 %d개로 돌려줍니다.", remainKRW%1000%500%100/10);

        myInput.close();
	}
}