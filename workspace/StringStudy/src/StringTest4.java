
public class StringTest4 {

   public static void main(String[] args) {

      String originStr = "dog, cat, bird, bear";

      // split을 사용하지 않고 dog, cat, bird, bear의 단어를 변수에 저장 및 출력하시오

      String findWordCh = ",";   // 구분자

      int startPositionNum = 0; //  문자열 시작 위치
      int wordBreakIndex = 0; // 구분자
      wordBreakIndex = originStr.indexOf(findWordCh);

      System.out.println(wordBreakIndex);

      String dog = originStr.substring(startPositionNum, wordBreakIndex);

//      String bird = originStr.substring(10, 14);
//      String bear = originStr.substring(16, 20);

      System.out.println(dog);

      startPositionNum = wordBreakIndex + 2;

      wordBreakIndex = originStr.indexOf(findWordCh, wordBreakIndex + 1);

      System.out.println(wordBreakIndex);

      String cat = originStr.substring(startPositionNum, wordBreakIndex);

      System.out.println(cat);

      //-------------------------------------
      startPositionNum = wordBreakIndex + 2;

      wordBreakIndex = originStr.indexOf(findWordCh, wordBreakIndex + 1);

      System.out.println(wordBreakIndex);

      String bird = originStr.substring(startPositionNum, wordBreakIndex);

      System.out.println(bird);

      
      startPositionNum = wordBreakIndex + 2;

//      wordBreakIndex = originStr.indexOf(findWordCh, wordBreakIndex + 1);

//      System.out.println(wordBreakIndex);

      String bear = originStr.substring(startPositionNum);

      System.out.println(bear);

//      System.out.println("dog");
//      System.out.println("cat");
//      System.out.println("bird");
//      System.out.println("bear");

      // 2019/02/22

   }

}