package ȯ��;

public class ExchangeOutput {
	public void result(String selectCurrency,double exchangeRate, int outputKRW, int returnMoney, 
			int KRW1000, int KRW500, int KRW100, int KRW50, int KRW10) {
		System.out.printf("�����Ͻ� ��ȭ�� %s�̰� ȯ���� %.2f���Դϴ�.\n", selectCurrency, exchangeRate);		
		System.out.println();
		System.out.printf("ȯ�� �ݾ��� %d%s�Դϴ�.\n", returnMoney, selectCurrency);
		System.out.printf("���� ��ȭ�� %d���Դϴ�.\n", outputKRW);
		System.out.println();
		System.out.printf("���� ��ȭ��\n1000�� %d��", KRW1000);
		System.out.printf("\n 500�� %d��", KRW500);
		System.out.printf("\n 100�� %d��", KRW100);
		System.out.printf("\n  50�� %d��", KRW50);
		System.out.printf("\n  10�� %d���� �ݴϴ�.", KRW10);
		System.out.println();
	}

	public void exchangeMoney(String selectCurrency, int USD100, int USD50, int USD20, int USD10, int USD5, int USD2, int USD1,
			int EUR500, int EUR200, int EUR100, int EUR50, int EUR20, int EUR10, int EUR5,
			int JPY10000, int JPY5000, int JPY2000, int JPY1000, int JPY500, int JPY100, int JPY50, int JPY10, int JPY5, int JPY1) {
		if(selectCurrency == "USD") {
			System.out.printf("\nȯ�� �ݾ���\n100�޷� %d��\n", USD100);
			System.out.printf(" 50�޷� %d��\n", USD50);
			System.out.printf(" 20�޷� %d��\n", USD20);
			System.out.printf(" 10�޷� %d��\n", USD10);
			System.out.printf("  5�޷� %d��\n", USD5);
			System.out.printf("  2�޷� %d��\n", USD2);
			System.out.printf("  1�޷� %d������ �ݴϴ�.\n\n", USD1);
		} else if (selectCurrency == "EUR") {
			System.out.printf("\nȯ�� �ݾ���\n500���� %d��\n", EUR500);
			System.out.printf("200���� %d��\n", EUR200);
			System.out.printf("100���� %d��\n", EUR100);
			System.out.printf(" 50���� %d��\n", EUR50);
			System.out.printf(" 20���� %d��\n", EUR20);
			System.out.printf(" 10���� %d��\n", EUR10);
			System.out.printf("  5���� %d������ �ݴϴ�.\n\n", EUR5);
		} else { 			
			System.out.printf("\nȯ�� �ݾ���\n10000�� %d��\n", JPY10000);
			System.out.printf(" 5000�� %d��\n", JPY5000);
			System.out.printf(" 2000�� %d��\n", JPY2000);
			System.out.printf(" 1000�� %d��\n", JPY1000);
			System.out.printf("  500�� %d��\n", JPY500);
			System.out.printf("  100�� %d��\n", JPY100);
			System.out.printf("   50�� %d��\n", JPY50);
			System.out.printf("   10�� %d��\n", JPY10);
			System.out.printf("    5�� %d��\n", JPY5);
			System.out.printf("    1�� %d���� �ݴϴ�.\n\n", JPY1);
		}
	}
}


	
	

