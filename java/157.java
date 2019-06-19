/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */
public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        // List<Character> list = new ArrayList();
        char[] buf4 = new char[4];
        int j = 0;
        while(true){
            int l = read4(buf4);            
            for(int i = 0;i < l && j < n;i++){
                buf[j++] = buf4[i];
            }
            if(l == 0){
                break;
            }
        }
        return j;
    }
}