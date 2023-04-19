class Main {
  public static void main(String[] args) {
    int wysokosc = 5;
    for(int i = 0; i < wysokosc; i++){
      for(int j = 0; j < i; j++){
        System.out.print(" ");
      }
      for(int k = 0; k < wysokosc - i; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}