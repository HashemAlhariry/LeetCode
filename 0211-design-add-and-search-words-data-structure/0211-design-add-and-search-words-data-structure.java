class WordDictionary {
Map<Integer, List<String>> map = new HashMap<>();
public void addWord(String word) {
    int index = word.length();
	if (!map.containsKey(index)) {
	    List<String> list = new ArrayList<>();
	    list.add(word);
		map.put(index, list);
	} else {
		map.get(index).add(word);
	}
}


public boolean search(String word) {
  int index = word.length();
  if (!map.containsKey(index)) {
      return false;
  }
  
  List<String> list = map.get(index);
  for(String s : list) { 
      if(isSame(s, word)) { 
          return true;
      }
  }
  return false;
}

public boolean isSame(String s, String word) {  
    for (int i = 0; i < s.length(); i++) {
        if (word.charAt(i) != '.' && s.charAt(i) != word.charAt(i)) {
            return false;
        }
    }
    return true;
}
}
