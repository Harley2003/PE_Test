
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isPrimeDigit(c)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrimeDigit(char c) {
        int digit = c - '0';
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
