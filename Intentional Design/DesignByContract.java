public class DesignByContract {
    
        //preconditions allow us to shift the responsibility to the client
        //in the absence of preconditions, implementers will have to do error checking
        //make sure to add preconditions (like if day>0 && day<=31 then set day)
        //so that its not your fault if the code goes wrong in another way

        //binary search preconditions:
        //the array it is running on is sorted

        //the precondition automatically checks and enforces itself by checking the value of the parameter returning an error if the parameter is invalid
        //false
        //its not automatically checking or enforcing anything, we can ensure its already correct by making sure they pass in something right
        //the precondition is just a comment on what the input should be, adding checking makes it slow and adds more code
        //preconditions dont have to be met for the code to run technically

        //postcondition specifies what the code should do given VALID input
        //what will be TRUE after the code runs?

        //everything is placed into a module using encapsulation, given a specific role and purpose
        //implementer:
                //assume the precondition is true, responsible for postcondition

        //client:
                //responsible for the precondition, assume the postcondition is true

        //what happens if one party fails to deliver? usually the code breaks


        /**
         * Description 
         * @param
         * @return
         * 
         * @pre 
         * @post
         * 
         */

         /**
          * Returns the value from the array, arr, at the row and column specified by parameters. Returns a char.
          * @param aRow The row at which the value is being accessed
          * @param aCol The column at which the value is being accessed
          * @param arr The array from which the value is being accessed
          * @return The value at (row,col) in arr. A char. 
          */
         //public static char getValueAtArrayIndex(int aRow, int aCol, int[][] arr);
}
