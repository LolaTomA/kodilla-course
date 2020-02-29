package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theForumUsersList = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2020 )
                .filter(forumUser -> forumUser.getPostNumber() > 0)

                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theForumUsersList.size());
        theForumUsersList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().toString())
                .forEach(System.out::println);
    }
}
