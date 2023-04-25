package codility.upgrade_functionalities;
/*
 * @created on 25.04.2023
 * @author sahin
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {

    public boolean doesStringContainVisibleCharacters(String input) {
        // Java 11 introduced a special String's method that could replace the expression below.
        // return !input.trim().equals("");
        return !input.isBlank();
    }

    public List<String> splitToLines(String input) {
        // Java 11 introduced a special String's method that could replace the expression below.
        // String[] lines = input.split("\n");
        // return Arrays.asList(lines);

        return input.lines().collect(Collectors.toList());

    }

    public String trimUnicodeString(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        // Note: The final implementation should operate on wider spectrum of whitespace characters than trim method
        // return input.trim();
        return input.strip();
    }


    public String trimLeft(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        // return input.replaceAll("^\\s*", "");
        return input.stripLeading();
    }

    public String trimRight(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
        // return input.replaceAll("\\s*$", "");
        return input.stripTrailing();
    }

    public String repeatStringFiveTimes(String input) {
        // Java 11 introduced a special String's method that could replace the expression below
       /* StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(input);
        }
        return sb.toString(); */
        return input.repeat(5);
    }

    public void saveStringInFile(String fileContents, String filename) throws Exception {
        Path file = Paths.get(filename);
        // Please implement the rest of this method using one of the methods of the Files class
        // The function should write the given string to the file with the given name
        Files.writeString(file, fileContents);
    }

    public String readFileContents(String filename) throws Exception {
        Path file = Paths.get(filename);
        // Please implement the rest of this method using one of the methods of the Files class
        // The function should read the contents of the file and return it as a single String value
        // return "Please fix that method.";
        return Files.readString(file);
    }

    public List<String> filterOutEmptyStrings(List<String> input) {
        // Java 11 introduces new type of Predicate - please use it here
        Predicate<String> notEmpty = Predicate.not(String::isEmpty);
        return input.stream()
                .filter(notEmpty)
                .collect(Collectors.toList());
    }
}
