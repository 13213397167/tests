package net.yasite.mine.entity;

import java.io.Serializable;
import java.util.List;


public class MyGoodlistEntity extends Object implements Serializable{
	private List<MyGoodsEntity> data;

	public List<MyGoodsEntity> getData() {
		return data;
	}

	public void setData(List<MyGoodsEntity> data) {
		this.data = data;
	}

	

}
