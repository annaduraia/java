package hack;

public class Solution_Scanner {

//https://codereview.stackexchange.com/questions/153481/determine-if-two-strings-with-unrecognized-letters-are-from-the-same-text
	
	public String expand(String s) {
	    final StringBuilder expanded = new StringBuilder();

	    for (int i = 0; i < s.length(); i++) {
	        if (Character.isLetter(s.charAt(i))) {
	            expanded.append(s.charAt(i));
	        } else {
	            for (int j = 0; j < Character.getNumericValue(s.charAt(i)); j++) {
	                expanded.append('?');
	            }
	        }
	    }

	    return expanded.toString();
	}
	public boolean Solution(String s, String t) {
	    final String expandedS = expand(s);
	    final String expandedT = expand(t);

	    if (expandedS.length() != expandedS.length()) {
	        return false;
	    }

	    for (int i = 0; i < expandedS.length(); i++) {
	        if (expandedS.charAt(i) != '?' && expandedT.charAt(i) != '?'
	                && expandedS.charAt(i) != expandedT.charAt(i)) {
	            return false;
	        }
	    }

	    return true;
	}
	public static void main(String[] args) {
		//https://github.com/sunilsoni/Codility-Practice
		 System.out.println(new Solution_Scanner().Solution("A2Le", "2pL1"));
		 System.out.println(new Solution_Scanner().Solution("a10", "10a"));
		System.out.println(new Solution_Scanner().Solution("ba1", "1Ad"));

	}
}
