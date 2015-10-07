package lotto;
/**
 * @file_name : LottoShop.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 7.
 * @story     : 로또 추첨(스윙)
 */
public class LottoShop {
	public static void main(String[] args) {
		System.out.println("행운의 로또");
		Lotto lotto = new Lotto();
		lotto.inputMoney(5000);
		lotto.extractNum();
		lotto.printLotto();
	}
}
