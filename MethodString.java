class MethodString {
  public static void main(String args[]) {
 
    String str = "Hi Hello, welcome to bitLabs";
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Lowercase: " + str.toLowerCase());
    System.out.println("no.of characters: " + 
       str.length());
    System.out.println(str.substring(4));
    System.out.println(str.substring(4, 11)); 
 
  }
}