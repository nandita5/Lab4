/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * This class is a reclamation project.
 */
public class ReclamationProject {
    /**
     * This variable has the name doit.
     * @param a The first word.
     * @param b The second word.
     * @return This returns the variable r.
     */
    public static String doit(final String a, final String b) {
        if (a.length() > b.length()) {
            String tempA = a;
            String tempB = b;
            tempA = b;
            tempB = a;
        }
            String r = "";
            /*
             * For loop with i
             */
            for (int i = 0; i < a.length(); i++) {
                for (int j = a.length() - i; j > 0; j--) {
                    for (int k = 0; k < b.length() - j; k++) {
                        if (a.regionMatches(i, b, k, j) && j > r.length()) {
                            a.substring(i, i + j);
                        }
                    }
               } // Ah yeah
            }
            return r;
    }
}
