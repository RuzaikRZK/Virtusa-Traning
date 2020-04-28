package com.Courier.CourierService.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Courier.CourierService.Repository.CourierServiceRepository;
import com.Courier.CourierService.model.CourierDetailes;
import com.Courier.CourierService.model.PaymentDetailes;

@Service
public class CourierServiceImplementation implements CourierService {

	@Autowired
	CourierServiceRepository courierServiceRepository;

	@Override
	public List<String> TrackingIDGenerator() {

		Random rand = new Random();
		int rand_int1 = rand.nextInt(100000);
		String ConcatChar = "TC";
		String RealRandom = ConcatChar + rand_int1;

		List<String> a = new ArrayList<String>();
		a.add(RealRandom);
		return a;

	}

	@Override
	public CourierDetailes AddCourier(CourierDetailes Courierdetailes) {

		return courierServiceRepository.save(Courierdetailes);
		

	}

	@Override
	public List<CourierDetailes> FindallCourierDetailes() {

		return courierServiceRepository.findAll();
	}

	@Override
	public List<CourierDetailes> FindallCourierDetailesByNic(String Nic) {

		return courierServiceRepository.findBySenderNic(Nic);

	}

	@Transactional
	@Override
	public void DeleteByTrackId(String TrackId) {

		courierServiceRepository.deleteCoureir(TrackId);

	}

	@Override
	public Map<String, Boolean> DeletebyId(int id) {

		Map<String, Boolean> response = new HashMap<>();

		try {
			courierServiceRepository.deleteById(id);
			response.put("Suceesfully Deleted", true);

		} catch (Exception e) {

			response.put("Suceesfully Deleted", false);

		}

		return response;
	}
	

	@Override
	public List<CourierDetailes> GetAllCourierBtTrackid(String Trackid) {
		return courierServiceRepository.GetallourierByTrackiid(Trackid);
	}
	
	
	@org.springframework.transaction.annotation.Transactional
	@Override
	public void SetCourierInfoByid(int pickupstatus, int deliverystatus, int courierid) {
		
		courierServiceRepository.setCourierId(pickupstatus,deliverystatus,courierid);
		
	}

}
