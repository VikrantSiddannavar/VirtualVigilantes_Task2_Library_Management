package com.tloclibrary;
import java.util.Scanner;
import javax.swing.text.AbstractDocument.BranchElement;


public class Project_Task2 {
	public static void main(String[] args) {
		char r;
		do {
			System.out.println("**************Library Management System*************");
			System.out.println("Press numbers to take below actions\n 1: Add book\n 2: Issue a Book\n 3: Return a Book");
			System.out.println(" 4: Print complete issue details\n 5: Exit the library portal");
			Scanner obj1 = new Scanner(System.in);
			System.out.println("Enter any number");
			int a = obj1.nextInt();
			switch (a) {
			case 1:
				Library aa = new Library();
				aa.add();
				break;
			case 2:
				Library bb = new Library();
				bb.iss();
				break;
			case 3:
				Library cc = new Library();
				cc.ret();
				break;
			case 4:
				Library dd = new Library();
				dd.detail();
				break;
			case 5:
				Library ee = new Library();
				ee.exit();
				break;

			default:
				System.out.println("Invaild choice make right choice");
			}

			System.out.println("Do you want to choose next option Y/N");
			r = obj1.next().charAt(0);
		}
		while(r == 'y' || r == 'Y');

		if (r == 'n' || r == 'N') {
			Library z = new Library();
			z.exit();
		}
	}
}

class Library {
	static String str,b,date;
	static int a,c;
	void add() {
		System.out.println("Enter book Name, Price and Book_No");
		Scanner obj2 = new Scanner(System.in);
		System.out.print("Book_Name => ");
		String str = obj2.nextLine();
		System.out.print("Price of the Book => ");
		float price = obj2.nextInt();
		System.out.print("Book_Number => ");
		int bookno = obj2.nextInt();
		System.out.println("Your details are " + str + " " + price + " " + bookno);
	}

	void iss() {
		Scanner obj3 = new Scanner(System.in);
		System.out.println("Book Name");
		str = obj3.nextLine();
		System.out.println("Book_id");
		a = obj3.nextInt();
		obj3.nextLine();
		System.out.println("Issue date");
		b = obj3.nextLine();
		System.out.println("Total number of book Issued");
		c = obj3.nextInt();
		obj3.nextLine();
		System.out.println("Return book date");
		date = obj3.nextLine();
	}

	int getid() {
		return a;
	}

	void ret() {
		System.out.println("Enter Student_Name & book_id");
		Scanner c = new Scanner(System.in);
		String name = c.nextLine();
		int bookid = c.nextInt();
		if(a == bookid) {
			System.out.println("---- Details ----");
			System.out.println("Book Name: " + Library.str);
			System.out.println("Book_id: " + Library. a);
			System.out.println("Issue date: " + Library.b);
			System.out.println("Total number of book Issued: " + Library.c);
			System.out.println("Book return date: " + Library.date);
		}
		else {
			System.out.println("invalid id, please enetr valid input");
		}
	}

	void detail() {
		System.out.println("Book Name: " + Library.str);
		System.out.println("Book_id: " + Library. a);
		System.out.println("Issue date: " + Library.b);
		System.out.println("Total number of book Issued: " + Library.c);
		System.out.println("Book return date: " + Library.date);
	}

	void exit() {
		System.exit(0);
	}
}


































