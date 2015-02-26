package net.yasite.mine.activity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;

public class MyMainActivity extends BaseNewActivity implements
		AnimationListener {

	private ImageView image;

	@Override
	public void setupView() {
		image = (ImageView) findViewById(R.id.my_main_image);

	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.my_activity_main);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		image.setImageResource(R.drawable.u01);
		Animation scale = new AlphaAnimation(1, 1);
		scale.setDuration(2000);
		image.setAnimation(scale);
		scale.setAnimationListener(this);
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(MyMainActivity.this,
				MyHomepageActivity.class);
		startActivity(intent);
	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}

}
