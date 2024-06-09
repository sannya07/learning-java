public class Conditional {
    public static void main(String[] args){
        // syntax of if statement
        // if(boolean T or F){
        //     body
        // }else{
        //     do this
        // }

        // we can do else if as well
        int salary= 254000;
        if(salary>10000){
            salary=salary+5000;
        }
        else{
            salary=salary+200;
        }
        System.out.println(salary);
    }
}
