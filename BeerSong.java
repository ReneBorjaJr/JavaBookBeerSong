package PG14TXT;

class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle"; // Update word to singular before the next print.
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                // Correctly resets the word to "bottles" for the final print
                System.out.println("No more bottles of beer on the wall");
            } // end else
        } // end while loop
    } // end main method
} // end class





