package utilities;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static boolean isName(String name){
		// if name is empty
		if (name == null){
			return false;	
		} else if (name.equals("") || name.isEmpty()){
		   return false;	
		}
		return true;
	}
	
	public static boolean isShortName(String name){
		// if name is empty
		if (name.length() > 8){
		   return false;	
		}
		return true;
	}
	
	
	public static boolean isEmail(String emailStr) {
		Pattern emailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailRegex.matcher(emailStr);
		return matcher.find();
	}
	
	public static boolean isPhone(String phoneStr) {
		Pattern phoneRegex = Pattern.compile("^(?=.{7,32}$)(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*((\\s?x\\s?|ext\\s?|extension\\s?)\\d{1,5}){0,1}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = phoneRegex.matcher(phoneStr);
		return matcher.find();
	}
	
	
	
}
