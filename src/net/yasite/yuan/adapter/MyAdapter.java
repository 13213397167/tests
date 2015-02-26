package net.yasite.yuan.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import net.yasite.adapter.YasiteAdapter;
import net.yasite.mine.entity.MyGoodsEntity;
import net.yasite.test.R;

public class MyAdapter extends YasiteAdapter {
	List<MyGoodsEntity> list = new ArrayList<MyGoodsEntity>();

	public MyAdapter(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setImageLoader();
	}

	public MyAdapter(Context context, List<MyGoodsEntity> list) {
		super(context);
		setImageLoader();
	}

	public List<MyGoodsEntity> getList() {
		return list;
	}

	public void setList(List<MyGoodsEntity> list) {
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	protected void setupChildViews(View convertView, ViewHolder holder) {
		// TODO Auto-generated method stub
		Helper h = (Helper) holder;
		h.imageView = (ImageView) convertView
				.findViewById(R.id.yuan_activity_goodslist_item_image);
		h.textView1 = (TextView) convertView
				.findViewById(R.id.yuan_activity_goodslist_item_goodsname);
		h.textView2 = (TextView) convertView
				.findViewById(R.id.yuan_activity_goodslist_item_market_price);
		h.textView3 = (TextView) convertView
				.findViewById(R.id.yuan_activity_goodslist_item_shop_price);

	}

	@Override
	protected void setChildViewData(ViewHolder holder, int position, Object obj) {
		// TODO Auto-generated method stub
		Helper h = (Helper) holder;
		if (obj instanceof MyGoodsEntity) {
			MyGoodsEntity entity = (MyGoodsEntity) obj;
			h.textView1.setText(entity.getGoods_name());
			h.textView2.setText(entity.getMarket_price());
			h.textView3.setText(entity.getShop_price());
			mImageLoader.displayImage(
					"http://www.yasite.net/ecshop/"
							+ entity.getGoods_thumb(), h.imageView);
		}
	}

	@Override
	protected ViewHolder setHolder() {
		// TODO Auto-generated method stub
		return new Helper();
	}

	@Override
	protected void setLayoutResource(int position) {
		// TODO Auto-generated method stub
		layoutId = R.layout.yuan_activity_goodlist_item;
	}

	class Helper extends ViewHolder {
		ImageView imageView;
		TextView textView1, textView2, textView3;
	}

}
