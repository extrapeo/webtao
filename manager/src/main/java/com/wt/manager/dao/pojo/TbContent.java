package com.wt.manager.dao.pojo;

import java.util.Date;

public class TbContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.id
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.category_id
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.title
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.sub_title
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private String subTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.title_desc
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private String titleDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.url
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.pic
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.pic2
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private String pic2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.created
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.updated
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content.content
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.id
     *
     * @return the value of tb_content.id
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.id
     *
     * @param id the value for tb_content.id
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.category_id
     *
     * @return the value of tb_content.category_id
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.category_id
     *
     * @param categoryId the value for tb_content.category_id
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.title
     *
     * @return the value of tb_content.title
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.title
     *
     * @param title the value for tb_content.title
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.sub_title
     *
     * @return the value of tb_content.sub_title
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.sub_title
     *
     * @param subTitle the value for tb_content.sub_title
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.title_desc
     *
     * @return the value of tb_content.title_desc
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.title_desc
     *
     * @param titleDesc the value for tb_content.title_desc
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.url
     *
     * @return the value of tb_content.url
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.url
     *
     * @param url the value for tb_content.url
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.pic
     *
     * @return the value of tb_content.pic
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.pic
     *
     * @param pic the value for tb_content.pic
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.pic2
     *
     * @return the value of tb_content.pic2
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.pic2
     *
     * @param pic2 the value for tb_content.pic2
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.created
     *
     * @return the value of tb_content.created
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.created
     *
     * @param created the value for tb_content.created
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.updated
     *
     * @return the value of tb_content.updated
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.updated
     *
     * @param updated the value for tb_content.updated
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content.content
     *
     * @return the value of tb_content.content
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content.content
     *
     * @param content the value for tb_content.content
     *
     * @mbggenerated Sat Jan 13 19:29:05 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}