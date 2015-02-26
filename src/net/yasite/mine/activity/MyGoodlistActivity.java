package net.yasite.mine.activity;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import net.yasite.mine.adapter.MyGoodslistAdapter;
import net.yasite.mine.entity.MyGoodlistEntity;
import net.yasite.mine.model.MyGoodlistModel;
import net.yasite.net.HandlerHelp;
import net.yasite.test.BaseNewActivity;
import net.yasite.test.R;

public class MyGoodlistActivity extends BaseNewActivity implements OnScrollListener{
	private ListView ListView;
	private MyGoodslistAdapter adapter;
	private MyGoodlistModel model;

	@Override
	public void setupView() {
		ListView = (ListView) findViewById(R.id.my_goodlist_listview);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.my_activity_goodslist);
	}

	@Override
	public void setModel() {
		model = new MyGoodlistModel(context);
		adapter = new MyGoodslistAdapter(context);
		new MyHandler(context).execute();
		ListView.setAdapter(adapter);

	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}

	class MyHandler extends HandlerHelp {

		private MyGoodlistEntity entity;

		public MyHandler(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			Log.e("list--------------------", ""+entity.getData().size());
			adapter.setList(entity.getData());
			adapter.notifyDataSetChanged();
		}

		@Override
		public void doTask(Message msg) throws Exception {
			entity = model.getgoodlist();
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
