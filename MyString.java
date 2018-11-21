public class MyString implements CharSequence {
  private char[] data;
  public MyString (CharSequence s) {
    data = new char [s.length()];
  }

//needs to throw indexoutofboundsexception
  public char charAt(int index) {
    return data[index];
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    CharSequence sub = new CharSequence(end-start);
    for (start < end; start++) {

    }
  }

  public String toString() {

  }
}
