package SoftUniada;

import java.util.HashMap;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        largestPalindrome(number);
    }

    public static void largestPalindrome(String num)
    {
        int length = num.length();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            if (map.containsKey(num.charAt(i) - '0'))
                map.put(num.charAt(i) - '0',
                        map.get(num.charAt(i) - '0') + 1);
            else
                map.put(num.charAt(i) - '0', 1);
        }

        if (isPossible(map, length, num) == false)
        {
            System.out.print("No palindromic number available.");
            return;
        }

        char []largest = new char[length];
        int front = 0;

        for (int i = 9; i >= 0; i--) {
            if (map.containsKey(i) && map.get(i)%2==1) {
                largest[length / 2] = (char)(i + 48);
                map.put(i, map.get(i)-1);

                while(map.get(i) > 0) {
                    largest[front] = (char)(i + 48);
                    largest[length - front - 1] =
                            (char)(i + 48);
                    map.put(i, map.get(i) - 2);
                    front++;
                }
            }
            else {
                while (map.containsKey(i) && map.get(i) > 0) {
                    largest[front] = (char)(i + 48);
                    largest[length - front - 1] =
                            (char)(i + 48);
                    map.put(i, map.get(i) - 2);

                    front++;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(largest[i]);
        }
    }

    static boolean isPossible(HashMap<Integer, Integer> map, int length, String num) {
        int countOdd = 0;
        for (int i = 0; i < length; i++)
        {
            if (map.get(num.charAt(i) - '0') % 2 == 1) {
                countOdd++;
            }
            if (countOdd > 1) {
                return false;
            }
        }
        return true;
    }
}

