import java.util.HashMap;
import java.util.Map;

public class TestCode {
	
	
	public static void main(String[] args) {
		
		String str1 = "Google76";
		
		char[] chars = str1.toCharArray();
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(char c : chars) {
			
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			}else
				charCount.put(c, 1);
		}
		
		System.out.println(charCount);
	}
}


//ExpectedConditions.visiblityofElements
// alertIsPresent
//elementToSelected
//titleContains
//elementToBeClickable
//invisiblityofAllElements

// WebDriver driver = new ChromeDriver();





