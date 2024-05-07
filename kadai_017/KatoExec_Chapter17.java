package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//太郎さん紹介
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		
		//メソッド実行
		taro.setGivenName();
		taro.execIntroduce();
		System.out.println("");
		
		//一郎さん紹介
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		
		//メソッド実行
		ichiro.setGivenName();
		ichiro.execIntroduce();	
		System.out.println("");
		
		//花子さん紹介
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		//メソッド実行
		hanako.setGivenName();
		hanako.execIntroduce();

	}

}
