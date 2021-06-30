package 환전;

public class ExchangeOutput {
	public void result(String selectCurrency,double exchangeRate, int outputKRW, int returnMoney, 
			int KRW1000, int KRW500, int KRW100, int KRW50, int KRW10) {
		System.out.printf("선택하신 통화는 %s이고 환율은 %.2f원입니다.\n", selectCurrency, exchangeRate);		
		System.out.println();
		System.out.printf("환전 금액은 %d%s입니다.\n", returnMoney, selectCurrency);
		System.out.printf("남은 원화는 %d원입니다.\n", outputKRW);
		System.out.println();
		System.out.printf("남은 원화는\n1000원 %d장", KRW1000);
		System.out.printf("\n 500원 %d개", KRW500);
		System.out.printf("\n 100원 %d개", KRW100);
		System.out.printf("\n  50원 %d개", KRW50);
		System.out.printf("\n  10원 %d개로 줍니다.", KRW10);
		System.out.println();
	}

	public void exchangeMoney(String selectCurrency, int USD100, int USD50, int USD20, int USD10, int USD5, int USD2, int USD1,
			int EUR500, int EUR200, int EUR100, int EUR50, int EUR20, int EUR10, int EUR5,
			int JPY10000, int JPY5000, int JPY2000, int JPY1000, int JPY500, int JPY100, int JPY50, int JPY10, int JPY5, int JPY1) {
		if(selectCurrency == "USD") {
			System.out.printf("\n환전 금액은\n100달러 %d장\n", USD100);
			System.out.printf(" 50달러 %d장\n", USD50);
			System.out.printf(" 20달러 %d장\n", USD20);
			System.out.printf(" 10달러 %d장\n", USD10);
			System.out.printf("  5달러 %d장\n", USD5);
			System.out.printf("  2달러 %d장\n", USD2);
			System.out.printf("  1달러 %d장으로 줍니다.\n\n", USD1);
		} else if (selectCurrency == "EUR") {
			System.out.printf("\n환전 금액은\n500유로 %d장\n", EUR500);
			System.out.printf("200유로 %d장\n", EUR200);
			System.out.printf("100유로 %d장\n", EUR100);
			System.out.printf(" 50유로 %d장\n", EUR50);
			System.out.printf(" 20유로 %d장\n", EUR20);
			System.out.printf(" 10유로 %d장\n", EUR10);
			System.out.printf("  5유로 %d장으로 줍니다.\n\n", EUR5);
		} else { 			
			System.out.printf("\n환전 금액은\n10000엔 %d장\n", JPY10000);
			System.out.printf(" 5000엔 %d장\n", JPY5000);
			System.out.printf(" 2000엔 %d장\n", JPY2000);
			System.out.printf(" 1000엔 %d장\n", JPY1000);
			System.out.printf("  500엔 %d개\n", JPY500);
			System.out.printf("  100엔 %d개\n", JPY100);
			System.out.printf("   50엔 %d개\n", JPY50);
			System.out.printf("   10엔 %d개\n", JPY10);
			System.out.printf("    5엔 %d개\n", JPY5);
			System.out.printf("    1엔 %d개로 줍니다.\n\n", JPY1);
		}
	}
}


	
	

