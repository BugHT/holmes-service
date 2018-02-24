package com.wanan.holmes.service;

import com.wanan.holmes.domain.HolmesHttpResult;
import com.wanan.holmes.domain.Story;

import java.util.List;

/**
 * @author teng.hao
 * Created by Intellij IDEA
 * Date 18/1/14
 * Time 下午7:58
 */
public interface StoryService {
    /**
     * 根据剧本角色名称获取记录
     * @param storyName
     * @param role
     * @return
     */
    public HolmesHttpResult<String> getStoryByNameAndRole(String storyName, String role);

    /**
     * 根据剧本名称获取对应的角色命
     * @param storyName
     * @return
     */
    public HolmesHttpResult<String> getRoleByStoryName(String storyName);

    /**
     * 获取剧本列表
     * @return
     */
    public HolmesHttpResult<String> getStoryList();

    public HolmesHttpResult<String> saveStory(Story stroy);
}
