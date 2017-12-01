package com.example.adminjs.jisoasheng01;

import android.app.Application;


import com.example.adminjs.jisoasheng01.gen.DaoMaster;
import com.example.adminjs.jisoasheng01.gen.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * 周旋
 * 2017/12/1  08:52
 */

public class Iappliction extends Application {

    public static DaoSession session;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper tablename = new DaoMaster.DevOpenHelper(this, "tablename");
        Database writableDb = tablename.getWritableDb();
        session = new DaoMaster(writableDb).newSession();


    }
}
