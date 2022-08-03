
//First ex

//public class ex4 {
   // public static void main(String[] args){
     //   int [] arra= {3,4,5,8,9,7,2,1};
        //try{
         //   System.out.println(arra[9]);
       // }catch (ArrayIndexOutOfBoundsException e){
          //  System.out.println(e.getMessage());

       // }




   // }
//}


//ex2

///public class ex4 {


   // public static void getNumber(int number) {
     //   if (number % 5 != 0)
       //     throw new ArithmeticException("Number Is Not Divided By 5");

 //   }

    //public static void main(String[] args) {

      //  try {
        //    getNumber(4);
      //  }
        //catch (Exception ex)
        //{
          //  System.out.println(ex.getMessage());
     //   }


   // }

//}


 class Author {

    private String name;
    private String email;
    public Author(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + "  at " + email;
    }

    }






