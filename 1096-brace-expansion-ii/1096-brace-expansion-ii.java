class Solution {
    int index = 0;
    public List<String> braceExpansionII(String expression) {
        Set<String> result = solve(expression);
        return new ArrayList<>(result);
    }

    Set<String> solve(String s) {
        Set<String> result = new TreeSet<>();
        Set<String> current = new TreeSet<>();

        current.add("");

        while(index < s.length() && s.charAt(index) != '}') {
            char ch = s.charAt(index);

            // Comma → finish current option
            if(ch == ',') {
                result.addAll(current);
                current.clear();
                current.add("");
                index++;
            }

            // Opening brace → recursively solve it
            else if(ch == '{') {
                index++;
                Set<String> group = solve(s);
                index++; // skip '}'
                current = combine(current, group);
            }

            // Normal character
            else {
                Set<String> letter = new TreeSet<>();
                letter.add(String.valueOf(ch));
                current = combine(current, letter);
                index++;
            }
        }

        result.addAll(current);
        return result;
    }

    Set<String> combine(Set<String> a, Set<String> b) {
        Set<String> result = new TreeSet<>();

        for(String x : a) {
            for(String y : b) {
                result.add(x + y);
            }
        }

        return result;
    }
}