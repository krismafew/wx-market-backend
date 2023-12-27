package com.laoyancheng.www.wxmarketbackend.db.domain;

import java.util.Date;

public class MarketIssue {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_issue.id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_issue.question
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private String question;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_issue.answer
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private String answer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_issue.add_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_issue.update_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_issue.deleted
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_issue.id
     *
     * @return the value of market_issue.id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_issue.id
     *
     * @param id the value for market_issue.id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_issue.question
     *
     * @return the value of market_issue.question
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_issue.question
     *
     * @param question the value for market_issue.question
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_issue.answer
     *
     * @return the value of market_issue.answer
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_issue.answer
     *
     * @param answer the value for market_issue.answer
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_issue.add_time
     *
     * @return the value of market_issue.add_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_issue.add_time
     *
     * @param addTime the value for market_issue.add_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_issue.update_time
     *
     * @return the value of market_issue.update_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_issue.update_time
     *
     * @param updateTime the value for market_issue.update_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_issue.deleted
     *
     * @return the value of market_issue.deleted
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_issue.deleted
     *
     * @param deleted the value for market_issue.deleted
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}