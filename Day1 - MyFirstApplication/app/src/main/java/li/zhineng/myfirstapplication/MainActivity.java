package li.zhineng.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTextView(View view) {
        // Get the reference to the TextView
        TextView counter = (TextView) findViewById(R.id.counter);

        // Declear the variable, it's a integer
        // Note: We need to use parseInt method to convert string into int
        Integer number =  Integer.parseInt(counter.getText().toString()) + 1;

        // Put the number into the counter
        counter.setText(number.toString());
    }
}