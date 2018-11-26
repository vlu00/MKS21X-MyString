public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString (CharSequence s) {
    data = new char [s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    if (index < 0 || index > data.length) {
      throw new IndexOutOfBoundsException("Invalid index");
    }
    else {
      return data[index];
    }
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    String s = "";
    if (start < 0 || end < 0 || start > end || end > data.length) {
      throw new IndexOutOfBoundsException("Invalid index");
    }
    else {
      for (; end - start != 0; start++ ) {
        s = s + charAt(start);
      }
      return s;
    }
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < data.length; i++) {
      s = s + charAt(i);
    }
    return s;
  }

  public int compareTo(CharSequence s) {
    if (s == null) {
      throw new NullPointerException();
    }
    if (this.length() != 0 && s.length() == 0) {
      return 1;
    }
    if (this.length() == 0 && s.length() != 0) {
      return 1;
    }
    else {
      int c = 0;
      for (int i = 0; i < this.length() && i < s.length(); i++) {
        if (this.charAt(i) != s.charAt(i)) {
          if (this.charAt(0) > s.charAt(0)) {
            return 1;
          }
          else {
            return -1;
          }
        }
      }
      return c;
    }
  }
}
