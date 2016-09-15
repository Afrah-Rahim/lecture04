/* 
A really cool example using conditions!!!!
*/

public class PhoneNumber
{
	//////////////////////////
	// Field Vars :: variable for to store phone number
	private String phoneNumber;

	//************************
	// Constructor :: construct the object of PhoneNumber and
	//				  initialize as 100-100-1000.
    public PhoneNumber()	
    {
    	phoneNumber = "100-100-1000";
    }


	//++++++++++++++++++++++++
	// Methods

    /* creates a problem because the user can put
    	anything in!!

	public void changeNumber(String newNumber) 
	{
		phoneNumber = newNumber;
	}
	*/

	public void changeNumber(int areaCode, int numBegin, int numEnd) 
	{
		// if areaCode is bad, tell user to input something else.
		if (areaCode < 100 || areaCode > 999) {

			System.err.println("Please use a valid number.");

		} else if (numBegin < 100 || numBegin > 999) {

			System.err.println("Please use a valid number.");

		} else if (numEnd < 1000 || numEnd > 9999) {

			System.err.println("Please use a valid number.");			

		} else { // if not (areaCode < 100 || areaCode > 999) is not true, do this

			phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;

		}

		// Once an if statement is true, the program with do what it is told
		// and then skip to here. 

	}	

}














