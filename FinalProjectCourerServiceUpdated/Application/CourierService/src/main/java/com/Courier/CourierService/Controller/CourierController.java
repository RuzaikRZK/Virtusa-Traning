package com.Courier.CourierService.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Courier.CourierService.Service.CourierService;
import com.Courier.CourierService.Service.CourierServiceImplementation;
import com.Courier.CourierService.model.CourierDetailes;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping("/CourierService")
public class CourierController {

	@Autowired
	CourierService courierService;

	// get Track ID -------------------------------------------------

	@GetMapping("/GetTrackingId")
	public List<String> GetTrackingid() {

		return courierService.TrackingIDGenerator();

	}

	// Add Courier Detailes -------------------------------------------

	@PostMapping("/AddCourierDetailes")
	public CourierDetailes AddCourier(@RequestBody CourierDetailes courierDetailes) {

		return courierService.AddCourier(courierDetailes);

	}

	// test CourierData
	@RequestMapping(value = "/GetAllCourier")
	public List<CourierDetailes> getAllEmployees() {
		return CourierDetailes.getAllCourier();
	}

	@GetMapping(value = "/GetAllCourierDetailes")
	public List<CourierDetailes> GetAllCourierDetiales() {

		return courierService.FindallCourierDetailes();

	}

	@GetMapping(value = "/GetCourrierByNic/{nic}")
	public List<CourierDetailes> GetAllCourierDetailesByNIC(@PathVariable String nic) {

		return courierService.FindallCourierDetailesByNic(nic);

	}

	// Delete Mapping by Cosutomized Query Trackid

	@DeleteMapping(value = "/DeleteCourierByTrackId/{trackid}")
	public void Deletebytrackid(@PathVariable String trackid) {

		courierService.DeleteByTrackId(trackid);

	}

	// Delete Mapping by Deletebyid

	@DeleteMapping(value = "/DeleteCourierById/{id}")
	public Map<String, Boolean> DeleteEmployeeById(@PathVariable int id) {

		return courierService.DeletebyId(id);
	}
	
	// get all courier detailes by Trackid
	
	
	@RequestMapping (method = RequestMethod.GET,value = "/GetallCourierDetailesByTrackID/{TrackID}")
	public List<CourierDetailes> GetAllCourierDetailesByTrackid(@PathVariable String TrackID ){
		
		return courierService.GetAllCourierBtTrackid(TrackID);
	}
	
	
	@RequestMapping (method =RequestMethod.PUT,value = "/Updatecourier/{pickupstatus}/{deliverystatus}/{courierid}")
	public void updateCoureir(@PathVariable int pickupstatus , @PathVariable int deliverystatus ,@PathVariable int courierid) {
		
		courierService.SetCourierInfoByid(pickupstatus, deliverystatus, courierid);
	}
	
}
