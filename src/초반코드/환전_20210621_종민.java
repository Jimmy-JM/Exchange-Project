package ȯ��;
import java.util.Scanner;

public class ȯ��_20210621_���� {

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
        remainKRW = remainKRW / 10 *10;
       
        System.out.printf("\nȯ�� ����� %d�޷� �Դϴ�.\n", USD);
        System.out.printf("���� ��ȭ�� %d�� �Դϴ�.\n", remainKRW);

        System.out.printf("\nȯ�� �ݾ���\n100�޷� %d��\n", USD/100);
        System.out.printf("50�޷� %d��\n", USD%100/50);
        System.out.printf("20�޷� %d��\n", USD%100%50/20);
        System.out.printf("10�޷� %d��\n", USD%100%50%20/10);
        System.out.printf("5�޷� %d��\n", USD%100%50%20%10/5);
        System.out.printf("2�޷� %d��\n", USD%100%50%20%10%5/2);
        System.out.printf("1�޷� %d������ �ݴϴ�.\n\n", USD%100%50%20%10%5%2/1);
        
        System.out.printf("���� ��ȭ��\n1000�� %d��", remainKRW/1000);
        System.out.printf("\n500�� %d��", remainKRW%1000/500);
        System.out.printf("\n100�� %d��", remainKRW%1000%500/100);	
        System.out.printf("\n50�� %d��", remainKRW%1000%500%100/50);	
        System.out.printf("\n10�� %d���� �����ݴϴ�.", remainKRW%1000%500%100/10);

        myInput.close();
	}
}