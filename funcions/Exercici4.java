public class Exercici4 {
    public static void main(String[] args) {
        int min = min(23, 85, 17);
        int max = max(85, 23, 17);
        System.out.println(min + " " + max);
    }

    static int min(int x, int y, int z) {
        int[] nums = {x,y,z};
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int ultimValor = nums[i];
					nums[i] = nums[j];
					nums[j] = ultimValor;
				} 
			}
        }
        int resultat = nums[0];
        return resultat; 
    }
    
    static int max(int x, int y, int z) {
        int[] nums = {x,y,z};
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int ultimValor = nums[i];
					nums[i] = nums[j];
					nums[j] = ultimValor;
				} 
			}
        }
        int resultat = nums[nums.length-1];
        return resultat; 
    }
}


