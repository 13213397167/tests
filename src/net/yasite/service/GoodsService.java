package net.yasite.service;

import net.yasite.api.BaseAPI;
import net.yasite.api.GoodsListAPI;
import net.yasite.model.GoodsListModel;
import android.content.Context;

public class GoodsService extends BaseService {

	public GoodsService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public GoodsListModel getGoodsList() {
		BaseAPI api = new GoodsListAPI(context);
		try {
			if (api.doGet()) {
				return (GoodsListModel) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
