public class Roman {
    public String intToRoman(int num){
        StringBuilder roman=new StringBuilder();
        String notations[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<notations.length;i++){
            while (num>=value[i]){
                roman.append(notations[i]);
                num-=value[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        Roman romanConverter = new Roman();
        String result = romanConverter.intToRoman(500);
        System.out.println(result); // This will print "I"
    }
}
