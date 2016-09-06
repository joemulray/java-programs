/**Defines an address using a street, city, state, and zipcode*/
public class Address
{
	/**The street number and street name*/
	private String street;
	
	/**The city in which the address is located*/
	private String city;
	
	/**The state in which the address is located*/
	private String state;
	
	/**The zip code associated with that city and street*/
	private String zip;

	/**Constructor creates an address using four parameters
	@param road describes the street number and name
	@param town describes the city
	@param st describes the state
	@param zipCode describes the zip code*/
	public Address(String road, String town, String st, String zipCode)
	{
		street = road;
		city = town;
		state = st;
		zip = zipCode;
	}

	/**toString method returns information about the address
	@return all imformation about the address*/
	public String toString()
	{
		return (street + ", " + city + ", " + state + " " + zip);
	}
}