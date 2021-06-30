package È¯Àü;

public class ExchangeProcess {
	final double EXCHANGE_RATE_USD = 1131.80;
	final double EXCHANGE_RATE_EUR = 1346.23;
	final double EXCHANGE_RATE_JPY = 10.21;
	String selectCurrency = "";
	int USD = 0, EUR = 0, JPY = 0, remainKRW = 0, returnMoney = 0, outputKRW;
	double exchangeRate = 0, exchange = 0;
	int KRW1000, KRW500, KRW100, KRW50, KRW10;
	int USD100, USD50, USD20, USD10, USD5, USD2, USD1;
	int EUR500, EUR200, EUR100, EUR50, EUR20, EUR10, EUR5;
	int JPY10000, JPY5000, JPY2000, JPY1000, JPY500, JPY100, JPY50, JPY10, JPY5, JPY1;
	
	public void currencySelect(int currency) {
		switch(currency) {
		case 1:
			selectCurrency = "USD";
			exchangeRate = EXCHANGE_RATE_USD;
		break;
		case 2:
			selectCurrency = "EUR";
			exchangeRate = EXCHANGE_RATE_EUR;
		break;
		case 3:
			selectCurrency = "JPY";
			exchangeRate = EXCHANGE_RATE_JPY;
		break;
		}
	}

	public void calculation(int inputKRW) {
		exchange = inputKRW / exchangeRate;
		returnMoney = (int) exchange;
		exchange = exchange - returnMoney;
		remainKRW = (int) (exchange * exchangeRate);
		remainKRW = remainKRW / 10 * 10;
		outputKRW = this.remainKRW;
	}
		
	public void typeOfMoneyKRW() {
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
	}
	
	public void typeOfMoney(int currency) {
		if(currency == 1) {
			USD100 = returnMoney / 100; 
			USD = returnMoney - USD100 * 100;        
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
		}
		else if(currency == 2) {
			EUR500 = returnMoney / 500;
			EUR = returnMoney - EUR500 * 500;        
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
		}
		else {
			JPY10000 = returnMoney / 10000;
			JPY = returnMoney - JPY10000 * 10000;        
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
		}
	}


}