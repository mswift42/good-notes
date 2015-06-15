package mswift42.com.github.good_notes;

import java.util.Date;
import java.util.UUID;

public class Task {
    private String mSummary;
    private Date mScheduled;
    private UUID mID;

    public Task() {
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }


    public Date getScheduled() {
        return mScheduled;
    }

    public void setScheduled(Date scheduled) {
        mScheduled = scheduled;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
