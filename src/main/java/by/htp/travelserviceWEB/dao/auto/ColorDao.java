package by.htp.travelserviceWEB.dao.auto;

import java.util.List;

import by.htp.travelserviceWEB.entity.Entity;

public interface ColorDao {

	List<Entity> fetchListOfTheColors(Entity entity);
	
}