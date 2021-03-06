package com.gwi.selfplatform.db.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table USER.
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property UserId = new Property(0, Long.class, "UserId", true, "USER_ID");
        public final static Property UserCode = new Property(1, String.class, "UserCode", false, "USER_CODE");
        public final static Property UserName = new Property(2, String.class, "UserName", false, "USER_NAME");
        public final static Property NickName = new Property(3, String.class, "NickName", false, "NICK_NAME");
        public final static Property UserPwd = new Property(4, String.class, "UserPwd", false, "USER_PWD");
        public final static Property MobilePhone = new Property(5, String.class, "MobilePhone", false, "MOBILE_PHONE");
        public final static Property EMail = new Property(6, String.class, "EMail", false, "EMAIL");
        public final static Property RoleCode = new Property(7, String.class, "RoleCode", false, "ROLE_CODE");
        public final static Property RegDate = new Property(8, String.class, "RegDate", false, "REG_DATE");
        public final static Property UserStatus = new Property(9, String.class, "UserStatus", false, "USER_STATUS");
        public final static Property RecordMan = new Property(10, String.class, "RecordMan", false, "RECORD_MAN");
        public final static Property RecordDate = new Property(11, java.util.Date.class, "RecordDate", false, "RECORD_DATE");
        public final static Property EnhrId = new Property(12, String.class, "EnhrId", false, "ENHR_ID");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'USER' (" + //
                "'USER_ID' INTEGER PRIMARY KEY ," + // 0: UserId
                "'USER_CODE' TEXT," + // 1: UserCode
                "'USER_NAME' TEXT," + // 2: UserName
                "'NICK_NAME' TEXT," + // 3: NickName
                "'USER_PWD' TEXT," + // 4: UserPwd
                "'MOBILE_PHONE' TEXT," + // 5: MobilePhone
                "'EMAIL' TEXT," + // 6: EMail
                "'ROLE_CODE' TEXT," + // 7: RoleCode
                "'REG_DATE' TEXT," + // 8: RegDate
                "'USER_STATUS' TEXT," + // 9: UserStatus
                "'RECORD_MAN' TEXT," + // 10: RecordMan
                "'RECORD_DATE' INTEGER," + // 11: RecordDate
                "'ENHR_ID' TEXT);"); // 12: EnhrId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'USER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindLong(1, UserId);
        }
 
        String UserCode = entity.getUserCode();
        if (UserCode != null) {
            stmt.bindString(2, UserCode);
        }
 
        String UserName = entity.getUserName();
        if (UserName != null) {
            stmt.bindString(3, UserName);
        }
 
        String NickName = entity.getNickName();
        if (NickName != null) {
            stmt.bindString(4, NickName);
        }
 
        String UserPwd = entity.getUserPwd();
        if (UserPwd != null) {
            stmt.bindString(5, UserPwd);
        }
 
        String MobilePhone = entity.getMobilePhone();
        if (MobilePhone != null) {
            stmt.bindString(6, MobilePhone);
        }
 
        String EMail = entity.getEMail();
        if (EMail != null) {
            stmt.bindString(7, EMail);
        }
 
        String RoleCode = entity.getRoleCode();
        if (RoleCode != null) {
            stmt.bindString(8, RoleCode);
        }
 
        String RegDate = entity.getRegDate();
        if (RegDate != null) {
            stmt.bindString(9, RegDate);
        }
 
        String UserStatus = entity.getUserStatus();
        if (UserStatus != null) {
            stmt.bindString(10, UserStatus);
        }
 
        String RecordMan = entity.getRecordMan();
        if (RecordMan != null) {
            stmt.bindString(11, RecordMan);
        }
 
        java.util.Date RecordDate = entity.getRecordDate();
        if (RecordDate != null) {
            stmt.bindLong(12, RecordDate.getTime());
        }
 
        String EnhrId = entity.getEnhrId();
        if (EnhrId != null) {
            stmt.bindString(13, EnhrId);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // UserId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // UserCode
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // UserName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // NickName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // UserPwd
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // MobilePhone
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // EMail
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // RoleCode
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // RegDate
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // UserStatus
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // RecordMan
            cursor.isNull(offset + 11) ? null : new java.util.Date(cursor.getLong(offset + 11)), // RecordDate
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // EnhrId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setUserId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserCode(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUserName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNickName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserPwd(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMobilePhone(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEMail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRoleCode(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRegDate(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setUserStatus(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRecordMan(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRecordDate(cursor.isNull(offset + 11) ? null : new java.util.Date(cursor.getLong(offset + 11)));
        entity.setEnhrId(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setUserId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getUserId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
