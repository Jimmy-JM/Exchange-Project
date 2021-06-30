package È¯Àü;

public class Exchange {

	public static void main(String[] args) {
		ExchangeInput exInput = new ExchangeInput();
		ExchangeOutput exOutput = new ExchangeOutput();
		ExchangeProcess exProcs = new ExchangeProcess();
				
		while(true){
			exInput.inputCurrency();
			exInput.inputAmount();
			exProcs.currencySelect(exInput.currency);
			exProcs.calculation(exInput.inputKRW);
			exProcs.typeOfMoneyKRW();
			exProcs.typeOfMoney(exInput.currency);
			break;
		}
			exOutput.result(exProcs.selectCurrency, exProcs.exchangeRate, exProcs.outputKRW, exProcs.returnMoney, exProcs.KRW1000, exProcs.KRW500, exProcs.KRW100, exProcs.KRW50, exProcs.KRW10);
			exOutput.exchangeMoney(exProcs.selectCurrency, exProcs.USD100, exProcs.USD50, exProcs.USD20, exProcs.USD10, exProcs.USD5, exProcs.USD2, exProcs.USD1,
					exProcs.EUR500, exProcs.EUR200, exProcs.EUR100, exProcs.EUR50, exProcs.EUR20, exProcs.EUR10, exProcs.EUR5,
					exProcs.JPY10000, exProcs.JPY5000, exProcs.JPY2000, exProcs.JPY1000, exProcs.JPY500, exProcs.JPY100, exProcs.JPY50, exProcs.JPY10, exProcs.JPY5, exProcs.JPY1);
	}
}

