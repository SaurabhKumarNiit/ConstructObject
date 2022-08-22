
   public class ConstructorDemo {

        String Title;
        int YearOfPublishing;
        long ISBN;           //International Standard Book Number
        String AuthorName;

        public static void main(String[] args){
            ConstructorDemo obj=new ConstructorDemo();
            System.out.println("object Title "+obj.Title);
            System.out.println("obj Author Name "+obj.AuthorName);
            System.out.println(" obj year of publishing"+obj.YearOfPublishing);
            System.out.println("obj.ISBN = " + obj.ISBN);

            obj.Title="Complete reference 12th Edition";
            obj.AuthorName="Herbert";
            obj.ISBN=2369857548582L;
            obj.YearOfPublishing=2021;

            System.out.println("object Title "+obj.Title);
            System.out.println("obj Author Name "+obj.AuthorName);
            System.out.println(" obj year of publishing "+obj.YearOfPublishing);
            System.out.println("obj.ISBN = " + obj.ISBN);



        }
    }


