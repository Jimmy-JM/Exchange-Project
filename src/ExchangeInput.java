package ȯ��;

import java.util.Scanner;

public class ExchangeInput {
	Scanner myInput = new Scanner(System.in);
	int currency=0, inputKRW = 0;
	
	public void inputCurrency() {
		do{
			System.out.print("������� ��ȭ�� ȯ���Ͻðڽ��ϱ�?\n(1.USD, 2.EUR, 3.JPY) : ");
			currency = myInput.nextInt();
			if (currency == 0) {
			}
		 }while(currency < 1 || currency > 3);
	}
	
	public void inputAmount() {
		System.out.print("ȯ���� �ݾ�(��ȭ)�� ���Դϱ�? : ");
		inputKRW = myInput.nextInt();	
	}
	
}
