//課題
//今日実践したものを一通り実装してみて下さい。
//    GreetingとSpeakingは使わずにinterfaceと実装を組み合わせて作ってみてください。
//    interfaceの実装を２つ以上作ってください。
//    継承を使ってみてください。extends　上記で作った2つの実装クラスのどちらかを継承してクラスを作って、実際にメソッドを呼び出してみてください。
//    メソッド呼び出しは親子のどちらとも呼び出してみてください。

package org.example;

import java.util.Map;

public class Main {

  public static void main(String[] args) {

//    （打順、名前）のスタメンリスト
    Map<Integer, String> startingLineup = Map.of(1, "カリステ", 2, "田中", 3, "高橋周", 4, "細川",
        5, "中田", 6, "上林", 7, "村松", 8, "宇佐見", 9, "高橋宏");

    Printer printer = new Printer();

    int nowPitching = 9;

    ChoosingBrakingBall pitcher = new ChoosingBrakingBall();
//    親クラスメソッドの呼び出し
    String message1 = pitcher.pitching(startingLineup.get(nowPitching));
//    子クラスメソッドの呼び出し
    String message2 = pitcher.choosing("スライダー");

    printer.printMessage(message1);
    printer.printMessage(message2);

    int nowHitting = 1;
    BatterAction batterAction = new BatterAction();
    String message3 = batterAction.batting(startingLineup.get(nowHitting));
    printer.printMessage(message3);


  }
}
