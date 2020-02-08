package id.ac.polinema.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textwarna1);

        String text = "hijau kuning kelabu";

        SpannableString ss = new SpannableString(text);

        BackgroundColorSpan bcsGreen = new BackgroundColorSpan(Color.GREEN);
        BackgroundColorSpan bcsYellow = new BackgroundColorSpan(Color.YELLOW);
        BackgroundColorSpan bcsGray = new BackgroundColorSpan(Color.GRAY);

        ss.setSpan(bcsGreen, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(bcsYellow, 6, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(bcsGray, 13, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView1.setText(ss);

        //aturan 1

        TextView textView2 = findViewById(R.id.textwarna2);

        String text2 = "merah muda dan biru";

        SpannableString ss2 = new SpannableString(text2);

        BackgroundColorSpan bcsBiru = new BackgroundColorSpan(Color.BLUE);
        BackgroundColorSpan bcsMerahMuda = new BackgroundColorSpan(Color.rgb(255, 182, 193));

        ss2.setSpan(bcsMerahMuda, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(bcsBiru, 15, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView2.setText(ss2);

        // aturan 2

        TextView textView3 = findViewById(R.id.textwarna3);

        String text3 = "MELETUS BALON HIJAU, DOOOORRR !!!";

        SpannableString ss3 = new SpannableString(text3);

        ss3.setSpan(bcsGreen, 14, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView3.setText(ss3);
    }
}
