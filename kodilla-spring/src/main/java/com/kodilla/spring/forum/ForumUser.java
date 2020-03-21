package com.kodilla.spring.forum;

public class ForumUser {
    final WriteText writeText;

    public ForumUser(final WriteText writeText){
        this.writeText = writeText;
    }

    public String doWriting(){
        return writeText.doWrite();
    }
}
