package day05_tasks;

public class Movie {

//            ------ Welcome to the Cinema ------
// Tonight we are streaming "$movieName" which was released on $releaseDate
// This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
// The rating is $rating and it runs for $duration hours.
// This is a sequel $isSequel and is on dvd $isOnDvd.


    public static void main(String[] args) {
         String name = "Barbie";
         String gender = "Live Action";
         byte duration = 2;
         String realeaseDate = "07/09/2023";
         char rating = 'A';
         String isASequelsOrNot = "Not";
         String rottenTomatoesRating = "100";
         String isOnDVD = "No";


         String fullMessage = "------ Welcome to the Cinema ------" + "\nTonight we are streaming " + name + " which was released on " + realeaseDate
                 + "\nThis " + gender + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes. " +
                 "\nThe rating is " + rating + " and it runs for " + duration + " hours. " + "\nThis is a sequel " +
                 isASequelsOrNot + " and is on dvd " + isOnDVD;

         System.out.println(fullMessage);
    }
}
