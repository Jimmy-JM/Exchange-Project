package ȯ��;
import java.util.Scanner;

public class ȯ��_20210622_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double EXCHANGE_RATE_USD = 1131.80;
		final double EXCHANGE_RATE_EUR = 1346.23;
		final double EXCHANGE_RATE_JPY = 10.25;
		double outputUSD, outputEUR, outputJPY;
		int USD, remainKRW = 0, currency, inputKRW, EUR, JPY;
		
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("ȯ���� ��ȭ��: ");
		inputKRW = myInput.nextInt();
		System.out.print("ȯ���� ��ȭ��: ");
		currency = myInput.nextInt();				
		
		if(currency == 1) {
			System.out.println("\n�����Ͻ� ȯ�� ��ȭ�� USD�Դϴ�.");
			outputUSD = inputKRW / EXCHANGE_RATE_USD;
			USD = (int) outputUSD;
			remainKRW = (int) ((outputUSD - USD) * EXCHANGE_RATE_USD);
			remainKRW = remainKRW / 10 * 10;

			System.out.printf("\nȯ�� �ݾ��� %d�޷� �Դϴ�.\n", USD);
			System.out.printf("�ܵ� ��ȭ�� %d�� �Դϴ�.\n", remainKRW);
        
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
        
			System.out.printf("\nȯ�� �ݾ���\n100�޷� %d��\n", USD100);
			System.out.printf("50�޷� %d��\n", USD50);
			System.out.printf("20�޷� %d��\n", USD20);
			System.out.printf("10�޷� %d��\n", USD10);
			System.out.printf("5�޷� %d��\n", USD5);
			System.out.printf("2�޷� %d��\n", USD2);
			System.out.printf("1�޷� %d������ �ݴϴ�.\n\n", USD1);
		}
		if(currency == 2) {
			System.out.println("\n�����Ͻ� ȯ�� ��ȭ�� EUR�Դϴ�.");
			outputEUR = inputKRW / EXCHANGE_RATE_EUR;
			EUR = (int) outputEUR;
			remainKRW = (int) ((outputEUR - EUR) * EXCHANGE_RATE_EUR);
			remainKRW = remainKRW / 10 * 10;

			System.out.printf("\nȯ�� ����� %d���� �Դϴ�.\n", EUR);
			System.out.printf("���� ��ȭ�� %d�� �Դϴ�.\n", remainKRW);
        
			int EUR500, EUR200, EUR100, EUR50, EUR20, EUR10, EUR5;
			EUR500 = EUR / 500;
			EUR = EUR - EUR500 * 500;        
			EUR200 = EUR / 200;
			EUR = EUR - EUR200 * 200;
			EUR100 = EUR / 100;
			EUR = EUR - EUR100 * 100;
			EUR50 = EUR / 50;
			EUR = EUR - EUR50 * 50;
			EUR20 = EUR / 20;
			EUR = EUR - EUR20 * 20;
			EUR10 = EUR / 10;
			EUR = EUR - EUR10 * 10;
			EUR5 = EUR / 5;
			EUR = EUR - EUR5 * 5;
        
			System.out.printf("\nȯ�� �ݾ���\n500���� %d��\n", EUR500);
			System.out.printf("200���� %d��\n", EUR200);
			System.out.printf("100���� %d��\n", EUR100);
			System.out.printf("50���� %d��\n", EUR50);
			System.out.printf("20���� %d��\n", EUR20);
			System.out.printf("10���� %d��\n", EUR10);
			System.out.printf("5���� %d������ �ݴϴ�.\n\n", EUR5);
		}
		if(currency == 3) {
			System.out.println("\n�����Ͻ� ȯ�� ��ȭ�� JPY�Դϴ�.");
			outputJPY = inputKRW / EXCHANGE_RATE_JPY;
			JPY = (int) outputJPY;
			remainKRW = (int) ((outputJPY - JPY) * EXCHANGE_RATE_JPY);
			remainKRW = remainKRW / 10 * 10;

			System.out.printf("\nȯ�� ����� %d�� �Դϴ�.\n", JPY);
			System.out.printf("���� ��ȭ�� %d�� �Դϴ�.\n", remainKRW);
        
			int JPY10000, JPY5000, JPY2000, JPY1000, JPY500, JPY100, JPY50, JPY10, JPY5, JPY1;
			JPY10000 = JPY / 10000;
			JPY = JPY - JPY10000 * 10000;        
			JPY5000 = JPY / 5000;
			JPY = JPY - JPY5000 * 5000;
			JPY2000 = JPY / 2000;
			JPY = JPY - JPY2000 * 2000;
			JPY1000 = JPY / 1000;
			JPY = JPY - JPY1000 * 1000;
			JPY500 = JPY / 500;
			JPY = JPY - JPY500 * 500;
			JPY100 = JPY / 100;
			JPY = JPY - JPY100 * 100;
			JPY50 = JPY / 50;
			JPY = JPY - JPY50 * 50;
			JPY10 = JPY / 10;
			JPY = JPY - JPY10 * 10;
			JPY5 = JPY / 5;
			JPY = JPY - JPY5 * 5;
			JPY1 = JPY / 1;
			JPY = JPY - JPY1 * 1;
			
			System.out.printf("\nȯ�� �ݾ���\n10000�� %d��\n", JPY10000);
			System.out.printf("5000�� %d��\n", JPY5000);
			System.out.printf("2000�� %d��\n", JPY2000);
			System.out.printf("1000�� %d��\n", JPY1000);
			System.out.printf("500�� %d��\n", JPY500);
			System.out.printf("100�� %d��\n", JPY100);
			System.out.printf("50�� %d��\n", JPY50);
			System.out.printf("10�� %d��\n", JPY10);
			System.out.printf("5�� %d��\n", JPY5);
			System.out.printf("1�� %d������ �ݴϴ�.\n\n", JPY1);
			
		}
	
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
    
		System.out.printf("���� ��ȭ��\n1000�� %d��", KRW1000);
		System.out.printf("\n500�� %d��", KRW500);
		System.out.printf("\n100�� %d��", KRW100);
		System.out.printf("\n50�� %d��", KRW50);
		System.out.printf("\n10�� %d���� �����ݴϴ�.", KRW10);

        myInput.close();
	}
}