package ȯ��;
import java.util.Scanner;

public class ȯ��_20210621 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dbUSD, inputKRW, exchangeRate;
		int USD, remainKRW;
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("ȯ�� : ");
		exchangeRate = myInput.nextDouble();
		System.out.print("ȯ���� ��ȭ��: ");
		inputKRW = myInput.nextDouble();
		
		dbUSD = inputKRW / exchangeRate;
		USD = (int) dbUSD;
        remainKRW = (int) ((dbUSD - USD) * exchangeRate);
        remainKRW = remainKRW / 10 * 10;

        System.out.printf("\nȯ�� ����� %d�޷� �Դϴ�.\n", USD);
        System.out.printf("���� ��ȭ�� %d�� �Դϴ�.\n", remainKRW);
        
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
                
        System.out.printf("\nȯ�� ����� %d�޷�2 �Դϴ�.\n", USD);
        System.out.printf("���� ��ȭ�� %d��2 �Դϴ�.\n", remainKRW);

        System.out.printf("\nȯ�� �ݾ���\n100�޷� %d��\n", USD100);
        System.out.printf("50�޷� %d��\n", USD50);
        System.out.printf("20�޷� %d��\n", USD20);
        System.out.printf("10�޷� %d��\n", USD10);
        System.out.printf("5�޷� %d��\n", USD5);
        System.out.printf("2�޷� %d��\n", USD2);
        System.out.printf("1�޷� %d������ �ݴϴ�.\n\n", USD1);
        
        System.out.printf("���� ��ȭ��\n1000�� %d��", KRW1000);
        System.out.printf("\n500�� %d��", KRW500);
        System.out.printf("\n100�� %d��", KRW100);
        System.out.printf("\n50�� %d��", KRW50);
        System.out.printf("\n10�� %d���� �����ݴϴ�.", KRW10);

        myInput.close();
	}
}