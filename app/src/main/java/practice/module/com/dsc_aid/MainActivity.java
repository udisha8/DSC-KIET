package practice.module.com.dsc_aid;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View markAttendance = findViewById(R.id.frame_attendance);
        markAttendance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.relLayout1, new AttendanceFragment()).commit();
            }
        });
    }
}
