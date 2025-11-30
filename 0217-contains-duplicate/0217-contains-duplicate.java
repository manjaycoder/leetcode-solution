class Solution {
    public boolean containsDuplicate(int[] nums) {
    //Create a HashSet to store element from the array
    HashSet<Integer>seenNumbers=new HashSet<>();
    //Iterate through each elemtn in the array
    for(int num:nums){
        //check if the element is already is the hashset
        if(seenNumbers.contains(num)){
            return true;//duplicate found
        }
        //add the element to the hashset
        seenNumbers.add(num);
    }
    return false;//No element found
    }
}