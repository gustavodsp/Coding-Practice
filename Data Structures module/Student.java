public class Student implements Comparable<Student>{

    String name;
    int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "Student{ name="+name+", age="+age+" }";
    }

    public int compareTo(Student st){
        if(age==st.age){
            return 0;
        }
        else if(age>st.age){
            return 1;
        }
        else{
            return -1;
        }
    }

}