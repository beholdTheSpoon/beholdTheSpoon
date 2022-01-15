public class Exercici5 {
    public static void main(String[] args) {
        int[] resultat = ordena(4,8,3);
        for(int i = 0; i<resultat.length; i++) {
            System.out.print(resultat[i] + " ");
        }
    }

    static int[] ordena(int x, int y, int z) {
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
        return nums; 
    }
}
