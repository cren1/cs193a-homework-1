package com.example.christinaren.severussnape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> setofquotes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generatequote(View view) {
        TextView quote = (TextView) findViewById(R.id.quote);

        Random randy = new Random();
        int index = randy.nextInt(setofquotes.size() -1);
        String picked_Quote = setofquotes.get(index);

        quote.setText(picked_Quote);
    }

    private void readFile() {
        Scanner scan = new Scanner(getResources().openRawResource(R.raw.snapequotes));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if(line != "") {
                setofquotes.add(line);
            }
        }
    }
}
