
import java.util.*;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> keyToAnagrams = new HashMap<>();
  
      for (final String str : strs) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String key = String.valueOf(chars);
        keyToAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
      }
  
      return new ArrayList<>(keyToAnagrams.values());
    }
  }