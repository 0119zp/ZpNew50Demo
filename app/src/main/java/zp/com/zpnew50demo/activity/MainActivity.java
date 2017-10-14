package zp.com.zpnew50demo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import zp.com.zpnew50demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button01(View view){
        Intent intent = new Intent(MainActivity.this, ZpNewActivity.class);
        startActivity(intent);
    }

    public void button02(View view){
        Intent intent = new Intent(MainActivity.this, ZpNavigationActivtiy.class);
        startActivity(intent);
    }

    public void button03(View view){
        Intent intent = new Intent(MainActivity.this, ZpTabLayoutTopActivtiy.class);
        startActivity(intent);
    }

    public void button04(View view){
        Intent intent = new Intent(MainActivity.this, ZpTabLayoutBottomActivity.class);
        startActivity(intent);
    }

    public void button05(View view){
        Intent intent = new Intent(MainActivity.this, ZpFabActivity.class);
        startActivity(intent);
    }

    public void button06(View view){
        Intent intent = new Intent(MainActivity.this, ZpTextInputActivity.class);
        startActivity(intent);
    }

    public void button07(View view){
        Intent intent = new Intent(MainActivity.this, ZpBottomNavigationActivity.class);
        startActivity(intent);
    }

    public void button08(View view){
        Intent intent = new Intent(MainActivity.this, ZpBehaviorNestedActivity.class);
        startActivity(intent);
    }

    public void button09(View view){
        Intent intent = new Intent(MainActivity.this, ZpBehaviorNestedExpandActivity.class);
        startActivity(intent);
    }

    public void button10(View view){
        Intent intent = new Intent(MainActivity.this, ZpAppBarLayoutActivity.class);
        startActivity(intent);
    }

    public void button11(View view){
        Intent intent = new Intent(MainActivity.this, ZpCardViewActivity.class);
        startActivity(intent);
    }

}
