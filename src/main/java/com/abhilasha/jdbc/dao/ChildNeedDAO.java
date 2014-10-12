package com.abhilasha.jdbc.dao;

import com.abhilasha.jdbc.model.ChildNeed;

public interface ChildNeedDAO {
	public ChildNeed findNeedByChildId(int childId);

	public ChildNeed save(ChildNeed childNeed);
}
