package test3;

import java.util.HashMap;
import java.util.Random;

public class etorandom {

	public static HashMap<Integer, String> mapset() {
		//干支をMAP(数値,文字列)で入れ込む処理
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String[] eto = { "申", "酉", "戌", "亥", "子", "丑", "寅", "卯", "辰", "巳", "午", "未" };
		for (int i = 0; i < 12; i++) {
			map.put(i, eto[i]);
		}
		return map;
	}

	public static int yearset() {
		//ランダムで0～2100までの数値を返すメソッド
		Random rdm = new Random();
		int year = 0;
		year = rdm.nextInt(2101);
		return year;
	}

	public static void main(String[] args) {

		//検索は1900～2100年までを対象とする。
		//1900年に満たない場合は再度yearsetメソッドを呼び出す。
		int year = 0;

		do {
			year = yearset();
		} while (year < 1900);

		//mapsetメソッドにて生成したmapを返す
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.putAll(mapset());

		System.out.println(year + "年は" + map.get(year % 12) + "年です。");
	}
}
