public class Str2Int {
    public int StrToInt(String str) {
        int len = str.length();
        boolean moreThan0 = true;
        int num=0;
        for (int i=0;i<len;i++){
            char c = str.charAt(i);
            if(i==0){
                if (c == '+'){
                    continue;
                } else if(c == '-'){
                    moreThan0 = false;
                    continue;
                } 
            }
            if (c<48||c>57){
                return 0;
            } else {
                num = num*10 + (c-48);
            }
        }
        return moreThan0?num:-num;
    }
}