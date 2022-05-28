class Employee          //employee details in class
{
    String name;
    int yoj;    //year of joining 
    int salary; 
    String address;
    Employee(String name,int yoj,int salary,String address)
    {
        this.name=name;     //parameterized constructor to pass values here 
        this.yoj=yoj;
        this.salary=salary;
        this.address=address;
    }
    public void display()   //function to display output in desirable format 
    {
        System.out.print(name+"\t\t\t");
        System.out.print(yoj+"\t\t\t\t");
        System.out.print(salary+"\t\t\t\t");
        System.out.println(address);
    }
    public static void main(String args[])
    {
        System.out.println("Name\t\t\tYear of joining\t\tSalary\t\t\t\tAddress");
        Employee e1=new Employee("Robert",1994,10000,"64C-WallsStreet");
        Employee e2=new Employee("Sam\t",2000,20000,"68D-WallsStreet");
        Employee e3=new Employee("John",1999,30000,"26B-WallsStreet");
        e1.display();
        e2.display();
        e3.display();

    }
}
