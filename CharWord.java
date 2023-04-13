class CharWord {
 
  public static void main(String args[]) {
 
    String str = "hi hello welcome to bitLabs";
 
      String words[]=str.split(" ");
 
    for(int i=0;i<words.length;i++){
      System.out.println(words[i]+" :  "+words[i].length());
    }
 
  }
}
 