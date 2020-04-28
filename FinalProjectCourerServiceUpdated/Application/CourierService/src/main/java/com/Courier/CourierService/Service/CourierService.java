package com.Courier.CourierService.Service;

import java.util.List;
import java.util.Map;

import com.Courier.CourierService.model.CourierDetailes;

public interface CourierService {
	
	public List<String> TrackingIDGenerator();
	
	public CourierDetailes AddCourier (CourierDetailes CourierDetailes);
	
	public List<CourierDetailes> FindallCourierDetailes();
	
	public List<CourierDetailes> FindallCourierDetailesByNic(String Nic);
	
	public void DeleteByTrackId (String TrackId);
	
	public Map<String,Boolean> DeletebyId (int id);
	
	public List<CourierDetailes> GetAllCourierBtTrackid (String Trackid);
	
	public void SetCourierInfoByid (int pickupstatus ,int deliverystatus,int courierid);
	
	

	

}
