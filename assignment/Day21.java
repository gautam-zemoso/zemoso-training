import java.util.*;
 
public class Day21{
     public static int getDigit(long num){

        return Long.toString(Math.abs(num)).length();
    }
 
    public static boolean check(long orig, long val1, long val2){
        if(Long.toString(val1).endsWith("0") && Long.toString(val2).endsWith("0")) return false;
 
        int origLen = getDigit(orig);
        if(getDigit(val1) != origLen / 2 || getDigit(val2) != origLen / 2) return false;
 
        byte[] firstByte = Long.toString(orig).getBytes();
        byte[] endByte = (Long.toString(val1) + Long.toString(val2)).getBytes();
        Arrays.sort(firstByte);
        Arrays.sort(endByte);
        return Arrays.equals(firstByte, endByte);
    }
 
    public static void main(String[] args){
        HashSet<Long> sol = new HashSet<Long>();
        for(long i = 10; sol.size() <= 25; i++ ){
            if((getDigit(i) % 2) != 0) {
                i = i * 10 - 1; 
                continue;
            }
            for(long val1 = 2; val1 <= Math.sqrt(i) + 1; val1++){
                if(i % val1 == 0){
                    long val2 = i / val1;
                    if(check(i, val1, val2) && val1 <= val2){
                        sol.add(i);
                        System.out.println(i + ": " + val1 + ", " + val2 );
                    }
                }
            }
        }
    }
}