class week6hw2
{
    public static void main(String a[])
    {   
        Student classmates[] = new Student[3];

        classmates[0] = new Student();
        classmates[0].Id = 1;
        classmates[0].Name = "Angela";
        classmates[0].NickName = "Angie";

        classmates[1] = new Student();
        classmates[1].Id = 2;
        classmates[1].Name = "Sophia";
        classmates[1].NickName = "Sophs";

        classmates[2] = new Student();
        classmates[2].Id = 3;
        classmates[2].Name = "Bartholemew";
        classmates[2].NickName = "Barb";

        // for (Student i : classmates)
        // {
        //     System.out.println(i.Id);
        //     System.out.println(i.Name);
        //     System.out.println(i.NickName);
        // }

        String longStrg = "id: ";

        longStrg = longStrg.concat(String.valueOf(classmates[0].Id));
        longStrg = longStrg.concat("name: ");
        longStrg.concat(classmates[0].Name);
        longStrg.concat("nick name: ");
        longStrg.concat(classmates[0].NickName);
        longStrg.concat(String.valueOf(classmates[1].Id));
        longStrg.concat("name: ");
        longStrg.concat(classmates[1].Name);
        longStrg.concat("nick name: ");
        longStrg.concat(classmates[1].NickName);
        longStrg.concat(String.valueOf(classmates[2].Id));
        longStrg.concat("name: ");
        longStrg.concat(classmates[2].Name);
        longStrg.concat("nick name: ");
        longStrg.concat(classmates[2].NickName);
        
        System.out.println(longStrg);    
    }
    
}

class Student
    {            
        int Id;
        String Name;
        String NickName;
    }