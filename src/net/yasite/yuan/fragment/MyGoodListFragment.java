package net.yasite.yuan.fragment;

import net.yasite.test.R;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/***
 * 分类列表显示的内容
 * 
 * @author 
 * 
 */
public class MyGoodListFragment extends Fragment {
	private Context context;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		context = getActivity();
		View view = LayoutInflater.from(context).inflate(R.layout.yuan_activity_goodlist, null);
		return view;
	}

}
