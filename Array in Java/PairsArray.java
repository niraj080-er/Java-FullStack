public class PairsArray {

    public static void printpairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");

            }
            System.out.println();


        }
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,88,90,12,44,67,88,99,90,65,77,88,33,56,67,888,654,769,908,453,654,123,3435,567,8564,8795674,85,97,74,7454,96856,75379};
        printpairs(numbers);
    
    }
}


// public class PairsArray {

//     public static void printpairs(int numbers[]){
//         int tp=0;
//         for(int i=0; i<numbers.length; i++){
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("("+curr+","+numbers[j]+") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs=" + tp);
//     }

//     public static void main(String[] args) {
//         int numbers [] = {2,4,6,8,10,88,90,12,44,67,88,99,90,65,77,88,33,56,67,888,654,769,908,453,654,123,3435,567,8564,8795674,85,97,74,7454,96856,75379};
//         printpairs(numbers);
//     }
// }

