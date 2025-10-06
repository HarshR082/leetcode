class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean sign = false;
        s = s.trim();
        boolean signSeen = false;   // added flag to ensure sign appears only before digits

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '-' || c == '+') {
                // sign allowed only if no digits seen and not seen before
                if (sb.length() > 0 || signSeen) break;
                if (c == '-') sign = true;
                signSeen = true;
                continue;
            }

            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                break;
            }
        }

        String ss = sb.toString();
        if (ss.equals("")) return 0;

        int n = 0;
        try {
            n = Integer.parseInt(ss);
        } catch (Exception e) {
            return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        if (sign) n = n * (-1);
        return n;
    }
}
