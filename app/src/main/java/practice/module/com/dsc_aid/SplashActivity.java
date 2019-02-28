package practice.module.com.dsc_aid;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    private Context context;
    private Animation anim;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //for full screen the activity
        context = this.getApplicationContext();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        imageView = (ImageView) findViewById(R.id.image_logo_splash);

        //load the animation
        anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_bottom_top);

        //set animation listener
        anim.setAnimationListener(this);

        imageView.setVisibility(View.VISIBLE);
        imageView.startAnimation(anim);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        if(animation == anim){

            Intent intent1 = new Intent(SplashActivity.this,LoginActivity.class);
            startActivity(intent1);
            finish();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
