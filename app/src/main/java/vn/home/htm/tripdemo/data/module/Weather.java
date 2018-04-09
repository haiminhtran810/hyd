package vn.home.htm.tripdemo.data.module;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by HaiMinhTran on 4/19/2018.
 */

public class Weather implements Parcelable {
    @SerializedName("base")
    @Expose
    private String mBase;
    @SerializedName("visibility")
    @Expose
    private int mVisibility;
    @SerializedName("dt")
    @Expose
    private int mDt;
    @SerializedName("name")
    @Expose
    private String mName;

    protected Weather(Parcel in) {
        mBase = in.readString();
        mVisibility = in.readInt();
        mDt = in.readInt();
        mName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mBase);
        dest.writeInt(mVisibility);
        dest.writeInt(mDt);
        dest.writeString(mName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Weather> CREATOR = new Creator<Weather>() {
        @Override
        public Weather createFromParcel(Parcel in) {
            return new Weather(in);
        }

        @Override
        public Weather[] newArray(int size) {
            return new Weather[size];
        }
    };

    public String getmBase() {
        return mBase;
    }

    public void setmBase(String mBase) {
        this.mBase = mBase;
    }

    public int getmVisibility() {
        return mVisibility;
    }

    public void setmVisibility(int mVisibility) {
        this.mVisibility = mVisibility;
    }

    public int getmDt() {
        return mDt;
    }

    public void setmDt(int mDt) {
        this.mDt = mDt;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
