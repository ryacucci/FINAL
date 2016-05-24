package rocketBase;

import java.util.Collections;

import org.apache.poi.ss.formula.functions.*;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) 
	{
		Collections.sort(TBLRATE.RateDAL, Comparator<RateDAL>(){
			public long compare(RateBLL r1, RateBLL r2){
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		
		
		//TODO - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate

				 if (RateDAL != null){(return RateDAL.getAllRates().get(0)).compareTo(RateDAL.getAllRates().get(0));}
				 else{System.out.println("no rate found");}
		
	}
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		 return FinanceLib.pmt(r, n, p, f, t);
	}
}
