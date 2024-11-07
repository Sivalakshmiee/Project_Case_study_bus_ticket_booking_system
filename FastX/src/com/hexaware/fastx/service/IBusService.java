package com.hexaware.fastx.service;

import java.util.List;

import com.hexaware.fastx.entity.Bus;

public interface IBusService {
	int createBus(Bus bus);
	int deleteBus(Bus bus);
	int updateBus(Bus bus);
	List<Bus> getAllBuses();
	

}
