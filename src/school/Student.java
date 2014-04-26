package school;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Student {

	Scanner usr_input = new Scanner(System.in);
	
	String name;
	String rollno;	
	
	void enter() {	
		System.out.println("Enter Name: ");
		name = usr_input.next();
		System.out.println("Enter Roll No: ");
		rollno = usr_input.next();
	}	

	void print() {	
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + name + "\n");		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.enter();
		s1.print();
		
		System.out.print("Enter Text: ");
		Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        
        try {
        	
          fWriter = new FileWriter("text.txt");
          writer = new BufferedWriter(fWriter);
          writer.write(text);
          writer.newLine();
          writer.close();
          System.err.println("Your input of " + text.length() + " characters was saved.");
          
        } catch (Exception e) {
            System.out.println("Error!");
        }
        
        scan.close();
	}
}
