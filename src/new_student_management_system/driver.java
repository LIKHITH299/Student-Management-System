package new_student_management_system;
import java.util.*;
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<student> students = new ArrayList<>();
		int choice;
		do {
		System.out.println(" 1.Add Students\n 2.View Students\n 3.Search Student\n 4.Update\n 5.Delete\n 6.Exit\n");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: student s = new student(); 
				System.out.println("\nEnter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				s.id = id;
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				s.name = name;
				System.out.println("Enter Age: ");
				int age = sc.nextInt();
				s.age = age;
				
				students.add(s);
				System.out.println("Student Added Successfully");
				System.out.println("***************************************");
				System.out.println();
				
				break;
		case 2: if(!students.isEmpty()) {
			for(student x: students) {
			System.out.println();
			System.out.println(x.id + " " + x.name + " " + x.age);
			}
		}
			else {
				System.out.println("Table is empty!!!");
				System.out.println("***************************************");
				System.out.println();
			}
		System.out.println("***************************************");
		System.out.println();
		break;
		
		case 3: 
			boolean found = false;
			System.out.println("Enter the student id to search: ");
			int searchId = sc.nextInt();
			
			for(student a: students){
				if(a.id == searchId) {
					System.out.println(a.id + " " + a.name + " " + a.age);
					found = true;
					break;
				}
			}
				if(!found) {
					System.out.println("Student is not found.");
					System.out.println("***************************************");
					System.out.println();
			}
			System.out.println("***************************************");
			System.out.println();
		break;
		
		case 4: 
			boolean isfound = false;
			System.out.println();
			System.out.println("enter the id to replace:");
			int search = sc.nextInt();
			sc.nextLine();
			for(student y :students) {
				if(search == y.id) {
					System.out.println("Ener the new name:");
					String newname = sc.nextLine();
					System.out.println("Enter the new age:");
					int newage = sc.nextInt();
					y.name = newname;
					y.age = newage;
					System.out.println("Updated Successfully!!!");
					System.out.println("***************************************");
					System.out.println();
					isfound = true;
					break;
					
				}
			}
				if(!isfound){
					System.out.println("Student is not found to update.");
					System.out.println("***************************************");
					System.out.println();
				}
			break;
			
		case 5: System.out.println("Enter the id to be deleted:");
				int del_id = sc.nextInt();
				boolean found1 = false;
				for(int i=0;i<students.size();i++){
					if(students.get(i).id == del_id) {
						students.remove(i);
						
						found1 = true;
						System.out.println("Deleted successfully!");
						System.out.println("***************************************");
						System.out.println();
						break;
					}
				}
				if(!found1){
					System.out.println("Student is not found to delete.");
					System.out.println("***************************************");
					System.out.println();
				}
			break;
			case 6: System.out.println("Thank You for using Our Application.");
			System.out.println("***************************************");
			System.out.println();
		return;
		}
		} while(choice != 6);
	}
}

