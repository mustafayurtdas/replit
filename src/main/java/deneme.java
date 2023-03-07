public class deneme {
     /*
    Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
Input :
String str=“Javaisalsoeasy”
Output: a s
     */

    public static void main(String[] args) {

        String str= "Javaisalsoeasy";

        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i,i+1);

            if(str.indexOf(ch)!=str.lastIndexOf(ch)){
                if (str2.toString().contains(ch)){
                    continue;
                }else{
                    str2.append(ch).append(" ");
                }
            }
        }
        System.out.println(str2);


    }
}
