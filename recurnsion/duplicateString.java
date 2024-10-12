public class duplicateString {
    public static void Duplicate(String str,int idx,StringBuilder newstr,boolean map[]){
         if(idx==str.length()){
            System.out.println(newstr);
            return;
         }
         char currChar = str.charAt(idx) ;
         if(map[currChar-'a']==true){
            Duplicate(str,idx+1,newstr,map);

         }else{
            map[currChar-'a']=true;
            Duplicate(str,idx+1,newstr.append(currChar),map);
         }
    }
    public static void main(String[]args){
        String str = "apnacollege";
        Duplicate(str,0,new StringBuilder(""),new boolean [26]);
    }
}
