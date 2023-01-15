package by.teachmeskills.employeestask;

public class Accountant implements Employee{
    String post;

    public Accountant(String post){
        this.post = post;
    }
    @Override
    public void printJobTitle() {
        System.out.printf("The following post is: ", post);
    }
}
