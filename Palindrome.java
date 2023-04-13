class Palindrome{
  public static void main (String args[]){
    String str="madam";
    String str1="";
      for(int j=str.length()-1;j>=0;j--){
        str1=str1+str.charAt(j);
      }
    System.out.println("reverse of string is  "+str1);
    if(str1.equals(str)){
      System.out.println("given string is palindrome");
    }
    else{
      System.out.println("given string is  not palindrome");
    }
  }
}