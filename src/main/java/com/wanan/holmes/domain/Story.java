package com.wanan.holmes.domain;


import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;

/**
 * @author teng.hao
 * Created by Intellij IDEA
 * Date 18/1/14
 * Time 下午8:34
 */
@Entity(name = "story")
public class Story {
    /**
     * 故事id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * 故事名称
     */
    @Column(name="storyName")
    private String storyName;
    /**
     * 角色
     */
    @Column(name="role")
    private String role;
    /**
     * 角色故事
     */
    @Column(name = "roleStory")
    private String roleStory;
    /**
     * 第一轮线索
     */
    @Column(name = "firstCule")
    private String firstCule;
    /**
     * 第二轮线索
     */
    @Column(name="secondCule")
    private String secondCule;
    /**
     * 故事结局
     */
    @Column(name="storyResult")
    private String storyResult;

    /**
     * 剧本创建时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     * 剧本最近更新时间
     */
    @Column(name="updateTime")
    private Date updateTime;

    public Story(){
        super();
    }

    public Story(Long id, String storyName, String role, String roleStory, String firstCule, String secondCule, String storyResult, Date createTime, Date updateTime) {
        super();
        this.id = id;
        this.storyName = storyName;
        this.role = role;
        this.roleStory = roleStory;
        this.firstCule = firstCule;
        this.secondCule = secondCule;
        this.storyResult = storyResult;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleStory() {
        return roleStory;
    }

    public void setRoleStory(String roleStory) {
        this.roleStory = roleStory;
    }

    public String getFirstCule() {
        return firstCule;
    }

    public void setFirstCule(String firstCule) {
        this.firstCule = firstCule;
    }

    public String getSecondCule() {
        return secondCule;
    }

    public void setSecondCule(String secondCule) {
        this.secondCule = secondCule;
    }

    public String getStoryResult() {
        return storyResult;
    }

    public void setStoryResult(String storyResult) {
        this.storyResult = storyResult;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
