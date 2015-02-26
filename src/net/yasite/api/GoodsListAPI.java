package net.yasite.api;

import net.yasite.entity.GoodListEntity;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;
import android.content.Context;
import android.util.Log;

public class GoodsListAPI extends BaseAPI {

	public GoodsListAPI(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setMethod("http://www.yasite.net/shopapi/index.php/goodController/getGoodList");
	}

	@Override
	public GoodListEntity handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		Log.e("=============", json.toString());
		return new Gson().fromJson(json.toString(), GoodListEntity.class);
	}

}
