package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void seachArray(String[] words) {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	
	
	//繰り返し処理を使い、調べる英単語が辞書に追加されているか判定
		String result = "";
		for(int i = 0; i < words.length; i++) {
			result = dictionary.get(words[i]);
			
			if (result == null) {
				result = words[i] + "は辞書に存在しません";
			} else {
				result = words[i] + "の意味は" + result;
			}
			
			System.out.println(result);
		}
	
	
    
	}
	
	
	
}
