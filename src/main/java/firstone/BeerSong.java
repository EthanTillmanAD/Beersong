package firstone;

public class BeerSong {

    public static void main(String[] args) {

        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){




            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("pass it around.");
            beerNum = beerNum - 1 ;
            if (beerNum == 1){
                word = "bottle";
//                  The if (beerNum == 1) must come after the beerNum = beerNum - 1 or else
//                    it'll pull the if statement first to check if true once it sees false
//                    itll run through until it hits the beerNum - 1
//                    and correct adding the if below beerNum - 1 itll check the if first
//                   then continue the while loop, fixing the syntax error
//
//


            }

            if (beerNum > 0){

                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else System.out.println("No more bottle of beer on the wall");
        }


    }
}
