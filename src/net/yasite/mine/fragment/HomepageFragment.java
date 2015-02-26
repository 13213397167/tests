package net.yasite.mine.fragment;

import net.yasite.mine.activity.MyGoodlistActivity;
import net.yasite.test.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/***
 * 首页显示的内容
 * 
 * @author xusijing
 * 
 */

public class HomepageFragment extends Fragment implements OnClickListener {
	private Context context;
	private EditText editText;
	private Button button;
	private TextView textView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedcoBundleInstanceState) {
		context = getActivity();
		View view = LayoutInflater.from(context).inflate(R.layout.homepage,
				null);
		editText = (EditText) view.findViewById(R.id.my_homepage_e_search);
		String text = editText.getText().toString().trim();

		if (text != "" && (!text.equals(""))) {

		}
		button = (Button) view.findViewById(R.id.my_homepage_b_search);
		textView = (TextView) view.findViewById(R.id.my_homepage_text_text1);
		button.setOnClickListener(this);
		textView.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.my_homepage_text_text1:
			Intent intent = new Intent(getActivity(), MyGoodlistActivity.class);
			startActivity(intent);
			break;
		case R.id.my_homepage_b_search:
			Toast.makeText(context, "跳转到搜索商品页面", 1).show();

			break;
		}
	}

}
