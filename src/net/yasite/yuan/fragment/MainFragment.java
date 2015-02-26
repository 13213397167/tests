package net.yasite.yuan.fragment;

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
 * @author 
 * 
 */

public class MainFragment extends Fragment implements OnClickListener {
	private Context context;
	private EditText editText;
	private TextView textView_one, textView_two, textView_three, textView_four;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedcoBundleInstanceState) {
		context = getActivity();
		View view = LayoutInflater.from(context).inflate(R.layout.yuan_activity_main, null);
		editText = (EditText) view.findViewById(R.id.yuan_et_search);
		textView_one = (TextView) view.findViewById(R.id.yuan_tv_one);
		textView_two = (TextView) view.findViewById(R.id.yuan_tv_two);
		textView_three = (TextView) view.findViewById(R.id.yuan_tv_three);
		textView_four = (TextView) view.findViewById(R.id.yuan_tv_four);
		textView_one.setOnClickListener(this);
		textView_two.setOnClickListener(this);
		textView_three.setOnClickListener(this);
		textView_four.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.yuan_tv_one:
			Toast.makeText(context, "跳转到进口食品", Toast.LENGTH_LONG).show();
			break;
		case R.id.yuan_tv_two:

			Toast.makeText(context, "跳转到地方特产", Toast.LENGTH_LONG).show();
			break;
		case R.id.yuan_tv_three:

			Toast.makeText(context, "跳转到有机食品", Toast.LENGTH_LONG).show();
			break;
		case R.id.yuan_tv_four:
			Toast.makeText(context, "跳转到零食", Toast.LENGTH_LONG).show();

			break;

		}
	}

}
