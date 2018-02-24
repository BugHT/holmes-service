package com.wanan.holmes.controller;

import com.wanan.holmes.domain.HolmesHttpResult;
import com.wanan.holmes.domain.Story;
import com.wanan.holmes.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author teng.hao
 * Created by Intellij IDEA
 * Date 18/1/14
 * Time 下午7:37
 */
@Controller
@EnableAutoConfiguration
@RequestMapping(value="/Holmes",method = {RequestMethod.GET,RequestMethod.POST})
public class StoryController {

    @Autowired
    private StoryService storyService;

    @RequestMapping(value="/getStory",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public HolmesHttpResult<String> getStroyByNameAndRole(String storyName, String role){
        return storyService.getStoryByNameAndRole(storyName,role);
    }

    @RequestMapping(value="/getRole",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public HolmesHttpResult<String> getRoleByStoryName(String storyName){
        return storyService.getRoleByStoryName(storyName);
    }

    @RequestMapping(value="/getStoryList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public HolmesHttpResult<String> getStoryList(){
        return storyService.getStoryList();
    }

    @RequestMapping(value="/saveStory")
    @ResponseBody
    public HolmesHttpResult<String> saveStory(@RequestBody Story story){
        if(null==story.getStoryName()||story.getStoryName().isEmpty()){
            return HolmesHttpResult.errorResult("剧本名不能为空");
        }
        if(null==story.getRole()||story.getStoryName().isEmpty()){
            return HolmesHttpResult.errorResult("角色名不能为空");
        }
        if(null==story.getRoleStory()||story.getRoleStory().isEmpty()){
            return HolmesHttpResult.errorResult("角色故事不能为空");
        }
        if(null==story.getStoryResult()||story.getStoryResult().isEmpty()){
            return HolmesHttpResult.errorResult("剧本结局不能为空");
        }

        return storyService.saveStory(story);
    }
}
