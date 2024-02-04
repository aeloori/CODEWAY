public class User {
    // ! the arrays are cannot be changed dynamically
    final static int[] cardNo={345,346,348,349,356,3213,325}; // * for the card number of the user 

    static int[] accountBal={121345,3265564,23134852,234856,23454512,545212,48642};// * for the amount in the account of the perticular card holders

    static int[] pin={345,346,348,349,356,3213,325}; // * pin is the password for the users card



    public static int search(int[] arry, int key){
        int index=0;
        for(int i =0;i<arry.length;i++){
            if(arry[i]==key){
                index=i;
                System.out.println("\n card found at index: "+index+"\n");
                break;
            }
            else{
                index=-2;
            }
        }
        return index;
    }


}
