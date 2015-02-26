package net.yasite.yuan.service;

import android.content.Context;
import net.yasite.api.BaseAPI;
import net.yasite.service.BaseService;
import net.yasite.yuan.api.MyApi;
import net.yasite.yuan.entity.GoodsList;

public class MyService extends BaseService {

	public  MyService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public GoodsList getgoodList() {
		BaseAPI goodlist = new MyApi(context);
		try {
			if (goodlist.doGet()) {

				return (GoodsList) goodlist.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
