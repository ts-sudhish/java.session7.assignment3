/**
 * 
 */
package sdh.java.session7;

/**
 * @author Sudhish
 * 
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Getting null object");
		Object nullObject = getNullObject();
		try {
			if (new Integer((Integer) nullObject) == 3)
				System.out.println(nullObject);

		} catch (NullPointerException e) {
			System.out
					.println("Exception is handled:::Null object is being parsed to Integer : "
							+ e);
		}

	}

	private static Object getNullObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
