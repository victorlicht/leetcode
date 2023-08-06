package com.victorlicht;

public class Main {
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        var start = 0;
        var end = letters.length - 1;
        if (target >= letters[end]) return letters[0];
        while (start <= end) {
            var mid = (start + end) / 2;
            if (letters[mid] == target) {
                if (letters[mid + 1] != target)
                    return letters[mid + 1];
                start = mid + 1;
            }else if (letters[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        if (end >= (letters.length-1) / 2) return letters[end + 1];
        else return letters[start];
    }
}
