package by.teachmeskills.employeestask;

public class Worker implements Employee{
    String post;

    public Worker(String post){
        this.post = post;
    }
    @Override
    public void printJobTitle() {
        System.out.printf("The following post is: ", post);
    }
}
