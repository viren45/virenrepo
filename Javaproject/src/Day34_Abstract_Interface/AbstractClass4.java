package Day34_Abstract_Interface;

abstract class RBIBank102 {
	 abstract double getRateOfInterestForHomeLoan();
	//Abstract mean must be overridden
	//final means can't be override
}
class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class AbstractClass4 {
	public static void main(String args[]) {		
	
	}
}