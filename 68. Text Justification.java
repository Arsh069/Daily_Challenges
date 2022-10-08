import java.util.*;
class TextJustification{
    
    static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int size = words.length;
        int index = 0;
        
        while (index < size){
            int totalChars = words[index].length();
            int lastIndex = index + 1;
            int gaps = 0;
            
            while (lastIndex < size){
                if (totalChars + 1 + words[lastIndex].length() > maxWidth){
                    break;
                }
                totalChars += 1 + words[lastIndex++].length();
                gaps++;
            }
            
            StringBuilder sb = new StringBuilder();
            
            if (lastIndex == size || gaps == 0){
                for (int i = index; i < lastIndex; ++i){
                    sb.append(words[i]).append(' ');
                }
                sb.deleteCharAt(sb.length() - 1);
                while (sb.length() < maxWidth){
                    sb.append(' ');
                }
            } 
            
            else {
                int spaces = (maxWidth - totalChars) / gaps;
                int restSpaces = (maxWidth - totalChars) % gaps;
                for (int i = index; i < lastIndex - 1; ++i){
                    sb.append(words[i]).append(' ');
                    for (int j = 0; j < spaces + (i - index < restSpaces ? 1 : 0); ++j){
                        sb.append(' ');
                    }
                }
                sb.append(words[lastIndex - 1]);
            }
            
            res.add(sb.toString());
            index = lastIndex;
        }
        return res;
    }
  
  public static void main (String[] args){
      
      String[] words = {"TutorialCup", "is", "the", "best", "portal", "for", "programming."};
      int size = 12;
      
      List<String> res = new ArrayList<String>();
      res = fullJustify(words, size);
      ListIterator<String> lItr = res.listIterator();
      
      while (lItr.hasNext()){
          System.out.println(lItr.next());
      }
  }
}