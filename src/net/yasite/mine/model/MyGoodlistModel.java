package net.yasite.mine.model;

import android.content.Context;
import net.yasite.mine.entity.MyGoodlistEntity;
import net.yasite.mine.entity.MyGoodsEntity;
import net.yasite.mine.service.MyGoodlistService;
import net.yasite.model.Model;

public class MyGoodlistModel extends Model {
	MyGoodlistService goodlistService;

	public MyGoodlistModel(Context context) {
		super();
		goodlistService = new MyGoodlistService(context);
	}

	public MyGoodlistEntity getgoodlist() {
		return goodlistService.getgoodList();
	}

}
