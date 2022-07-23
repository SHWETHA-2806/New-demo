package assisstedproject1;
import java.util.regex.*;
public class regExpEg {

	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Morning Dews";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}
	}

