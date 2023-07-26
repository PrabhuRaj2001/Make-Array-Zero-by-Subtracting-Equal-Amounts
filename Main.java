class Solution {
    public int minimumOperations(int[] a) {
        

         Set<Integer> st = new HashSet<>();
			      for(int i:a)
			        if(i>0)
			          st.add(i);
			   
			  return st.size();
    }
}