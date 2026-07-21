package SpringCore.CollectionType;

import java.util.List;

public class FoodCart {
	
	private List<String> dishNames;
	
	public FoodCart() {
		
	}

	public List<String> getDishNames() {
		return dishNames;
	}

	public void setDishNames(List<String> dishNames) {
		this.dishNames = dishNames;
	}

	@Override
	public String toString() {
		return "FoodCart [dishNames=" + dishNames + "]";
	}
	
	

}
