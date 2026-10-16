import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter Product Name :");
//        String ProductName = input.next();
//        System.out.println("Enter price :");
//        double Price = input.nextDouble();
//        System.out.println("Enter Quantity :");
//        int QuantityOrdered = input.nas
//        System.out.println("Enter is it in Stock ! :");
//        boolean InStock= input.nextBoolean();
//        double Totalprice = Price * QuantityOrdered;
//
//        System.out.println("the Product Name is : " + ProductName + " the price is : " + Price + " The Quantity  ordered is " +
//                QuantityOrdered + " the  quanttity is in stock ? " + InStock + " Total price is : "+Totalprice);


        Scanner input= new Scanner(System.in);
         System.out.println("Enter Product grade :");
     //  int grade = input.nextInt();
/*
        if(grade>=90){
            System.out.println("Excellent");
        }else if(grade >= 75){
            System.out.println("Good");
        }else if(grade >= 60){
            System.out.println("pass");
        }else {
            System.out.println("Fail");
//        } */
//        int grade = input.nextInt();
////     switch (grade){
////         case Integer  n when grade>=90 ->
////             System.out.println("Excelent");
////         default ->
////                 System.out.println("fail");
////     }

        for(int i=1; i<31 ;i++){
            if(i%3 ==0 && i%5==0) {
                System.out.println(i+" is BothTools");
            }else if(i%3==0){
                System.out.println(i+" is Selenium");
            }else if(i%5==0){
                System.out.println(i+" is playwrite");
            }
        }



    }
}