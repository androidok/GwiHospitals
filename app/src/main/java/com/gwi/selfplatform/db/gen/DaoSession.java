package com.gwi.selfplatform.db.gen;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig t_UserInfoDaoConfig;
    private final DaoConfig t_Phr_SignRecDaoConfig;
    private final DaoConfig t_Phr_BaseInfoDaoConfig;
    private final DaoConfig t_Phr_CardBindRecDaoConfig;
    private final DaoConfig t_HealthEdu_DatumDaoConfig;
    private final DaoConfig t_Phone_AuthCodeDaoConfig;
    private final DaoConfig t_Base_DatumClassDaoConfig;
    private final DaoConfig t_FeedBack_RecDaoConfig;
    private final DaoConfig base_AddressDictDaoConfig;

    private final T_UserInfoDao t_UserInfoDao;
    private final T_Phr_SignRecDao t_Phr_SignRecDao;
    private final T_Phr_BaseInfoDao t_Phr_BaseInfoDao;
    private final T_Phr_CardBindRecDao t_Phr_CardBindRecDao;
    private final T_HealthEdu_DatumDao t_HealthEdu_DatumDao;
    private final T_Phone_AuthCodeDao t_Phone_AuthCodeDao;
    private final T_Base_DatumClassDao t_Base_DatumClassDao;
    private final T_FeedBack_RecDao t_FeedBack_RecDao;
    private final Base_AddressDictDao base_AddressDictDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        t_UserInfoDaoConfig = daoConfigMap.get(T_UserInfoDao.class).clone();
        t_UserInfoDaoConfig.initIdentityScope(type);

        t_Phr_SignRecDaoConfig = daoConfigMap.get(T_Phr_SignRecDao.class).clone();
        t_Phr_SignRecDaoConfig.initIdentityScope(type);

        t_Phr_BaseInfoDaoConfig = daoConfigMap.get(T_Phr_BaseInfoDao.class).clone();
        t_Phr_BaseInfoDaoConfig.initIdentityScope(type);

        t_Phr_CardBindRecDaoConfig = daoConfigMap.get(T_Phr_CardBindRecDao.class).clone();
        t_Phr_CardBindRecDaoConfig.initIdentityScope(type);

        t_HealthEdu_DatumDaoConfig = daoConfigMap.get(T_HealthEdu_DatumDao.class).clone();
        t_HealthEdu_DatumDaoConfig.initIdentityScope(type);

        t_Phone_AuthCodeDaoConfig = daoConfigMap.get(T_Phone_AuthCodeDao.class).clone();
        t_Phone_AuthCodeDaoConfig.initIdentityScope(type);

        t_Base_DatumClassDaoConfig = daoConfigMap.get(T_Base_DatumClassDao.class).clone();
        t_Base_DatumClassDaoConfig.initIdentityScope(type);

        t_FeedBack_RecDaoConfig = daoConfigMap.get(T_FeedBack_RecDao.class).clone();
        t_FeedBack_RecDaoConfig.initIdentityScope(type);

        base_AddressDictDaoConfig = daoConfigMap.get(Base_AddressDictDao.class).clone();
        base_AddressDictDaoConfig.initIdentityScope(type);

        t_UserInfoDao = new T_UserInfoDao(t_UserInfoDaoConfig, this);
        t_Phr_SignRecDao = new T_Phr_SignRecDao(t_Phr_SignRecDaoConfig, this);
        t_Phr_BaseInfoDao = new T_Phr_BaseInfoDao(t_Phr_BaseInfoDaoConfig, this);
        t_Phr_CardBindRecDao = new T_Phr_CardBindRecDao(t_Phr_CardBindRecDaoConfig, this);
        t_HealthEdu_DatumDao = new T_HealthEdu_DatumDao(t_HealthEdu_DatumDaoConfig, this);
        t_Phone_AuthCodeDao = new T_Phone_AuthCodeDao(t_Phone_AuthCodeDaoConfig, this);
        t_Base_DatumClassDao = new T_Base_DatumClassDao(t_Base_DatumClassDaoConfig, this);
        t_FeedBack_RecDao = new T_FeedBack_RecDao(t_FeedBack_RecDaoConfig, this);
        base_AddressDictDao = new Base_AddressDictDao(base_AddressDictDaoConfig, this);

        registerDao(T_UserInfo.class, t_UserInfoDao);
        registerDao(T_Phr_SignRec.class, t_Phr_SignRecDao);
        registerDao(T_Phr_BaseInfo.class, t_Phr_BaseInfoDao);
        registerDao(T_Phr_CardBindRec.class, t_Phr_CardBindRecDao);
        registerDao(T_HealthEdu_Datum.class, t_HealthEdu_DatumDao);
        registerDao(T_Phone_AuthCode.class, t_Phone_AuthCodeDao);
        registerDao(T_Base_DatumClass.class, t_Base_DatumClassDao);
        registerDao(T_FeedBack_Rec.class, t_FeedBack_RecDao);
        registerDao(Base_AddressDict.class, base_AddressDictDao);
    }
    
    public void clear() {
        t_UserInfoDaoConfig.getIdentityScope().clear();
        t_Phr_SignRecDaoConfig.getIdentityScope().clear();
        t_Phr_BaseInfoDaoConfig.getIdentityScope().clear();
        t_Phr_CardBindRecDaoConfig.getIdentityScope().clear();
        t_HealthEdu_DatumDaoConfig.getIdentityScope().clear();
        t_Phone_AuthCodeDaoConfig.getIdentityScope().clear();
        t_Base_DatumClassDaoConfig.getIdentityScope().clear();
        t_FeedBack_RecDaoConfig.getIdentityScope().clear();
        base_AddressDictDaoConfig.getIdentityScope().clear();
    }

    public T_UserInfoDao getT_UserInfoDao() {
        return t_UserInfoDao;
    }

    public T_Phr_SignRecDao getT_Phr_SignRecDao() {
        return t_Phr_SignRecDao;
    }

    public T_Phr_BaseInfoDao getT_Phr_BaseInfoDao() {
        return t_Phr_BaseInfoDao;
    }

    public T_Phr_CardBindRecDao getT_Phr_CardBindRecDao() {
        return t_Phr_CardBindRecDao;
    }

    public T_HealthEdu_DatumDao getT_HealthEdu_DatumDao() {
        return t_HealthEdu_DatumDao;
    }

    public T_Phone_AuthCodeDao getT_Phone_AuthCodeDao() {
        return t_Phone_AuthCodeDao;
    }

    public T_Base_DatumClassDao getT_Base_DatumClassDao() {
        return t_Base_DatumClassDao;
    }

    public T_FeedBack_RecDao getT_FeedBack_RecDao() {
        return t_FeedBack_RecDao;
    }

    public Base_AddressDictDao getBase_AddressDictDao() {
        return base_AddressDictDao;
    }

}
