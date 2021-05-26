package Replit_And_Practice_Tasks;

public class MovieClass {
    public static void main(String[] args) {

        String movieName, genre, releaseDate;
                movieName = "My First Journey!";
                genre = "Documentary";
                releaseDate = "21/02/2021, 10:00 AM;";

        short onTomRating, duration;
                onTomRating = 100 - 10;
                duration = 120;

        char rating = 'R';
        boolean isSeqels = true;
        boolean isOnDVD = false;

        System.out.println();
        System.out.println("                         ===>> Welcome to the Cinema <<===");
        System.out.println("********************************************************************************************************");
        System.out.println("* Tonight we are streaming \"" + movieName + "\" movie which was released on " + releaseDate + "       *"+
                "\n* This " + genre + " movie got a " + onTomRating + " rating on Rotten Tomatoes." + "                                           *"+
                "\n* The rating is " + rating + " and it runs for " + duration + " minutes." + "                                                         *"+
                "\n* This is a sequel: " + isSeqels + " and is on dvd: " + isOnDVD + "." + "                                                         *");
        System.out.println("********************************************************************************************************");




    }
}
