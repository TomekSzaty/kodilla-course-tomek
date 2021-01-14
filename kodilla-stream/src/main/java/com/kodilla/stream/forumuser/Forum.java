package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser("Maks",1, 'M',
                1988, 06, 24, 1));
        theUserList.add(new ForumUser("Lola",2, 'F',
                1997, 04, 20, 4));
        theUserList.add(new ForumUser("Tom ",3, 'M',
                1992, 01, 04, 5));
        theUserList.add(new ForumUser("Liza",4, 'F',
                2004, 03, 14, 1));
        theUserList.add(new ForumUser("Frank",5, 'M',
                2001, 12, 24, 0));
        theUserList.add(new ForumUser("Ian",6, 'M',
                2005, 01, 02, 542));
        theUserList.add(new ForumUser("John",7, 'M',
                1977, 5, 14, 18));
        theUserList.add(new ForumUser("Sue",8, 'F',
                1995, 11, 30, 94));
        theUserList.add(new ForumUser("Ann",9, 'F',
                2000, 07, 03, 15));
    }
        public List<ForumUser> getTheUserList() {
            return new ArrayList<>(theUserList);
        }

}
