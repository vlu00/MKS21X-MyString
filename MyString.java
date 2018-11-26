public class MyString implements CharSequence {
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
}
