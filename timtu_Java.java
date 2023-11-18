class MaxNMinLength {
    public static void main(String[] args) {
        String input ="co thanh lap trinh do";
        String[] arr = input.split(" "); 
        String max = arr[0], min=arr[arr.length - 1]; 
        int maxc = arr[0].length();  
        int minc = arr[arr.length - 1].length(); 
        int lengthArr = arr.length;
        
        for (int i = 1; i < lengthArr; i++)
        {
            String currentItem = arr[i];
             
          
            if (currentItem.length() < minc){
                minc = currentItem.length(); 
                min = currentItem;
            }
            
         
            if (currentItem.length() > maxc){
                maxc = currentItem.length();
                max = currentItem;
            }
        }
        System.out.println(min);
        System.out.println(max );
    }
}
