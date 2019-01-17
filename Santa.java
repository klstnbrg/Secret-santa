/*
 * Program takes in names as arguments
 * and randomly matches them up with other names,
 * never matching someone's name with themselves
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Objects;

// class only contains a method shuffleList and the main methodd

class Santa {

/*
 * shuffleList is used in main method to shuffle arguments
 * @param String[] array
 * @return list
 */
  public static List shuffleList(String[] array) {
    List<String> arrayList = new ArrayList<String>(Arrays.asList(array));
    Collections.shuffle(arrayList);
    List shuffle = arrayList;
    return shuffle;
  }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
      List list;
      Object[] randOrder = null;
      String[] randString = new String[args.length];

      for(int i=0; i<args.length; i++) {
        //converting List to Object[] and then to String[]
        list = shuffleList(args);
        randOrder = list.toArray(new String[args.length]);
        for (int k=0; k<args.length; k++) {
          randString[k] = randOrder[k].toString();
        }

        //checking if any names choose themselves and resetting if true
        for (int h=0; h<args.length; h++) {
          if (args[h].equals(randString[h])) {
            i = 0;
        }
      }
    }
      for(int j=0; j<args.length; j++) {
        System.out.println(args[j] + " gives to " + randString[j]);
    }
  }
}

/* issue is a "variable is already defined in method main(String[])",
but I am not redefining, just reassigning */
