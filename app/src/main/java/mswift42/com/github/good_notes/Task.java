package mswift42.com.github.good_notes;

import java.util.Date;

public class Task {
    private String mSummary;
    private Date mScheduled;

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
