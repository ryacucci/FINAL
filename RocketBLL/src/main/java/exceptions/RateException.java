package exceptions;

import org.hibernate.mapping.Array;

public class RateException extends Exception {

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
	public RateException(Array RateDomainModel, int value) {
	
	try{
		RateException(RateDomainModel, -67)
		}
	catch(DomainException){
		System.out.println(invalid value)
	}
	}
	Array RateDomainModel;

	public Array getRateDomainModel() {
		return RateDomainModel;
	}

	public void setRateDomainModel(Array rateDomainModel) {
		RateDomainModel = rateDomainModel;
	}
}
