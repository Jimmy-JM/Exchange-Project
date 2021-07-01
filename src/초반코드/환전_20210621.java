package 환전;
import java.util.Scanner;

public class 환전_20210621 {

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
        remainKRW = remainKRW / 10 * 10;

        System.out.printf("\n환전 결과는 %d달러 입니다.\n", USD);
        System.out.printf("남은 원화는 %d원 입니다.\n", remainKRW);
        
        int USD100, USD50, USD20, USD10, USD5, USD2, USD1;
        USD100 = USD / 100;
        USD = USD - USD100 * 100;        
        USD50 = USD / 50;
        USD = USD - USD50 * 50;
        USD20 = USD / 20;
        USD = USD - USD20 * 20;
        USD10 = USD / 10;
        USD = USD - USD10 * 10;
        USD5 = USD / 5;
        USD = USD - USD5 * 5;
        USD2 = USD / 2;
        USD = USD - USD2 * 2;
        USD1 = USD / 1;
        USD = USD - USD1 * 1;
        
        int KRW1000, KRW500, KRW100, KRW50, KRW10;
        KRW1000 = remainKRW / 1000;
        remainKRW = remainKRW - KRW1000 * 1000;        
        KRW500 = remainKRW / 500;
        remainKRW = remainKRW - KRW500 * 500;
        KRW100 = remainKRW / 100;
        remainKRW = remainKRW - KRW100 * 100;
        KRW50 = remainKRW / 50;
        remainKRW = remainKRW - KRW50 * 50;
        KRW10 = remainKRW / 10;
        remainKRW = remainKRW - KRW10 * 10;
                
        System.out.printf("\n환전 결과는 %d달러2 입니다.\n", USD);
        System.out.printf("남은 원화는 %d원2 입니다.\n", remainKRW);

        System.out.printf("\n환전 금액은\n100달러 %d장\n", USD100);
        System.out.printf("50달러 %d장\n", USD50);
        System.out.printf("20달러 %d장\n", USD20);
        System.out.printf("10달러 %d장\n", USD10);
        System.out.printf("5달러 %d장\n", USD5);
        System.out.printf("2달러 %d장\n", USD2);
        System.out.printf("1달러 %d장으로 줍니다.\n\n", USD1);
        
        System.out.printf("남은 원화는\n1000원 %d장", KRW1000);
        System.out.printf("\n500원 %d개", KRW500);
        System.out.printf("\n100원 %d개", KRW100);
        System.out.printf("\n50원 %d개", KRW50);
        System.out.printf("\n10원 %d개로 돌려줍니다.", KRW10);

        myInput.close();
	}
}