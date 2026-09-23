package com.supply_chain_base_operation.utility;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class SystemUtility {

    private static Map<String, Long> entitySequence = new HashMap<>();

    public static String generateId(String entityName) {

        Long sequence = entitySequence.getOrDefault(entityName, 0L) + 1;

        entitySequence.put(entityName, sequence);

        String formattedName = entityName
                .replaceAll("([a-z])([A-Z])", "$1_$2")
                .toUpperCase();
        return formattedName + "_" + String.format("%06d", sequence);
    }

    public static String generatePassword(int length) {

        if (length < 4) {
            throw new IllegalArgumentException(
                    "Password length must be at least 4"
            );
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "@#$%&*!";

        String allCharacters = upper + lower + numbers + special;

        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder(length);

        // Ensure at least one of each type
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length())));
        password.append(special.charAt(random.nextInt(special.length())));

        // Generate remaining characters
        for (int i = 4; i < length; i++) {
            password.append(
                    allCharacters.charAt(
                            random.nextInt(allCharacters.length())
                    )
            );
        }

        // Shuffle the generated password
        for (int i = password.length() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }

        return password.toString();
    }
}
