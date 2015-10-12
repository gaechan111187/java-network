package lotto;

import java.util.Scanner;

/**
 * @file_name : LottoShop.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 7.
 * @story     : 로또 추첨(스윙)
 */
public class LottoShop {
	public static void main(String[] args) {
		System.out.println("행운의 로또");
		Scanner scanner = new Scanner(System.in);
		Lotto lotto = new Lotto();
		System.out.println("금액입력");
		lotto.inputMoney(scanner.nextInt());
		lotto.extractNum();
		lotto.printLotto();
	}
}
