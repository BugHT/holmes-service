package com.wanan.holmes.service.impl;

import com.alibaba.fastjson.JSON;
import com.wanan.holmes.dao.StoryRepository;
import com.wanan.holmes.domain.HolmesHttpResult;
import com.wanan.holmes.domain.Story;
import com.wanan.holmes.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

/**
 * @author teng.hao
 * Created by Intellij IDEA
 * Date 18/1/14
 * Time 下午8:00
 */

@Service
public class StoryServiceImpl implements StoryService{
    @Autowired
    private StoryRepository storyRepository;

    @Override
    public HolmesHttpResult<String> getStoryByNameAndRole(String storyName, String role){
        Story story = storyRepository.findByStoryNameAndRole(storyName,role);
        String storyStr = JSON.toJSONString(story);
        if(null==story){
            return HolmesHttpResult.successResult("no data");
        }
        return HolmesHttpResult.successResult(storyStr);
    }

    @Override
    public HolmesHttpResult<String> getRoleByStoryName(String storyName){
        List<String> roleList = storyRepository.findRoleByStoryName(storyName);
        if(CollectionUtils.isEmpty(roleList)){
            return HolmesHttpResult.successResult("no data");
        }
        return HolmesHttpResult.successResult(JSON.toJSONString(roleList));
    }

    @Override
    public HolmesHttpResult<String> getStoryList(){
        Story story = new Story();
        List<String> storyList = storyRepository.findStoryList();
        if(CollectionUtils.isEmpty(storyList)){
            return HolmesHttpResult.successResult("no data");
        }
        return HolmesHttpResult.successResult(JSON.toJSONString(storyList));
    }

    @Override
    public HolmesHttpResult<String> saveStory(@RequestBody Story story){
        Story resultStory = storyRepository.save(story);
        if(resultStory!=null){
            return HolmesHttpResult.successResult("保存成功");
        }
        return HolmesHttpResult.errorResult("保存失败");
    }
}
