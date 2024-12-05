public class StringFunctions {
    public static void main(String[] args) {
        // Declare some sample strings
        String str1 = "Hello";
        String str2 = "World";

        // 1. Length of the string
        System.out.println("Length of str1: " + str1.length());

        // 2. Concatenate two strings
        String concatenatedString = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + concatenatedString);

        // 3. Substring of a string
        String substring = concatenatedString.substring(6, 11); // Extract "World"
        System.out.println("Substring: " + substring);

        // 4. Convert to uppercase
        String upperCaseString = str1.toUpperCase();
        System.out.println("Uppercase of str1: " + upperCaseString);

        // 5. Convert to lowercase
        String lowerCaseString = str2.toLowerCase();
        System.out.println("Lowercase of str2: " + lowerCaseString);

        // 6. Character at a specific index
        char charAtIndex = str1.charAt(1); // 1st index character
        System.out.println("Character at index 1 of str1: " + charAtIndex);

        // 7. Replace a substring in the string
        String replacedString = concatenatedString.replace("World", "Java");
        System.out.println("Replaced String: " + replacedString);

        // 8. Check if the string contains another string
        boolean containsSubString = concatenatedString.contains("Java");
        System.out.println("Does the concatenated string contain 'Java'? " + containsSubString);
    }
}
