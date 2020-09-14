/*
Algorithm to write a reverse string logic for a String provided as input,
but every xth  element on the string with length n size should not change the position
@Author : Created by Tuhin Kumar Daw(tuhin.daw@gmail.com) on 09/11/2020
 */

public class StringReversal
{
    public static String reverse(String inputString, int position) {
        char str[] = inputString.trim().toCharArray();
        int r = str.length - 1, l = 0;

        while (l < r) {
            if ((l >= position - 1) && ((l+1) % position == 0)) {
                l++;
            }

            else if ((r+1) % position == 0)
                r--;
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }

        return new String(str);
    }

    public static void main(String[] args)
    {
        String input1 = "jpmorgan";
        int position1 = 3;
        String exepectdOutput1 = "namrogpj";
        String actualOutput1 = reverse(input1,position1);
        System.out.println("Validating output of the algorithm with input string having even number of characters " + " " +exepectdOutput1.equals(actualOutput1));

        String input2 = "jpmorganchase";
        int position2 = 4;
        String exepectdOutput2 = "eahocagnrmpsj";
        String actualOutput2 = reverse(input2,position2);
        System.out.println("Validating output of the algorithm with input string having odd number of characters " + " " +exepectdOutput2.equals(actualOutput2));
    }
}
