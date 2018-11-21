public class MyString implements CharSequence {
  private char[] data;
  public MyString (CharSequence s) {
    data = new char (s.length());
  }

  public charAt(int index) {\
    return data[index];
  }

  public length() {

  }

  public subSequence(int start, int end) {

  }

  public toString() {

  }
}
