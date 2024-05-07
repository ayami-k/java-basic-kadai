// 加藤太郎を表すクラス
package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {

	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
		

	//抽象メソッドの実装
	void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
