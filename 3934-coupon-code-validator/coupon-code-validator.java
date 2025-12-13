import java.util.*;
import java.util.regex.Pattern;

class Solution {

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+$");

        // Business priority order
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 1);
        priority.put("grocery", 2);
        priority.put("pharmacy", 3);
        priority.put("restaurant", 4);

        List<String[]> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i]
                && code[i] != null
                && pattern.matcher(code[i]).matches()
                && priority.containsKey(businessLine[i])) {

                validCoupons.add(new String[]{businessLine[i], code[i]});
            }
        }

        // Sort by businessLine order, then by code lexicographically
        Collections.sort(validCoupons, (a, b) -> {
            int cmp = priority.get(a[0]) - priority.get(b[0]);
            if (cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });

        // Extract only coupon codes into List<String>
        List<String> result = new ArrayList<>();
        for (String[] pair : validCoupons) {
            result.add(pair[1]);
        }

        return result;
    }
}
