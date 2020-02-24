package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

   private int usersNumber;
   private int postsNumber;
   private int commentsNumber;
   private double avgPostPerUser;
   private double avgCommentPerUser;
   private double avgCommentPerPost;



    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber != 0) {
            avgPostPerUser = postsNumber / (double) usersNumber;
            avgCommentPerUser = commentsNumber / (double) usersNumber;
            if (postsNumber != 0) {
                avgCommentPerPost = commentsNumber /(double) postsNumber;
            }
        } else {
            avgCommentPerUser = 0.0;
            avgPostPerUser = 0.0;
            avgCommentPerPost = 0.0;
        }

    }

    public void showStatistics(){
        System.out.println(usersNumber+ " users, "+ postsNumber+ " posts, "+ commentsNumber+ " comments.");
        System.out.println("Average "+ avgPostPerUser+ " posts & "+ avgCommentPerUser+ " comments per user.");
        System.out.println("Average "+ avgCommentPerPost+ " comments per post.");
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }
}
