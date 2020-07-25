package com.epam.weektwo;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.util.Scanner;

class Gift {
	//Initially chocolates ,candies sweets in gift box is taken as zero 
	int chocolates=0,candies=0,sweets=0;	
	int chocwt=0,candwt=0,sweetwt=0;	
}
class Chocolate extends Gift {  
	public int[] choco;
	public int[] candy;
	public int[] sweeti;
	
	// To arrange each weets,candies,choclates in ascending(sorting order)
	public void sortsweeti(int sweets) {
		int t=0;
		for(int i=0;i<sweets-1;i++) {
			for(int j=i+1;j<sweets;j++) {
				if (sweeti[i]<sweeti[j]) {
					t=sweeti[j];
					sweeti[j]=sweeti[i];
					sweeti[i]=t;
				}
			}
		}
	}

	public void sortchocolate(int chocolates) {
		int t=0;
		for(int i=0;i<chocolates-1;i++) {
			for(int j=i+1;j<chocolates;j++) {
				if (choco[i]<choco[j]) {
					t=choco[j];
					choco[j]=choco[i];
					choco[i]=t;
				}
			}
		}
	}
	public void sortcandy(int candies) {
		int t=0;
		for(int i=0;i<candies-1;i++) {
			for(int j=i+1;j<candies;j++) {
				if (candy[i]<candy[j]) {
					t=candy[j];
					candy[j]=candy[i];
					candy[i]=t;
				}
			}
		}
	}
}
public class App 
{
	public static void main(String[] args) {
		//to create object of Scanner and Chocolate classes
		Scanner scan=new Scanner(System.in);
		Chocolate ch=new Chocolate();
		int ot=0;
		
		do {
			System.out.print("\n\t Enter 1. Chocolate, 2. Candies, 3. Sweets :- ");
			int n=scan.nextInt();
			
			switch(n) {
				case 1:System.out.print("\n\t How many chocolates you want to add:");
						ch.chocolates = scan.nextInt();
						ch.choco = new int[ch.chocolates];
						System.out.print("Enter the weights of each chocolates:");
						for(int i=0;i<ch.chocolates;i++) {
							ch.chocwt=scan.nextInt();
							ch.choco[i]=ch.chocwt;
						}
						break;
				case 2:System.out.print("\n\t How many candies you want to add:");
						ch.candies = scan.nextInt();
						ch.candy = new int[ch.candies];
						System.out.print("Enter the weights of each candies:");
						for(int i=0;i<ch.candies;i++) {
							ch.candwt=scan.nextInt();
							ch.candy[i]=ch.candwt;
						}
						break;
				case 3:System.out.print("\n\t How many sweets you want to add:");
						ch.sweets = scan.nextInt();
						ch.sweeti = new int[ch.sweets];
						System.out.print("Enter the weights of each sweets:");
						for(int i=0;i<ch.sweets;i++) {
							ch.sweetwt=scan.nextInt();
							ch.sweeti[i]=ch.sweetwt;
						}
						break;
			}
			System.out.print("\n\t Do you want to exit - 0 or to continue - 1:");
			ot=scan.nextInt();
		} while(ot==1);
		
		ch.sortchocolate(ch.chocolates);
		ch.sortcandy(ch.candies);
		ch.sortsweeti(ch.sweets);
		
		//to print for last to start lists
		System.out.println("The sorted order of chocolates are : ");
		for(int i=0;i<ch.chocolates;i++) {
			System.out.println(ch.choco[i]);
		}
		System.out.println("The sorted order of cadies are : ");
		for(int i=0;i<ch.candies;i++) {
			System.out.println(ch.candy[i]);
		}
		System.out.println("The sorted order of sweets are : ");
		for(int i=0;i<ch.sweets;i++) {
			System.out.println(ch.sweeti[i]);
		}
	}
}
