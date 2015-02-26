package net.yasite.test;

import net.yasite.adapter.GoodsAdapter;
import net.yasite.entity.GoodListEntity;
import net.yasite.model.GoodsListModel;
import net.yasite.net.HandlerHelp;
import net.yasite.view.XListView;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

public class MainActivity extends BaseNewActivity implements OnScrollListener{
	private XListView listView;
	private GoodsListModel goodsListModel;
	private GoodsAdapter adapter;
	GoodsListModel entity;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		listView = (XListView) findViewById(R.id.list_view);
	}	

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public void setModel() {
		
		goodsListModel = new GoodsListModel(context);
		adapter = new GoodsAdapter(context);
		
		new MyHandler(context).execute();
		listView.setAdapter(adapter);
	}
	
	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}
	public class MyHandler extends HandlerHelp{

		public MyHandler(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			
//			Log.e("============", entity.getData().size()+"========");
//			adapter.setList(entity.getData());
//			adapter.notifyDataSetChanged();
			
		}

		@Override
		public void doTask(Message msg) throws Exception {
			// TODO Auto-generated method stub
//			entity = goodsListModel.getGoodList();
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
