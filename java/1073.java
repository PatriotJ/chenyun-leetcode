class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        if(arr1.length < arr2.length){
            return addNegabinary(arr2,arr1);
        }
        int i = arr1.length-1,j = arr2.length-1,carry = 0;
        LinkedList<Integer> list = new LinkedList();
        while(j >= 0){
            int k = arr2[j--] + arr1[i--] + carry;
            if(k == 0){
                list.add(0);
                carry = 0;
            }else if(k == 1){
                list.add(1);
                carry = 0;
            }else if(k == 2){
                list.add(0);
                carry = -1;
            }else if(k == -1){
                list.add(1);
                carry = 1;
            }else{
                list.add(1);
                carry = -1;
            }
        }
        while(i >= 0){
            int k = arr1[i--] + carry;
            if(k == 0){
                list.add(0);
                carry = 0;
            }else if(k == 1){
                list.add(1);
                carry = 0;
            }else if(k == 2){
                list.add(0);
                carry = -1;
            }else if(k == -1){
                list.add(1);
                carry = 1;
            }
        }
        if(carry == 1){
            list.add(1);
        }
        if(carry == -1){
            list.add(1);list.add(1);
        }
        int l = list.size()-1;
        while(l >= 0 && list.get(l) == 0){
            list.pollLast();
            l --;
        }
        if(l < 0){
            return new int[1];
        }
        int[] ans = new int[l+1];
        for(int k = 0;k < l+1;k++){
            ans[k] = list.get(l-k);
        }
        return ans;
        
    }
}