package complete;
/*
 * Write a function to flatten a nested dictionary. Namespace the keys with a period.
 */

import java.util.*;

public class p173flattendictionary {
    public static void flatten(final String keyPrefix, final Map<String, Object> input, final Map<String, Object> output) {
        //Step through each entry in input, set to e
        for (final Map.Entry<String, Object> e : input.entrySet()) {
            //If the keyPrefix (the final result) is blank, get a key from e, otherwise append the key from e to the keyPrefix
            final var key = keyPrefix.isBlank() ? e.getKey() : keyPrefix + "." + e.getKey();
            //If the value retrieved from e is a map
            if (e.getValue() instanceof Map) {
                //Run recursively on the map, passing the temp key, with the retrieved value, and the current result
                flatten(key, (Map<String, Object>) e.getValue(), output);
            } else {
                //If the retrieved value is not a map, add the value and the key
                output.put(key, e.getValue());
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception{
        //Create data
        final var data = Map.of(
            "key", 3,
            "foo", Map.of(
                "a", 5, "bar", Map.of(
                    "baz", 8) )
        );

        //Create a variable fro the output
        final var output = new HashMap<String, Object>();
        //Run flatten on data with empty keyPrefix
        flatten("", data, output);
        System.out.println(output);
        //Print data into a readable form
        output.forEach((k, v) -> System.out.printf("%s: %s%n", k, v));
    }
}
