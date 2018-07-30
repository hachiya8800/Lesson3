package jp.techacademy.shun.hachiya.lesson3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("蜂谷", 24, "スカンジナビア半島");
        human.say();
        human.think();
    }
}
