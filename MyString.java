public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  //Creates a new char array with the same length as the given CharSequence
  //and adds values until all chars from s are added
  public MyString (CharSequence s) {
    data = new char [s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }
  //If index is not out of bounds, return the value at the index
  public char charAt(int index) {
    if (index < 0 || index > data.length) {
      throw new IndexOutOfBoundsException("Invalid index");
    }
    else {
      return data[index];
    }
  }
  //Return length of data
  public int length() {
    return data.length;
  }
  //Returns subset of MyString from start to end
  public CharSequence subSequence(int start, int end) {
    String s = "";
    if (start < 0 || end < 0 || start > end || end > data.length) { //checks if start and end values are valid
      throw new IndexOutOfBoundsException("Invalid index");
    }
    else {
      for (; end - start != 0; start++ ) { //Begin added chars from index start until index end
        s = s + charAt(start);
      }
      return s; //return resulting string
    }
  }
  //Converts MyString to string
  public String toString() {
    String s = "";
    for (int i = 0; i < data.length; i++) {
      s = s + charAt(i);
    }
    return s;
  }
  //Compares two CharSequences
  public int compareTo(CharSequence s) {
    if (s == null || this == null) { //checks if either CharSequence is null
      throw new NullPointerException();
    }
    else {
      for (int i = 0; i < this.length() && i < s.length(); i++) { //while both CharSequences have chars check
        if (this.charAt(i) != s.charAt(i)) { //If the two chars at a given index are different
          if (this.charAt(0) > s.charAt(0)) return 1; //First CharSequence is greater
          else return -1; //Second CharSequence is greater
        }
      }
      if (this.length() != 0 && s.length() == 0) { //If two CharSequences are the same until the end of one
        return 1; //but the first is longer, the first is greater
      }
      else if (this.length() == 0 && s.length() != 0) {
        return -1; //but the second is longer, the second is greater
      }
      else return 0; //The CharSequences are equal
    }
  }
}
