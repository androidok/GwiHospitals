package com.gwi.selfplatform.db.gen;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table T__FEED_BACK__REC.
 */
public class T_FeedBack_Rec {

    private long RecNo;
    private String UserCode;
    private String PhoneNumber;
    private String Advice;
    private Integer Source;
    private Integer Type;
    private Integer Status;
    private java.util.Date RecDate;
    private java.util.Date DealDate;
    private String DealMan;

    public T_FeedBack_Rec() {
    }

    public T_FeedBack_Rec(long RecNo) {
        this.RecNo = RecNo;
    }

    public T_FeedBack_Rec(long RecNo, String UserCode, String PhoneNumber, String Advice, Integer Source, Integer Type, Integer Status, java.util.Date RecDate, java.util.Date DealDate, String DealMan) {
        this.RecNo = RecNo;
        this.UserCode = UserCode;
        this.PhoneNumber = PhoneNumber;
        this.Advice = Advice;
        this.Source = Source;
        this.Type = Type;
        this.Status = Status;
        this.RecDate = RecDate;
        this.DealDate = DealDate;
        this.DealMan = DealMan;
    }

    public long getRecNo() {
        return RecNo;
    }

    public void setRecNo(long RecNo) {
        this.RecNo = RecNo;
    }

    public String getUserCode() {
        return UserCode;
    }

    public void setUserCode(String UserCode) {
        this.UserCode = UserCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAdvice() {
        return Advice;
    }

    public void setAdvice(String Advice) {
        this.Advice = Advice;
    }

    public Integer getSource() {
        return Source;
    }

    public void setSource(Integer Source) {
        this.Source = Source;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public java.util.Date getRecDate() {
        return RecDate;
    }

    public void setRecDate(java.util.Date RecDate) {
        this.RecDate = RecDate;
    }

    public java.util.Date getDealDate() {
        return DealDate;
    }

    public void setDealDate(java.util.Date DealDate) {
        this.DealDate = DealDate;
    }

    public String getDealMan() {
        return DealMan;
    }

    public void setDealMan(String DealMan) {
        this.DealMan = DealMan;
    }

}
