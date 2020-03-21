class Main {

  public static int returnNonPairedElement(int[] array) {
    int result = 0;

    for(int i = 0; i < array.length; i++) {
      result ^= array[i];
      System.out.println(result);
    }

    return result;
  }

  public static void main(String[] args) {
   
    int arrayBeforeReversing[] = new int[5];
    arrayBeforeReversing[0] = 1;
    arrayBeforeReversing[1] = 2;
    arrayBeforeReversing[2] = 3;
    arrayBeforeReversing[3] = 1;
    arrayBeforeReversing[4] = 2;

    int nonPairedElement = returnNonPairedElement(arrayBeforeReversing);

    System.out.println("Non paired element" + nonPairedElement);
  }
}
