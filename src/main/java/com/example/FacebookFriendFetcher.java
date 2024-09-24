package com.example;

import java.util.Arrays;

public class FacebookFriendFetcher {

    // Method that takes a Facebook profile link and returns an array of friends' names.
    public String[] getFriendsList(String profileLink) {
        if (profileLink == null || profileLink.isEmpty()) {
            throw new IllegalArgumentException("Profile link cannot be null or empty");
        }

        // For now, we return a hardcoded list.
        // In real implementation, you could fetch from Facebook API or a text file.
        return new String[] { "John Doe", "Jane Smith", "Alice Johnson" };
    }
}
