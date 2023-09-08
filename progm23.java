//toString method
class Student{
    
        int rollno;
        String name,city;
        Student(int rollno , String name, String city)
        {
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }
        public String toString()
        {
            return rollno  +  name  + city;
        }
         public static void main(String args[])
    {
    Student s1= new Student(102, "raj" , "ujjain");
    Student s2= new Student(101, "tanu", "indore");
    System.out.println(s1);
    System.out.println(s2);
    
        }
    }
