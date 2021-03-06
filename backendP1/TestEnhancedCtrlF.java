
public class TestEnhancedCtrlF {
  
  //Basic test to check if the hash table works correctly
  public static boolean testHashTable() {
    DataWrangler1<String, Integer> data = new DataWrangler1("This is a test for our advanced control f function."
        + "There will be many tests, including a test of the print function, a test of the chaining, and an"
        + "overall test of the Hash Table.");
    data.countUniqueWords();
    Backend1 test = new Backend1(data);
//    data.printHashNodeList();
    System.out.println(test.search("test"));
    if(test.search("test") == 4) {
        return true;
    }
    else {
      return false;
    }  
  }
  
  //Test to check if after the hash table has been made, adding a word to the hash table works, and 
  //adds another count to that word
  public static boolean testInput() {
    DataWrangler1<String,Integer> data = new DataWrangler1("This is a test for our advanced control f function."
        + "There will be many tests, including a test of the print function, a test of the chaining, and an"
        + "overall test of the Hash Table.");
    Backend1 test = new Backend1(data);
    if(test.search("test") == 4) {
      test.input("test");
      if(test.search("test") == 5){
        return true;
      }
      else {
        return false;
      }
    }
    else {
      return false;
    }  
  }
  
  //Tests to see if a search of the hashtable without the word that is being searched runs correctly
  public static boolean testSearchNoWord() {
    DataWrangler1<String,Integer> data = new DataWrangler1("This is a test for our advanced control f function."
        + "There will be many tests, including a test of the print function, a test of the chaining, and an"
        + "overall test of the Hash Table.");
    Backend1 test = new Backend1(data);
    if(test.search("lemons")==0) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    if(testHashTable()) {
      System.out.println("Basic hash table test passed");
    }
    else {
      System.out.println("Basic hash table test failed");
    }
    if(testSearchNoWord()) {
      System.out.println("Null search test passed");
    }
    else {
      System.out.println("Null search test failed");
    }
  }
}
