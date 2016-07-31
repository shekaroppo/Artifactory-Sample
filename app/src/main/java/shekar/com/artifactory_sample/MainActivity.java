package shekar.com.artifactory_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import shekar.com.mylibrary.AwesomeConvertor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView awesomeTv = (TextView) findViewById(R.id.tv_awesome);
        awesomeTv.setText(AwesomeConvertor.toAwesome("Hello World"));
    }
}
