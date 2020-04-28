package com.Courier.CourierService.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class CourierDetailes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CourierId;

	private String Sendername;
	private String PickupedAddress;
	private String DeliveryDays;
	private String weight;
	private String TrackId;
	private String DeliveryAddress;
	private String ReceiverName;
	private String ParcelInclude;
	private String senderNic;
	private String SenderPhoneNumber;
	private String DeliveryPhoneNUmber;

	private int PickupedStatus;
	private int DeliverdStatus;

	 @OneToOne(cascade = CascadeType.ALL)
	    
	private PaymentDetailes Paymentdetailes;

	public CourierDetailes() {
		super();
	}

	
	
	

	




	public CourierDetailes(int courierId, String sendername, String pickupedAddress, String deliveryDays, String weight,
			String trackId, String deliveryAddress, String receiverName, String parcelInclude, String senderNic,
			String senderPhoneNumber, String deliveryPhoneNUmber, int pickupedStatus, int deliverdStatus,
			PaymentDetailes paymentdetailes) {
		super();
		CourierId = courierId;
		Sendername = sendername;
		PickupedAddress = pickupedAddress;
		DeliveryDays = deliveryDays;
		this.weight = weight;
		TrackId = trackId;
		DeliveryAddress = deliveryAddress;
		ReceiverName = receiverName;
		ParcelInclude = parcelInclude;
		this.senderNic = senderNic;
		SenderPhoneNumber = senderPhoneNumber;
		DeliveryPhoneNUmber = deliveryPhoneNUmber;
		PickupedStatus = pickupedStatus;
		DeliverdStatus = deliverdStatus;
		Paymentdetailes = paymentdetailes;
	}










	public String getSenderPhoneNumber() {
		return SenderPhoneNumber;
	}

	public void setSenderPhoneNumber(String senderPhoneNumber) {
		SenderPhoneNumber = senderPhoneNumber;
	}

	public String getDeliveryPhoneNUmber() {
		return DeliveryPhoneNUmber;
	}

	public void setDeliveryPhoneNUmber(String deliveryPhoneNUmber) {
		DeliveryPhoneNUmber = deliveryPhoneNUmber;
	}

	public int getCourierId() {
		return CourierId;
	}

	public void setCourierId(int courierId) {
		CourierId = courierId;
	}

	public String getSendername() {
		return Sendername;
	}

	public void setSendername(String sendername) {
		Sendername = sendername;
	}

	public String getPickupedAddress() {
		return PickupedAddress;
	}

	public void setPickupedAddress(String pickupedAddress) {
		PickupedAddress = pickupedAddress;
	}

	public String getDeliveryDays() {
		return DeliveryDays;
	}

	public void setDeliveryDays(String deliveryDays) {
		DeliveryDays = deliveryDays;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getTrackId() {
		return TrackId;
	}

	public void setTrackId(String trackId) {
		TrackId = trackId;
	}

	public String getDeliveryAddress() {
		return DeliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		DeliveryAddress = deliveryAddress;
	}

	public String getReceiverName() {
		return ReceiverName;
	}

	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}

	public String getParcelInclude() {
		return ParcelInclude;
	}

	public void setParcelInclude(String parcelInclude) {
		ParcelInclude = parcelInclude;
	}

	

	public String getSenderNic() {
		return senderNic;
	}










	public void setSenderNic(String senderNic) {
		this.senderNic = senderNic;
	}










	public int getPickupedStatus() {
		return PickupedStatus;
	}

	public void setPickupedStatus(int pickupedStatus) {
		PickupedStatus = pickupedStatus;
	}

	public int getDeliverdStatus() {
		return DeliverdStatus;
	}

	public void setDeliverdStatus(int deliverdStatus) {
		DeliverdStatus = deliverdStatus;
	}
	
	

	

	public PaymentDetailes getPaymentdetailes() {
		return Paymentdetailes;
	}





	public void setPaymentdetailes(PaymentDetailes paymentdetailes) {
		Paymentdetailes = paymentdetailes;
	}





	public static List<CourierDetailes> getAllCourier() {
		List<CourierDetailes> employeeList = new ArrayList<>();
		List<PaymentDetailes> pay = new ArrayList<PaymentDetailes>();

		// pay.add(new PaymentDetailes(1,"Card",12));

		// employeeList.add(new
		// CourierDetailes(0,"","","","","","","","","","","",0,0,pay));

		return employeeList;
	}

}
