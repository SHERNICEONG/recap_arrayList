package sg.edu.rp.c346.id22017424.recap_arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList <String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView2);

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // Add "durian as 4th element"
        fruits.add(3, "durian");

        // get 2nd element
        String theFruit = fruits.get(1);

        // remove 1st element
        fruits.remove(0);

        // change last element to "dragonfruit"
        fruits.set(fruits.size()-1,"dragon fruit");

        String text = "Fruits\n";
        text += "==========\n";

        for(int i = 0; i<fruits.size(); i++){
            text+= fruits.get(i) + "\n";
        }

        tv.setText(text);
    }

}