package com.wanan.holmes.dao;

import com.wanan.holmes.domain.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author teng.hao
 * Created by Intellij IDEA
 * Date 18/1/14
 * Time 下午9:38
 */
@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {
    public Story findByStoryNameAndRole(String storyName, String role);

    @Query(value="select role from story s where s.storyName=:storyName")
    public List<String> findRoleByStoryName(@Param("storyName") String storyName);

    @Query(value="select distinct(storyName) from story")
    public List<String> findStoryList();
}
