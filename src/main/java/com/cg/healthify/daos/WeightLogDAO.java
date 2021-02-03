package com.cg.healthify.daos;

import com.cg.healthify.pojo.WeightLog;

public interface WeightLogDAO {

	public void addUserWeight(WeightLog weight);
	public void updateUserWeight(WeightLog weight);
	public void deleteUserWeight(WeightLog weight);
	public void findUserWeight(WeightLog weight);

}
