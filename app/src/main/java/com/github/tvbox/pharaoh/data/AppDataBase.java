package com.github.tvbox.pharaoh.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.github.tvbox.pharaoh.cache.Cache;
import com.github.tvbox.pharaoh.cache.CacheDao;
import com.github.tvbox.pharaoh.cache.VodCollect;
import com.github.tvbox.pharaoh.cache.VodCollectDao;
import com.github.tvbox.pharaoh.cache.VodRecord;
import com.github.tvbox.pharaoh.cache.VodRecordDao;


/**
 * 类描述:
 *
 * @author pj567
 * @since 2020/5/15
 */
@Database(entities = {Cache.class, VodRecord.class, VodCollect.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CacheDao getCacheDao();

    public abstract VodRecordDao getVodRecordDao();

    public abstract VodCollectDao getVodCollectDao();
}
