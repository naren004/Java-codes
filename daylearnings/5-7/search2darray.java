public class search2darray {
    public static void main(String[] args) {
        int[][] arr ={
            {18,9,12},
            {36,-4,91},
            {44,33,16}
        };
       // boolean found = false;
        int target = 16;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    //found = true;
                    System.out.println(target +" element contains in "+i+","+j);
                }
            }
        }
        
        if(true){
            System.out.println("not found");
        }
    }
}