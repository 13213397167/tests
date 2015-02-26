package net.yasite.model;

import java.util.List;
import net.yasite.entity.GoodListEntity;
import net.yasite.service.GoodsService;
import android.content.Context;

public class GoodsListModel extends Model {

	private GoodsService service;

	public GoodsListModel(Context context) {
		this.context = context;
		service = new GoodsService(context);
	}
//
//	public GoodListEntity getGoodList() {
//		return service.getGoodsList();
//	}
}
