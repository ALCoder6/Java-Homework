class week7hw6
{
    public static void main(String a[])
    {
        Student stud1 = new Student();
        stud1.Id = 9;
        stud1.Name = "Kageyama Tobio";
        stud1.Country = "Japan";
        
        Student stud2 = new Student();
        stud2.Id = 10;
        stud2.Name = "Hinata Shoyo";
        stud2.Country = "Japan";

        Student.printStudentInfo1(stud1);
        Student.printStudentInfo1(stud2);

        stud1.printStudentInfo2();
        stud2.printStudentInfo2();
    }
}

class Student
{
    int Id;
    String Name;
    static String Country;
    
    public static void printStudentInfo1(Student stud)
    {
        System.out.println("Id: " + stud.Id);
        System.out.println("Name: " + stud.Name);
        System.out.println("Country: " + Country);
    }

    public void printStudentInfo2()
    {
        System.out.println("Id: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Country: " + Country);
    }
}

