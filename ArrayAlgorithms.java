public class ArrayAlgorithms {
    public static String longestString(String[] stringList) {
        int current = stringList[0].length();
        String max = " ";
        for (String string : stringList) {
            if (string.length() >= current) {
                current = string.length();
                max = string;
            }
        }
        return max;
    }

    public static boolean containsPositive(int[] numList) {
        for (int nums : numList) {
            if (nums > 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] makeLowercase(String[] wordList) {
        String[] newWordList = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            newWordList[i] = wordList[i].toLowerCase();
        }
        return newWordList;
    }

    public static int endsInExclamations(String[] stringList) {
        int count = 0;
        for (String string : stringList) {
            if (string.substring(string.length() - 1).equals("!")) {
                count++;
            }
        }
        return count;
    }

    public static void makeUppercase(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] max = new int[intArr1.length];
        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] > intArr2[i]) {
                max[i] = intArr1[i];
            } else {
                max[i] = intArr2[i];
            }
        }
        return max;
    }

    public static int countConsecutiveDoubles(int[] numList) {
        int count = 0;
        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] == numList[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static int longestStreak(int[] nums) {
        int streak = 0;
        int maxStreak = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                streak++;
                if (streak > maxStreak) {
                    maxStreak = streak;
                }
            } else {
                streak = 0;
            }
        }
        return maxStreak + 1;
    }

}
