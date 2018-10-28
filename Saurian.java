
// Programmer:
// Date:
// The Saurian class has the ability to translate English to Saurian
//  and Saurian to English

import java.util.*;

public class Saurian {
	// data
	private String engForm;
	private String saurForm;

	// constants used for translating
	// note M = M and m = m so M and m are not needed
	public static final char[] ENGLISHARR = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	public static final char[] SAURIANARR = { 'U', 'R', 'S', 'T', 'O', 'V', 'W', 'X', 'A', 'Z', 'B', 'C', 'D', 'E', 'F',
			'G', 'H', 'J', 'K', 'I', 'L', 'N', 'P', 'O', 'Q', 'u', 'r', 's', 't', 'o', 'v', 'w', 'x', 'a', 'z', 'b',
			'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'i', 'l', 'n', 'p', 'o', 'q' };
	public static final int ARRLENGTH = ENGLISHARR.length; // should be the same length for ENGLISHARR and SAURIANARR

	public Saurian() {
		engForm = "hello";
		saurForm = "hello";
	}

	public setEnglilsh(String phrase, boolean engOrSaur){
		
	}

}
