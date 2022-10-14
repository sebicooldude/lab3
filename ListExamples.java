import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

public class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    for(int i = 0; i<list.size();i++) {
      if(sc.checkString(list.get(i))) {
        result.add(list.get(i));
      }
    }
    return result;
  }


  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    List<String> tempList = new ArrayList<>();
    for (int i = 0; i<list1.size(); i++){
      tempList.add(list1.get(i));
    }
    for (int i = 0; i<list2.size(); i++){
      tempList.add(list2.get(i));
    }
    int size = tempList.size();
    for (int j = 0; j<size; j++){
      String currentsmallest = tempList.get(0);
      for (int i = 0; i<tempList.size(); i++){
        if (currentsmallest.compareTo(tempList.get(i)) > 0){
          currentsmallest = tempList.get(i);
        }
      }
      result.add(currentsmallest);
      int count = 0;
      for(int m = 0; m < tempList.size(); m++){
        if (tempList.get(m).equals(currentsmallest)){
          tempList.remove(m);
        }
      }
    }
    return result;
      }

}