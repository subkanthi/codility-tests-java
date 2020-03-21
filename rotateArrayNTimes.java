class Main {

// 1 2 3 4 5
// 5 1 2 3 4
// Store 5 in temp
// 
  public static void rotateArrayInPlace(int[] array) {
    // Store the last element of the array.
    int lastElement = array[array.length - 1];
    for(int i = array.length - 1; i > 0; i--) {
      array[i] = array[i - 1];
    }
    array[0] = lastElement;
  }

  public static void main(String[] args) {
   
    int arrayBeforeReversing[] = new int[5];
    arrayBeforeReversing[0] = 1;
    arrayBeforeReversing[1] = 2;
    arrayBeforeReversing[2] = 3;
    arrayBeforeReversing[3] = 4;
    arrayBeforeReversing[4] = 5;

    for(int i = 0; i < 3; i++) {
      rotateArrayInPlace(arrayBeforeReversing);
    }

    for(int i = 0; i < arrayBeforeReversing.length; i++) {
      System.out.println(arrayBeforeReversing[i]);
    }
  }
}
