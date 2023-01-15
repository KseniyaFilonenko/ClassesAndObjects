package by.teachmeskills.employeestask;

public class Director implements Employee {
    String post;

    public Director(String post){
        this.post = post;
    }
    @Override
    public void printJobTitle() {
        System.out.printf("The following post is: ", post);
    }
}
