package net.yasite.yuan.activity;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import net.yasite.mine.adapter.MyGoodslistAdapter;
import net.yasite.mine.entity.MyGoodlistEntity;
import net.yasite.mine.model.MyGoodlistModel;
import net.yasite.net.HandlerHelp;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;
import net.yasite.view.XListView;
import net.yasite.yuan.adapter.MyAdapter;
import net.yasite.yuan.entity.GoodsList;
import net.yasite.yuan.model.MyModel;

public class ListActivity extends BaseNewActivity implements OnScrollListener{
	private XListView xListView;
	private MyAdapter adapter;
	private MyModel model;

	@Override
	public void setupView() {
		xListView = (XListView) findViewById(R.id.yuan_listview);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.yuan_activity_goodlist);
	}

	@Override
	public void setModel() {
		model = new MyModel(context);
		adapter = new MyAdapter(context);
		new MyHandler(context).execute();
		xListView.setAdapter(adapter);

	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}

	class MyHandler extends HandlerHelp {

		private GoodsList goods;

		public MyHandler(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			Log.e("list--------------------", ""+goods.getData().size());
			adapter.setList(goods.getData());
			adapter.notifyDataSetChanged();
		}

		@Override
		public void doTask(Message msg) throws Exception {
			goods = model.getGoods();
		}

		@Override
		public void doTaskAsNoNetWork(Message msg) throws Exception {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public void onScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {
		// TODO Auto-generated method stub
		
	}

}
