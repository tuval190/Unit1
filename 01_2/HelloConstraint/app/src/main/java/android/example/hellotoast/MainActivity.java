package android.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.example.hellotoast.R;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        zeroColor
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if (mCount%2 == 0)
            android:background="#FFFF00";
        else
            android:background="@color/colorPrimary";

    }

    public void zeroUp(View view) {
        mCount = 0;
    }
}
