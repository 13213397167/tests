package net.yasite.adapter;

import java.util.ArrayList;
import java.util.List;

import net.yasite.entity.GoodEntity;
import net.yasite.entity.GoodListEntity;
import net.yasite.test.R;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GoodsAdapter extends YasiteAdapter{
	List<GoodEntity> list = new ArrayList<GoodEntity>();
	public GoodsAdapter(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setImageLoader();
	}
	

	public GoodsAdapter(Context context, List<GoodEntity> list) {
		super(context);
		setImageLoader();
	}


	public List<GoodEntity> getList() {
		return list;
	}

	public void setList(List<GoodEntity> list) {
		this.list = list;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	protected void setupChildViews(View convertView, ViewHolder holder) {
		// TODO Auto-generated method stub
		GoodsHolder goodsHolder = (GoodsHolder) holder;
		goodsHolder.imageView = (ImageView) convertView.findViewById(R.id.thumb);
		goodsHolder.text_name = (TextView) convertView.findViewById(R.id.name);
		goodsHolder.shop_price = (TextView) convertView.findViewById(R.id.market_price);
		goodsHolder.marker_price = (TextView) convertView.findViewById(R.id.promote_price);
		
	}

	@Override
	protected void setChildViewData(ViewHolder holder, int position, Object obj) {
		// TODO Auto-generated method stub
		GoodsHolder goodsHolder = (GoodsHolder) holder;
		if(obj instanceof GoodEntity){
			Log.e("========", list.size()+"");
			GoodEntity entity = (GoodEntity) obj;
			goodsHolder.text_name.setText(entity.getGoods_name());
			goodsHolder.marker_price.setText(entity.getMarket_price());
			goodsHolder.text_name.setText(entity.getShop_price());
			mImageLoader.displayImage("http://www.yasite.net/ecshop/"+entity.getGoods_thumb(), goodsHolder.imageView);
		}
		
	}

	@Override
	protected ViewHolder setHolder() {
		// TODO Auto-generated method stub
		return new GoodsHolder();
	}

	@Override
	protected void setLayoutResource(int position) {
		// TODO Auto-generated method stub
		layoutId = R.layout.goods_item;
	}
	class GoodsHolder extends ViewHolder{
		ImageView imageView;
		TextView text_name,shop_price,marker_price;
	}

}
