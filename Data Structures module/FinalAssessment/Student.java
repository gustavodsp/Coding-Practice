//Creating a new class for a Student with attributes required

public class Student implements Comparable<Student>{ //implementing the Comparable interface to guarantee the object are comparable

    String name;
    int age;
    int studentNumber;
    LinkedList academicRecord;

    public Student(String name, int age, int studentNumber, LinkedList academicRecord){
        this.name=name;
        this.age=age;
        this.studentNumber=studentNumber;
        this.academicRecord=academicRecord;
    }

    public String toString(){
        return "{ Name="+name+", Age="+age+" Student Number="+studentNumber+", Academic Record="+academicRecord+" }";
    }

    public int compareTo(Student st){ //CompareTo method necessary from Comparable interface
        //Using the average of the academic records to set up a comparrison
        if(academicRecord.getAverage()==st.academicRecord.getAverage()){ 
            return 0;
        }
        else if(academicRecord.getAverage()>st.academicRecord.getAverage()){ 
            return 1;
        }
        else{
            return -1;
        }
    }

}