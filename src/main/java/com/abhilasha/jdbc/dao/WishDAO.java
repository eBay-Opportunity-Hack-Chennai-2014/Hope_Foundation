package com.abhilasha.jdbc.dao;

import com.abhilasha.jdbc.model.Wish;

public interface WishDAO {
	public Wish save(Wish wish);
	public Wish findWishByChildId(int childId);
}
