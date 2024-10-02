package org.example;

import java.util.*;

public class Seventeen_world {
    public static void main(String[] args) {

        //リストにマップを格納
        List<Map<String, Object>> SEVENTEEN = new ArrayList<>();
        //メンバーをマップに格納
        Map<String, Object> member1 = new HashMap<>();
        member1.put("name", "エスクプス");
        member1.put("teamAlphabet", "H");
        member1.put("teamName", "ヒップホップチーム");
        Map<String, Object> member2 = new HashMap<>();
        member2.put("name", "ジョンハン");
        member2.put("teamAlphabet", "V");
        member2.put("teamName", "ボーカルチーム");
        Map<String, Object> member3 = new HashMap<>();
        member3.put("name", "ジョシュア");
        member3.put("teamAlphabet", "V");
        member3.put("teamName", "ボーカルチーム");
        Map<String, Object> member4 = new HashMap<>();
        member4.put("name", "ジュン");
        member4.put("teamAlphabet", "P");
        member4.put("teamName", "パフォーマンスチーム");
        Map<String, Object> member5 = new HashMap<>();
        member5.put("name", "ホシ");
        member5.put("teamAlphabet", "P");
        member5.put("teamName", "パフォーマンスチーム");
        Map<String, Object> member6 = new HashMap<>();
        member6.put("name", "ウォヌ");
        member6.put("teamAlphabet", "H");
        member6.put("teamName", "ヒップホップチーム");
        Map<String, Object> member7 = new HashMap<>();
        member7.put("name", "ウジ");
        member7.put("teamAlphabet", "V");
        member7.put("teamName", "ボーカルチーム");
        Map<String, Object> member8 = new HashMap<>();
        member8.put("name", "ドギョム");
        member8.put("teamAlphabet", "V");
        member8.put("teamName", "ボーカルチーム");
        Map<String, Object> member9 = new HashMap<>();
        member9.put("name", "ミンギュ");
        member9.put("teamAlphabet", "H");
        member9.put("teamName", "ヒップホップチーム");
        Map<String, Object> member10 = new HashMap<>();
        member10.put("name", "ディエイト");
        member10.put("teamAlphabet", "P");
        member10.put("teamName", "パフォーマンスチーム");
        Map<String, Object> member11 = new HashMap<>();
        member11.put("name", "スングァン");
        member11.put("teamAlphabet", "V");
        member11.put("teamName", "ボーカルチーム");
        Map<String, Object> member12 = new HashMap<>();
        member12.put("name", "バーノン");
        member12.put("teamAlphabet", "H");
        member12.put("teamName", "ヒップホップチーム");
        Map<String, Object> member13 = new HashMap<>();
        member13.put("name", "ディノ");
        member13.put("teamAlphabet", "P");
        member13.put("teamName", "パフォーマンスチーム");

        // アルファベットとチーム名の辞書を作成
        Map<String, String> teamDictionary = new HashMap<>();
        teamDictionary.put("H", "ヒップホップチーム");
        teamDictionary.put("V", "ボーカルチーム");
        teamDictionary.put("P", "パフォーマンスチーム");

        Scanner scanner = new Scanner(System.in);
        System.out.print("アルファベットを入力してください: ");
        String teamAlphabet = scanner.nextLine().toUpperCase(); // 入力を大文字に変換
        String teamName = teamDictionary.getOrDefault(teamAlphabet, "該当するチームがありません");
        System.out.println("選択されたチーム: " + teamName);

        // 共通のチームメンバーの名前を表示
        for (Map<String, Object> member : SEVENTEEN) {
            if (teamName.equals(member.get("teamName"))) {
                System.out.println("メンバー名: " + member.get("name"));
            }
        }
    }
}