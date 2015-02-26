package net.yasite.mine.service;

import android.content.Context;
import net.yasite.api.BaseAPI;
import net.yasite.api.GoodsListAPI;
import net.yasite.mine.api.MyGoodslistAPI;
import net.yasite.mine.entity.MyGoodlistEntity;
import net.yasite.service.BaseService;

public class MyGoodlistService extends BaseService {

	public  MyGoodlistService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyGoodlistEntity getgoodList() {
		BaseAPI goodlist = new MyGoodslistAPI(context);
		try {
			if (goodlist.doGet()) {

				return  (MyGoodlistEntity) goodlist.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
