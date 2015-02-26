package net.yasite.yuan.model;

import android.content.Context;
import net.yasite.mine.entity.MyGoodlistEntity;
import net.yasite.mine.service.MyGoodlistService;
import net.yasite.model.Model;
import net.yasite.yuan.entity.GoodsList;
import net.yasite.yuan.service.MyService;

public class MyModel extends Model {
	MyService service;

	public MyModel(Context context) {
		super();
		service = new MyService(context);
	}

	public GoodsList getGoods() {
		return service.getgoodList();
	}

}
