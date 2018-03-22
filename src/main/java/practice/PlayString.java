package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PlayString {

	public static void main(String[] args) {
		
		try {
		String data = "file1brandonVidro.txt";
		
		String sourceFileMask = null;
		String destinationFileName = "file1.txt";
		
		Pattern pattern = Pattern.compile(sourceFileMask);
		
		Matcher matcher = pattern.matcher("");
		int groupCount = matcher.groupCount();
		
		System.out.println("GroupCount = " + matcher.groupCount());
		
		String result = data.replaceAll(sourceFileMask, destinationFileName);
		System.out.println("Result =" + result);
		pattern = Pattern.compile("^(\\$.)|([^\\\\]\\$.)|([^\\\\]\\$$)");
		matcher = pattern.matcher(destinationFileName);
			while(matcher.find()) {
				String numbers = matcher.group();
				numbers = numbers.substring(numbers.length() - 1);
				
				System.out.println(numbers);
				int num;
				try {
		            num = Integer.valueOf(String.valueOf(numbers));
		        } catch (NumberFormatException e) {
		        	System.out.println("Something is wrong");
		        	break;
		        }
				if (num > groupCount) {
					System.out.println("Something is wrong numbers");
		        	break;
				}
			}
		}
		catch (PatternSyntaxException pse) {
			
			System.out.println("The description is:" + pse.getDescription());
			System.out.println("The message is::" + pse.getMessage());
		}
	}

}
