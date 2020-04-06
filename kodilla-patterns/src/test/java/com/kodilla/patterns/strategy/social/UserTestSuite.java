package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials marian = new Millenials("Marian 1991 ");
        YGeneration yogi = new YGeneration("Yogi 2010 ");
        ZGeneration zenek = new ZGeneration("Zenek 2001 ");

        //When
        String marianPosts = marian.sharePost();
        String yogiPosts = yogi.sharePost();
        String zenekPosts = zenek.sharePost();

        System.out.println("Marian's media: " + marianPosts);
        System.out.println("Yogi's media: " + yogiPosts);
        System.out.println("Zenek's media: " + zenekPosts);

        //Then
        Assert.assertEquals("Facebook", marianPosts);
        Assert.assertEquals("Twitter", yogiPosts);
        Assert.assertEquals("Snapchat", zenekPosts);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials marian = new Millenials("Marian 1991 ");

        //When
        String marianPosts = marian.sharePost();
        System.out.println(marian + " " + marianPosts);

        System.out.println("After change for Snapchat:");

        marian.setPublisher(new SnapchatPublisher());
        marianPosts = marian.sharePost();
        System.out.println(marian + " " + marianPosts);

        //Then
        Assert.assertEquals("Snapchat", marianPosts);
    }
}
