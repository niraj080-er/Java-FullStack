public class LinearSearch{
    public static int search(int numbers[], int key){     // search name ka ek function hai jo
        for(int i = 0; i<numbers.length; i++){ 
            if(numbers[i] == key){
            return i;  
            } 
        }
        return-1;
    }
    public static void main (String args[]){
        int numbers [] = {12, 13,14,15,16,17,18, 19, 20};
        int key = 44;

        int index = search(numbers, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index:" +index);
        }
    }
}
