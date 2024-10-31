package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){

        String [] splitString = input.split(" ");
        int count = 0;
        for(int i=0;i<=splitString.length-1;i++){

         //   String input = "fez day";
        System.out.println("Splitstring : " + splitString[i]);
        int len = splitString[i].length()-1;
        System.out.println("len : " + len);
        String str = splitString[i];
        System.out.println("str : " + str);
           char extractedChar = str.charAt(len);
            System.out.println("extracted char : " + extractedChar);
          // count = 0;
       if(extractedChar == 'y'  || extractedChar == 'z'){
           count ++;

            }
            System.out.println("count : " + count);
          //  return count;
        }
        System.out.println("count : " + count);
        return count;

    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        return base.replace(remove,"");

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isCount = 0;
        int notCount = 0;

        String lowercaseStr = input.toLowerCase();

        for (int i = 0; i < lowercaseStr.length() - 2; i++) {
            if (lowercaseStr.substring(i, i +2).equals("is")) {
                isCount++;
            } else if (lowercaseStr.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }

        return isCount == notCount;
    }

   // }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
//
	 //All g's are happy

        int len = input.length();
        boolean happy = true;

        for (int i = 0; i < len - 1; i++) {
            if (input.charAt(i) == 'g') {
                //first
                if (i > 0 && input.charAt(i - 1) == 'g') {
                    happy = true;
                    //anything in between
                } else if (input.charAt(i - 1) == 'g' || input.charAt(i + 1) == 'g') {
                    happy = true;
                    //last
                } else if (i < len - 1 && input.charAt(i + 1) == 'g') {
                    happy = true;
                } else

                    happy = false;
            }

        }

        return happy;

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int l = input.length(); // Get the length of the given string
        int ctr = 0; // Initialize a counter for triples

        // Loop through the string to check for triples
        for (int i = 0; i < l - 2; i++) {
            char tmp = input.charAt(i); // Get the character at index 'i'

            // Check if the character at index 'i' is the same as the next two characters
            if (tmp == input.charAt(i + 1) && tmp == input.charAt(i + 2)) {
                ctr++; // Increment the counter if a triple is found
            }
        }
        return ctr; // Return the total count of triples
    }

        //return null;
    }

