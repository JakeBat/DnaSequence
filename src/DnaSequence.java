public class DnaSequence {

  public static void main(String[] args) {
    System.out.println(complement("ATATGCGC"));
    System.out.println(complement("GCCTTTAAAATTTCCG"));
    System.out.println(complement("ATCGATCG"));
    System.out.println(complement("CCCCGGGTTA"));
  }

  private static String complement(String input) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      switch (Character.toString(input.toUpperCase().charAt(i))) {
        case("A"):
          sb.append("T");
          break;
        case("T"):
          sb.append("A");
          break;
        case("G"):
          sb.append("C");
          break;
        case("C"):
          sb.append("G");
          break;
      }
    }
    return sb.toString();
  }
}
