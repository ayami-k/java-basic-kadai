package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	Scanner choice = new Scanner(System.in);
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		//入力した内容を取得する
		String input = choice.next();
		
		
		//正しいじゃんけんの手であるか判定する
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			//Scannerクラスのオブジェクトをクローズする
			return input;
			
		} else {
			System.out.println("じゃんけんの手ではありません。もう1度入力してください。");
			return getMyChoice(); //不正な入力なら自分自身を再帰的に呼び出す
		}
		
		
	
	}

	
		//対戦相手のじゃんけんの手を乱数で選ぶ
		public String getRandom() {
			String[] rspArray = {"r", "s", "p"};
			
			String comRsp = rspArray[(int) Math.floor(Math.random() * (rspArray.length))];
			
			return comRsp;
							
		}
			
			
		//じゃんけんを行う
		public void playGame(){
			HashMap<String, String> rsp = new HashMap<String, String>();
			
			rsp.put("r", "グー");
			rsp.put("s", "チョキ");
			rsp.put("p", "パー");
			
			//自分と対戦相手のじゃんけんの手を取得
			String choice = getMyChoice();
			String comRsp = getRandom();
			
			System.out.println("自分の手は" + rsp.get(choice) + ",対戦相手の手は" + rsp.get(comRsp));
		
			//自分と対戦相手のじゃんけんの手の比較
			if(choice.equals(comRsp)) {
				System.out.println("あいこです");
			} else if(choice.equals("r") && comRsp.equals("s") || 
					  choice.equals("p") && comRsp.equals("r") || 
					  choice.equals("s") && comRsp.equals("p")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
			
		}
		
		 // プログラム終了時にScannerをクローズするためのメソッド
	     public void closeScanner() {
	     // 使用終了時にScannerクラスのオブジェクトをクローズする
	     choice.close();
	   }
	
}
