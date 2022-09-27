package com.masai.Assignment2.Question5;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int l = sc.nextInt();
        System.out.println("Enter width ");
        int w = sc.nextInt();
        System.out.println("Enter height ");
        int h = sc.nextInt();

        int volume = l * w * h;
        System.out.println(volume);

	}

}
