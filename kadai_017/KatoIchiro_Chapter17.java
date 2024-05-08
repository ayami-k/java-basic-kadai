//加藤一郎を表すクラス
package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	//名を表すフィールドの値をセットする
		public void setGivenName() {
			this.givenName = "一郎";
		}
		
			

		//抽象メソッドの実装
		public void eachIntroduce() {
			System.out.println("好きな食べ物はリンゴです");
		}

}
