class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> readBinaryWatch(int turnedOn) {
        backtrack(0, 0, 0,0, turnedOn);
        return ans;
    }

    // idx = current LED (0 to 9)
    // hour, minute = current time
    // on = how many LEDs are ON till now
    public void backtrack(int idx, int hour, int minute, int on, int turnedOn) {
        // invalid time
        if (hour > 11 || minute > 59) return;

        // all LEDs checked
        if (idx == 10) {
            if (on == turnedOn) {
                ans.add(hour + ":" + (minute < 10 ? "0" : "") + minute);
            }
            return;
        }

        // choice 1: LED OFF
        backtrack(idx + 1, hour, minute, on, turnedOn);

        // choice 2: LED ON
        if (idx < 4) { // hour LEDs
            backtrack(idx + 1, hour + (1 << idx), minute, on + 1, turnedOn);
        } else { // minute LEDs
            backtrack(idx + 1, hour, minute + (1 << (idx - 4)), on + 1, turnedOn);
        }
    }
}