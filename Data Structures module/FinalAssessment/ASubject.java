//Creating a new class for an Academic Subject with its name and its grade

public class ASubject{

    String subject;
    double grade;

    public ASubject(String subject, double grade) {
        this.subject=subject;
        this.grade=grade;
    }

    //toString method to generate the element on print in LinkedList implementation
    public String toString(){
        return "{ Academic Subject="+subject+" - Grade="+grade+" }";
    }
    
}