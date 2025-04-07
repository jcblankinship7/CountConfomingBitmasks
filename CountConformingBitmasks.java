public class Main {

  public static int solution(int A, int B, int C) {
      int total = 0;
      String binaryA = Integer.toBinaryString(A);
      String binaryB = Integer.toBinaryString(B);
      String binaryC = Integer.toBinaryString(C);
      
      total = conformingCount(binaryA)+conformingCount(binaryB)+conformingCount(binaryC);
      total -=conformingCount(Integer.toBinaryString(A|B));
      total -=conformingCount(Integer.toBinaryString(A|C));
      total -=conformingCount(Integer.toBinaryString(B|C));
      total +=conformingCount(Integer.toBinaryString(A|B|C));
      return total;
  }
  
  private static int conformingCount(String number){
    int counter=0;
    for (int i = 0; i < number.length(); i++) {
      if(number.charAt(i)=='0'){
        counter++;
      }
    }

    counter+=30-number.length();
    return (int)Math.pow(2, counter);
  }
      
  public static void main(String[] args) {
  	int A = 1073741727;
    int B = 1073741631;
    int C = 1073741679;
    int result = solution(A, B, C);
		
	System.out.println(result);
  }
}
