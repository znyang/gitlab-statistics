package com.zen.android.gitlab.sdk.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zen
 * @version 2016/4/26
 */
public class Calendar {

    private static String PATTERN_CODE = "new Calendar\\([^{]*(\\{[^}]*\\}),([^,]*),([^,]*),([^," +
            "]*)\\)";

    private List<Day> mDays;
    private int mTotalCount = -1;

    @Nullable
    public static Calendar parseCalendar(@NonNull String src) {
        Pattern pattern = Pattern.compile(PATTERN_CODE);
        Matcher matcher = pattern.matcher(src);
        if (matcher.find()) {
            String data = matcher.group(1);
            Calendar days = parseCalendarFromJson(data);
            if (days != null) return days;
        }
        return null;
    }

    @Nullable
    public static Calendar parseCalendarFromJson(@NonNull String data) {
        try {
            JSONObject object = new JSONObject(data);
            Iterator<String> keys = object.keys();
            List<Day> days = new ArrayList<>();
            while (keys.hasNext()) {
                String key = keys.next();
                int count = object.getInt(key);
                Date date = new Date(Long.parseLong(key));
                days.add(new Day(date, count));
            }
            return new Calendar(days);
        } catch (JSONException e) {
            Log.e("Calendar", "parse calendar data fail", e);
        }
        return null;
    }

    public Calendar(List<Day> days) {
        mDays = days;
    }

    public List<Day> getDays() {
        return mDays;
    }

    public int getTotalCount() {
        if (mTotalCount < 0) {
            mTotalCount = computeCount();
        }
        return mTotalCount;
    }

    private int computeCount() {
        int count = 0;
        for (Day d : getDays()) {
            count += d.getCount();
        }
        return count;
    }

    public static class Day {
        private Date mDate;
        private int  mCount;

        public Day(Date date, int count) {
            mDate = date;
            mCount = count;
        }

        public Date getDate() {
            return mDate;
        }

        public int getCount() {
            return mCount;
        }
    }

}
