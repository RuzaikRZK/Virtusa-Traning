package com.Courier.CourierService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Courier.CourierService.model.CourierDetailes;

public interface CourierServiceRepository extends JpaRepository<CourierDetailes,Integer> {

	List<CourierDetailes> findBySenderNic(String nic);
	
	@Modifying
	@Query("delete from CourierDetailes b where b.TrackId=:TrackId")
	void deleteCoureir(@Param("TrackId") String TrackId);
	
	@Modifying
	@Query( value = "select * from CourierDetailes c where c.TrackId=:TrackId",nativeQuery = true)
	List<CourierDetailes> GetallourierByTrackiid(@Param("TrackId") String TrackId);
	
	@Modifying
	@Query("update CourierDetailes u set u.PickupedStatus = :pickupedStatus, u.DeliverdStatus = :deliverdStatus where u.CourierId = :courierId")
	void setCourierId(@Param("pickupedStatus") int pickupedStatus,@Param("deliverdStatus") int deliverdStatus,@Param("courierId") int courierId);
	
}
