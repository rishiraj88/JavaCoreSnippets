package java14;

/**
 * 
 * @author rishiraj
 *	Records provide a compact syntax for declaring classes which act as 
 *	transparent carriers for immutable data.
 *
 *	A new type with keyword <code>record<code> is like a final class,
 *	which is not abstract and all its fields are final.
 *
 *	The record itself takes care of constructor generation, public getters,
 *	equals(), hashCode() and toString().
 *
 *	Setters are not available for fields.
 *
 */
public class RecordVsClass {
	// No need to write boilerplate code in the form of a final class
	record UserRecord(String name, String userId, int pin) {}
	
	public static void main(String[] args) {
		UserRecord userRecord = new UserRecord("Rishiraj","1323",152242);
		System.out.print("""
				::User Details:: 
				Name:""");
		System.out.println(" "+ userRecord.name);
		System.out.print("User ID: ");
		System.out.println(userRecord.userId);
	}
}
