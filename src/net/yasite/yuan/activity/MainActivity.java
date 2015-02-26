package net.yasite.yuan.activity;

import net.yasite.mine.fragment.MyAccountFragment;
import net.yasite.mine.fragment.RegisteFragment;
import net.yasite.mine.fragment.ShoppingCartFragment;
import net.yasite.mine.fragment.SortListFragment;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;
import net.yasite.yuan.fragment.MainFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends BaseNewActivity {
	private FragmentTransaction transaction;

	@Override
	public void setupView() {
		RadioGroup group = (RadioGroup) findViewById(R.id.yuan_radiogroup);
		group.setOnCheckedChangeListener(listener);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.yuan_activity_main_item);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		MainFragment fragment = new MainFragment();
		transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id.yuan_layout3, fragment);
		transaction.commit();

	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}

	public void replaceFragment(Fragment fragment) {
		transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id.yuan_layout3, fragment);
		transaction.commit();
	}

	OnCheckedChangeListener listener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			switch (checkedId) {
			case R.id.yuan_radio1:
				// 点击首页
				MainFragment fragment = new MainFragment();
				replaceFragment(fragment);
				break;
			case R.id.yuan_radio2:
				// 点击分类
				SortListFragment fragment2 = new SortListFragment();
				replaceFragment(fragment2);
				break;
			case R.id.yuan_radio3:
				// 点击购物车
				ShoppingCartFragment fragment3 = new ShoppingCartFragment();
				replaceFragment(fragment3);
				break;
			case R.id.yuan_radio4:
				// 点击注册
				RegisteFragment fragment4 = new RegisteFragment();
				replaceFragment(fragment4);
				break;
			case R.id.yuan_radio5:
				// 点击个人中心
				MyAccountFragment fragment5 = new MyAccountFragment();
				replaceFragment(fragment5);
				break;

			}
		}
	};

}
