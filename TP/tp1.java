
// Palindrome no.

import java.util.Scanner;
/*
class Tp
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no  : ");
        int n= sc.nextInt();
        int cpy= n;
        int rev= 0;
        while(n>0)
        {
            int temp= n%10;
            rev= (rev*10)+ temp;
            n=n/10;
        }
        if(rev==cpy)
        {
            System.out.println("No is Palindrome no ");
        }
        else
            System.out.println("No is NOT a Palindrome no ");
    }

}
*/

/*
class tp2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a String  : ");
        String s1= sc.nextLine();
        String rev= "";
        for(int i=0; i<s1.length(); i++)
        {

            rev= s1.charAt(i)+ rev;

        }
        if((s1.toUpperCase()).equals(rev.toUpperCase()))
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");

    }

}
*/
/*
class fibo
{
    public static void main(String args[])
    {
         Scanner sc= new Scanner(System.in);

         System.out.println("Enter How many Elements u want  : ");
         int n= sc.nextInt();

        int n1=0;
        int n2=1;
        for(int i=0; i<n; i++)
        { 
            System.out.println(n1+ " ");
            int temp= n2;
            n2=n1+n2;
            n1= temp;

         }
 
    }

}
*/

/*
class Parent
{
               
    demo()
    {
         System.out.println("In the Constr ");

    }

    void print()
    {
         System.out.println("In the print ");
    }


}


class Child extends demo{

    Child()
    {
        System.out.println(super(this.getClass()));
    }

    public static void main(String args[])
    {
         System.out.println("Main method");

        Child ch1= new Child();

        demo.print();
    }
}
*/

import java.util.*;

class Student implements Comparable<Student>	//Interface Comparable<T>
{
	int roll;
	int marks;
	int age;

	Student()
	{
	}

	Student(int roll, int marks, int age)
	{
		this.roll = roll;
		this.marks = marks;
		this.age = age;
	}

	public String toString()
	{
		//Student[roll = 1, marks = 75, age = 21]
		String str = "Student[roll = " + roll + ", marks = " + marks + ", age = "+age+ "]";
	       	return str;	
	}

	public int hashCode()
	{
		return (roll*marks*age);  // return roll+marks+age;  (1, 50, 20) => 71; (2,48,21) => 71
	}

	//public boolean equals(Student ob)
	public boolean equals(Object ob)
	{
		Student s = (Student)ob;
		if(ob == null) return false;
		if(this.roll == s.roll && this.marks == s.marks && this.age == s.age)
			return true;
		else
			return false;
	}

	public int compareTo(Student s)		//roll based comparision.
	{
		if(this.roll == s.roll)
			return 0;
		if(this.roll < s.roll)
			return -1;
		if(this.roll > s.roll)
			return 1;

		return 0;
	}

}

//Interface Comparator<T>
class StudentAgeComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.age <  s2.age)
			return -1;
		else if(s1.age > s2.age)
			return 1;
		else
			return 0;

	}
}


class StudentMarksComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.marks <  s2.marks)
			return -1;
		else if(s1.marks > s2.marks)
			return 1;
		else
			return 0;

	}

}


class ArrayListForUserDefinedObjects
{
	static void display(Collection<?> c)
	{
		if(c == null) return;
		for(Object ob : c)
		{
			System.out.println(ob);
		}
	}

	public static void main(String args[])
	{
		
		List<Student> list1 = new ArrayList<Student>();

		Student s1 = new Student(1,75,21);
		list1.add(s1);

		//add() : method
		list1.add(new Student(2,65,19));
		list1.add(new Student(3,87,20));
		list1.add(new Student(4,48,23));
		list1.add(new Student(5,57,22));

		System.out.println("List1 after adding 5 students:");
		display(list1);


		//Collections.sort() : method
		Collections.sort(list1); //If we don't pass comparator object then Student class own compareTo() method will be used.
		System.out.println("After sorting List1 elements:");
		display(list1);

		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("After sorting List1 elements in reverse order:");
		display(list1);

		StudentAgeComparator ageComp = new StudentAgeComparator();
		Collections.sort(list1, ageComp);
		System.out.println("After sorting List1 elements on age :");
		display(list1);

		Collections.sort(list1, new StudentMarksComparator());
		System.out.println("After sorting List1 elements on marks :");
		display(list1);


	}
}
