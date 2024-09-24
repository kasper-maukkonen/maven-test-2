package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FacebookFriendFetcherTest {

    @Test(timeout = 1000) // Ensures the method completes within 1 second
    public void testGetFriendsListPerformance() {
        FacebookFriendFetcher fetcher = new FacebookFriendFetcher();
        fetcher.getFriendsList("https://www.facebook.com/johndoe");
    }
    // Positive test case: check if it returns the expected list of friends
    @Test
    public void testGetFriendsList_validProfile() {
        FacebookFriendFetcher fetcher = new FacebookFriendFetcher();
        String[] friends = fetcher.getFriendsList("https://www.facebook.com/johndoe");

        String[] expectedFriends = { "John Doe", "Jane Smith", "Alice Johnson" };
        assertArrayEquals(expectedFriends, friends);
    }

    // Negative test case: check if it throws exception for null input
    @Test(expected = IllegalArgumentException.class)
    public void testGetFriendsList_nullProfile() {
        FacebookFriendFetcher fetcher = new FacebookFriendFetcher();
        fetcher.getFriendsList(null);  // Should throw IllegalArgumentException
    }

    // Negative test case: check if it throws exception for empty string input
    @Test(expected = IllegalArgumentException.class)
    public void testGetFriendsList_emptyProfile() {
        FacebookFriendFetcher fetcher = new FacebookFriendFetcher();
        fetcher.getFriendsList("");  // Should throw IllegalArgumentException


    }
}