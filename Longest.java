class Longest{
  public static void main(String args[]) {
    String str = "hi hello 123 ^&&3 welcome";
    String words[] = str.split(" ");
    int longest = words[0].length();
    String longestword = words[0];
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (longest < words[j].length()) {
          longest = words[j].length();
          longestword = words[j];
        }
      }
    }
    System.out.println(longestword);
  }
}