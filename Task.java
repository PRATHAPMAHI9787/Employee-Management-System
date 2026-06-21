import java.util.*;

class Employee{
    int Id;
    String Name;
    String Department;

    Employee(int Id,String Name,String Department){
        this.Id = Id;
        this.Name = Name;
        this.Department = Department;
    }
}
public class Task{
      static Scanner input = new Scanner(System.in);
   static ArrayList<Employee> data = new ArrayList<>(); 
public static void main(String[]args){
    
 

    while(true){
    System.out.println("Welcome Employee Management System");
    System.out.println("1.Add New Employee");
    System.out.println("2.View All Employee");

    System.out.println("3.Search Employee by Id");

    System.out.println("4.Update Employee Department");
    System.out.println("5.Exit the Application");
    System.out.println(" ");

    int choicechoose = input.nextInt();

    switch(choicechoose){
        case 1: 
           AddEmp();
           break;
        case 2:
            ViewEmp();
            break;
        case 3:
            SearchEmp();
            break;
        case 4:
            UpadateDept();
            break;
        case 5:
            System.exit(0);
            break;
            
        default:
            System.out.println("Wrong option");
    }
}
}

      public static void AddEmp(){
        System.out.println("Welcome New User!");
        System.out.println("Enter ID:");
        int Id = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name:");
        String Name = input.nextLine();
        

        System.out.println("Enter Department");
        String Department = input.nextLine();

        Employee Emp = new Employee(Id, Name, Department);
    data.add(Emp);
    System.out.println("AddUser Successfuly ");
    System.out.println(" ");
      }
      public static void ViewEmp(){
        for(Employee e:data){
            System.out.println(e.Id +" ," + e.Name + " ," + e.Department);
        }
        System.out.println(" ");
      }
      public static  void SearchEmp(){
        System.out.println("Enter Id:");
        int Id= input.nextInt();
        boolean found = false;
        for(Employee e : data){
            if(e.Id == Id){
                System.out.println("User foud");
                System.out.println( e.Id+ " ," + e.Name + " ," + e.Department);
                found = true;
                System.out.println(" ");
            }
            if(!found){
                System.out.println("User Not Found!");
            }
        }
      }
      public static void UpadateDept(){
        System.out.println("Enter Id:");
        int Id= input.nextInt();
        input.nextLine();
        boolean found = false;
        for(Employee e:data){
            if(e.Id == Id){
                System.out.println("User Found");
                System.out.println(e.Id+" " + e.Name + " " + e.Department);
                System.out.println("Enter the new Department");
                
                e.Department= input.nextLine();

                System.out.println("Update Sucess");
                found = true;
                System.out.println("");
            }
        }
            if(!found){
                System.out.println("User Not Found");
            }
            

        
      
    }
}
    
