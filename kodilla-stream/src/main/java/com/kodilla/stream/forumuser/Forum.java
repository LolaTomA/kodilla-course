package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> forumUserList = new ArrayList<>();
    public List<ForumUser> getUserList(){
      forumUserList.add(new ForumUser(1, "Bolek", 'M',
              LocalDate.of(1999,1,1), 1 ));
      forumUserList.add(new ForumUser(11, "Lolek", 'M',
                LocalDate.of(1999,11,11), 2 ));
      forumUserList.add(new ForumUser(111, "Tola", 'F',
                LocalDate.of(1998,1,1), 13 ));
      forumUserList.add(new ForumUser(2, "Tosia", 'F',
                LocalDate.of(1988,1,1), 3 ));
      forumUserList.add(new ForumUser(3, "Tom", 'M',
                LocalDate.of(1987,8,1), 3 ));
      return new ArrayList<>(forumUserList);
    }

}
