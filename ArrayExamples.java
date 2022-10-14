

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] tempArray = new int[arr.length];
    int count = 0;
    for(int i = arr.length - 1; i > -1; i = i -1) {
      tempArray[count] = arr[i];
      count++;
    }
    for(int j = 0; j<tempArray.length; j++){
      arr[j] = tempArray[j];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    int count = 0;
    for(int i = arr.length - 1; i > -1; i = i -1) {
      newArray[count] = arr[i];
      count++;
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length==0||arr.length==1){
      return 0;
    }
    else{
      double sum = 0;
      double currlowest = arr[0];
      for (int i =0; i < arr.length; i++){
        if(arr[i]<currlowest){
          currlowest = arr[i];
        }
      }
      for (int j = 0; j < arr.length; j++){
        sum = sum + arr[j];
      }
      sum = sum - currlowest;
      sum = sum/(arr.length-1);
      return sum;
    }
  }
}

