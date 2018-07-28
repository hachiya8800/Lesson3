package jp.techacademy.shun.hachiya.lesson3;

import android.util.Log;

class Human extends Animal implements Thinkable {

    //メンバ変数
    String hobby = "";

    // sayメソッド用コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // thinkメソッド用コンストラクタ
    public Human(String hobby) {
        this.hobby = hobby;
    }


    // メンバ関数
    @Override
    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

    // Thinkableインターフェースのthinkメソッドを実装
    public void think() {
        Log.d("javatest", "「私は" + hobby + "について考える」");
    }
}
