public class Main {
    public static void main(String[] args) {

        try {
            int array[] = {2, 4, 9, -6};
            System.out.println("THE SMALLEST NUMBER:" + getSmallPositive(array));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static int getSmallPositive(int[] array) {throw RuntimeException
        int min = array[0];
          for(int i=0;i< array.length;i++) {
              if (array[i]<0){
                  throw new RuntimeException("ERROR");
              } else {
                  if (array[i]<min){
                      min=array[i];
                  }
                  }
              } return min;
          }


    }




