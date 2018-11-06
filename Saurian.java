
// Programmer: David Palacios 
// Date:
// The Saurian class has the ability to translate English to Saurian
//  and Saurian to English

import java.util.*;

public class Saurian {
	// data
	private String english;
	private String saurian;

	// constants used for translating
	// note M = M and m = m so M and m are not needed
	public static final char[] ENGLISHARR = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	public static final char[] SAURIANARR = { 'U', 'R', 'S', 'T', 'O', 'V', 'W', 'X', 'A', 'Z', 'B', 'C', 'D', 'E', 'F',
			'G', 'H', 'J', 'K', 'I', 'L', 'N', 'P', 'O', 'Q', 'u', 'r', 's', 't', 'o', 'v', 'w', 'x', 'a', 'z', 'b',
			'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'i', 'l', 'n', 'p', 'o', 'q' };
	public static final int ARRLENGTH = ENGLISHARR.length; // should be the same length for ENGLISHARR and SAURIANARR

	// Default constructer
	public Saurian() {
		english = "A";
		saurian = "U";
	}

	public Saurian(String phrase, boolean engOrSaur) {

	}

	// getter methods below
	public String getEnglish() {
		return english;
	}

	public String getSaurian() {
		return saurian;
	}

	// Setter methods below
	public void setEnglish(String english) {
		this.english = english;
		translateEngToSaur(english);
	}

	public void setSaurian(String saurian) {
		this.saurian = saurian;
		translateSaurToEng(saurian);
	}

	// Translator methods below
	public void translateEngToSaur(String englishToSaur) {
		saurian = "";

		for (int i = 0; i < englishToSaur.length; i++) {
			for (int j = 0; j < ENGLISHARR.length; j++) {
				if (englishToSaur.substring(j, j + 1).equals(ENGLISHARR[j])) {
					saurian += SAURIANARR;
					continue;
				}
			}
		}
	}

	public void translateSaurToEng(String saurian) {
		english = "";
		for (int i = 0; i < saurToEnglish.length; i++) {
			for (int j = 0; j < SAURIANARR.length; j++) {
				if (saurianToEnglish.substring(j, j + 1).equal(ENGLISHARR[j])) {
					english += ENGLISHARR[j];
					continue;
				}
			}
		}
	}
}
