class StringMethods
{
    public static void main(String[] args)
    {
        String name = "Harry";
        System.out.println(("Original Name is - " + name));

        // used to return the length of the string
        int nameLength = name.length();
        System.out.println("The length of the name is - " + nameLength);

        // used to convert a string to lower case letters
        String loweredName = name.toLowerCase();
        System.out.println("The name in lower case is - " + loweredName);

        // used to convert a string to upper case letters
        String capitalizedName = name.toUpperCase();
        System.out.println("The name in upper case is - " + capitalizedName);

        System.out.println("------------------------------------------------");

        String sentence = "   Today is a good day!   ";
        System.out.println("Sentence for the next method - " + sentence);

        // used to return a new string after removing all the leading and trailing spaces from the original string
        String noLeadingTrailingSpaces = sentence.trim();
        System.out.println("Sentence after trimming - " + noLeadingTrailingSpaces);

        System.out.println("------------------------------------------------");

        // used to return a substring from start index (specified as parameter) to the end of string
        // note that the start index is included
        String subString = name.substring(1);
        System.out.println("The substring of name from index 1 is - " + subString);

        // used to return a substring from start index to end index (both indices specified as parameters)
        // note that the start index in inclusive but the end index is not
        String subString2 = name.substring(1, 4);
        System.out.println("The substring of name from index 1 (including) to index 4 (excluding) is - " + subString2);

        // used to return a new string after replacing first character with second character (both character specified as parameters)
        // note that all occurrences of the first character are replaced by the second character
        String replaceName = name.replace('r', 'p');
        System.out.println("The name string replaced by character 'r' with 'p' is - " + replaceName);

        // used to return a new string after replacing first string with second string (both strings specified as parameters)
        // note that all occurrences of the first string are replaced by the second string
        String replaceName2 = name.replace("rry", "ier");
        System.out.println("The name string replaced by string 'rry' with 'ier' is - " + replaceName2);

        // used to check if a string starts with a particular string taken as input parameter
        // returns boolean values as output
        boolean startingCheck = name.startsWith("Ha");
        System.out.println("The boolean value obtained with startsWith() method is - " + startingCheck);

        // used to check if a string ends with a particular string taken as input parameter
        // returns boolean values as output
        boolean endingCheck = name.endsWith("ry");
        System.out.println("The boolean value obtained with endsWith() method is - " + endingCheck);

        // used to return the character at a given index position taken as input parameter
        char characterReturn = name.charAt(2);
        System.out.println("The character at index position 2 in name is - " + characterReturn);

        // used to return index of input string (taken as parameter) from the original string
        // if the input string (parameter) is found in the original string, it returns the index of the first found occurrence, otherwise returns -1
        // starts searching the string from left to right (IMPORTANT)
        int indexFindOccurrence = name.indexOf("ar");
        System.out.println("The string 'ar' is first occurred in original string name at index - " + indexFindOccurrence);

        // used to return index of input string (taken as parameter) from the original string but start searching not from index 0 but from an index specified by user (taken as input parameter)
        // if the input string (parameter) from the particular index is found in the original string, it returns the index of the first found occurrence, otherwise returns -1
        // starts searching the string from left to right from the parameter index as input to the function's second argument (IMPORTANT)
        int indexFindOccurrenceCustomIndex = name.indexOf("ar", 3);
        System.out.println("The string 'ar' is first occurred in the original string name from index 3 onwards as (-1 means no match found) - " + indexFindOccurrenceCustomIndex);

        // used to return index of input string (taken as parameter) from the original string
        // if the input string (parameter) is found in the original string, it returns the index of the first found occurrence, otherwise returns -1
        // starts searching the string from right to left (IMPORTANT)
        int indexFindOccurrenceReverse = name.lastIndexOf("ry");
        System.out.println("The string 'ry' from the last in name is found at index - " + indexFindOccurrenceReverse);

        // used to return index of input string (taken as parameter) from the original string but start searching not from last index, but from an index specified by user (taken as input parameter)
        // if the input string (parameter) from the particular index is found in the original string, it returns the index of the first found occurrence, otherwise returns -1
        // starts searching the string from right to left from the parameter index as input to the function's second argument (IMPORTANT)
        int indexFindOccurrenceReverseCustomIndex = name.lastIndexOf("rr", 3);
        System.out.println("The string 'rr' from the last in name is found at index - " + indexFindOccurrenceReverseCustomIndex);

        // used to compare two strings to each other keeping case sensitivity in mind
        // returns true if both strings compared are same else returns false (boolean value)
        boolean isEqual = name.equals("harry");
        System.out.println("The result of comparison of name with string 'harry' by keeping case in mind is - " + isEqual);

        // used to compare two strings to each other ignoring case sensitivity
        // returns true if both strings compared are same else returns false (boolean value)
        boolean isEqualIgnoreCase = name.equalsIgnoreCase("HaRRy");
        System.out.println("The result of comparison of name with string 'HaRRy' by ignoring case is - " + isEqualIgnoreCase);

    }
}