public class MyString implements CharSequence {
  private char[] data;
  public MyString (CharSequence s) {
    data = new char [s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

//needs to throw indexoutofboundsexception
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
    return toString();
    //CharSequence sub = new CharSequence();
    //for (; start < end; start++) {

    //}
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < data.length; i++) {
      s = s + charAt(i);
    }
    return s;
  }
}
