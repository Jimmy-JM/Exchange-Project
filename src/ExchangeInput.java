package 환전;

import java.util.Scanner;

public class ExchangeInput {
	Scanner myInput = new Scanner(System.in);
	int currency=0, inputKRW = 0;
	
	public void inputCurrency() {
		do{
			System.out.print("어느나라 통화로 환전하시겠습니까?\n(1.USD, 2.EUR, 3.JPY) : ");
			currency = myInput.nextInt();
			if (currency == 0) {
			}
		 }while(currency < 1 || currency > 3);
	}
	
	public void inputAmount() {
		System.out.print("환전할 금액(원화)은 얼마입니까? : ");
		inputKRW = myInput.nextInt();	
	}
	
}
