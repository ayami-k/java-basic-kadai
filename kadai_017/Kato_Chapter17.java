//親クラス
package kadai_017;

public abstract class Kato_Chapter17 {
	
	//姓と名と住所を表すフィールド
	public String familyName = "加藤"; //姓
	public String givenName;  //名
	public String address = "東京都中野区〇×";    //住所
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介を出力するメソッド(抽象メソッド)
	abstract void eachIntroduce();
	
	//紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}

}
