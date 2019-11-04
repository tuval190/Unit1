package android.example.homework_011;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String TAG = "MyActivity";
        Log.d(TAG, "Hey you1");
        Log.i("MainActivity", "MainActivity layout is complete");
    }
}
