package ru.netology.domain.attachment;

import java.lang.ref.SoftReference;

public class Poll {
    private int id;
    private int ownerId;
    private int created;
    private String question;
    private int votes;
    //skipped array answers
    private boolean anonymous;
    private boolean multiple;
    //skipped array answerIds
    private int endDate;
    private boolean canEdit;
    private boolean canVote;
    private boolean canReport;
    private boolean canShare;
    private int authorId;
    private Photo photo;
    private Background background;
    //skipped array friends
}
