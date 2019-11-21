package main;


public class BalancedBrackets {
  /**
   * The function BalancedBrackets should return true if and only if
   * the input string has a set of "balanced" brackets.
   *
   * That is, whether it consists entirely of pairs of opening/closing
   * brackets (in that order), none of which mis-nest. We consider a bracket
   * to be square-brackets: [ or ].
   *
   * The string may contain non-bracket characters as well.
   *
   * These strings have balanced brackets:
   *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
   *
   * While these do not:
   *   "[LaunchCode", "Launch]Code[", "[", "]["
   *
   * @param str - to be validated
   * @return true if balanced, false otherwise
   */
  public static boolean hasBalancedBrackets(String str) {
    int brackets = 0;
    for (char ch : str.toCharArray()) {
      while (brackets >= 0 && brackets <=1) {
        if (ch == '[') {
          brackets++;
          break;
        } else if (ch == ']') {
          brackets--;
          break;
        }
      }
    }
    return brackets == 0;
  }
}
