import java.util.ArrayList;
public class StringOperations{
    public ArrayList<String> stringOperations(String s1, String s2){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder result1 = new StringBuilder();
        for (int i = 0;i < s1.length();i++){
            if (i % 2 == 0)
                result1.append(s2);
            else
                result1.append(s1.charAt(i));
        }
        list.add(result1.toString());
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);
        if (first != last){
            String reverse = new StringBuilder(s2).reverse().toString();
            String result2 = s1.substring(0, last) + reverse
                    + s1.substring(last + s2.length());
            list.add(result2);
        } else{
            list.add(s1 + s2);
        }
        if (first != last){
            String result3 = s1.replaceFirst(s2, "");
            list.add(result3);
        } else{
            list.add(s1);
        }
        int mid;
        if (s2.length() % 2 == 0)
            mid = s2.length()/2;
        else
            mid = (s2.length()/2) + 1;
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);
        String result4 = firstHalf + s1 + secondHalf;
        list.add(result4);
        StringBuilder result5 = new StringBuilder();
        for (int i = 0;i < s1.length();i++) {
            if (s2.indexOf(s1.charAt(i)) != -1)
                result5.append("*");
            else
                result5.append(s1.charAt(i));
        }
        list.add(result5.toString());
        return list;
    }
}