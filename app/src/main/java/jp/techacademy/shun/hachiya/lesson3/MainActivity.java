package jp.techacademy.shun.hachiya.lesson3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human1 = new Human("蜂谷", 24);
        human1.say();

        Human human2 = new Human("スカンジナビア半島");
        human2.think();
    }
}
