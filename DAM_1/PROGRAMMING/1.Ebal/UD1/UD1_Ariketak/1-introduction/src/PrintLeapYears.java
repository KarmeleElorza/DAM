/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class PrintLeapYears {

    public static void main(String[] args) {
        int i, count = 0;

        for (i = 999; i <= 2010; i++) {

            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i);
                ++count;
            }
        }

        System.out.println(count);
    }
}
