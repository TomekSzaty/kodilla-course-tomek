package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListUsers(int usersQuantity){
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < usersQuantity; i++) {
            listMock.add("User " + i);
        }
        return listMock;
    }

    @Test
    void testCalculateAdvStatisticsWhenZeroPosts() {
        //Given
        List<String> usersForumList = generateListUsers(20);
        when(statisticsMock.userNames()).thenReturn(usersForumList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(20, forumStatistics.getQuantityUsers());
        assertEquals(0, forumStatistics.getQuantityPosts());
        assertEquals(10, forumStatistics.getQuantityComments());
        assertEquals(0.0, forumStatistics.getAveragePostsPerUser() , 0.001);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerUser() , 0.001);
        assertEquals(0.0, forumStatistics.getAverageCommentsPerPost() , 0.001);
    }

    @Test
    void testCalculateAdvStatisticsWhenThousandPosts() {
        //Given
        List<String> usersForumList = generateListUsers(20);
        when(statisticsMock.userNames()).thenReturn(usersForumList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(20, forumStatistics.getQuantityUsers());
        assertEquals(1000, forumStatistics.getQuantityPosts());
        assertEquals(10, forumStatistics.getQuantityComments());
        assertEquals(50.0, forumStatistics.getAveragePostsPerUser() , 0.01);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerUser() , 0.01);
        assertEquals(0.0, forumStatistics.getAverageCommentsPerPost() , 0.01);
    }

    @Test
    void testCalculateAdvStatisticsWhenZeroComments() {
        //Given
        List<String> usersForumList = generateListUsers(20);
        when(statisticsMock.userNames()).thenReturn(usersForumList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(20, forumStatistics.getQuantityUsers());
        assertEquals(1000, forumStatistics.getQuantityPosts());
        assertEquals(0, forumStatistics.getQuantityComments());
        assertEquals(50.0, forumStatistics.getAveragePostsPerUser() , 0.01);
        assertEquals(0.0, forumStatistics.getAverageCommentsPerUser() , 0.01);
        assertEquals(0.0, forumStatistics.getAverageCommentsPerPost() , 0.01);
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {
        //Given
        List<String> usersForumList = generateListUsers(20);
        when(statisticsMock.userNames()).thenReturn(usersForumList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(20, forumStatistics.getQuantityUsers());
        assertEquals(1000, forumStatistics.getQuantityPosts());
        assertEquals(2000, forumStatistics.getQuantityComments());
        assertEquals(50.0, forumStatistics.getAveragePostsPerUser() , 0.01);
        assertEquals(100.0, forumStatistics.getAverageCommentsPerUser() , 0.01);
        assertEquals(2.0, forumStatistics.getAverageCommentsPerPost() , 0.01);
    }
    @Test
    void testCalculateAdvStatisticsWhenCommentsLessThanPosts() {
        //Given
        List<String> usersForumList = generateListUsers(20);
        when(statisticsMock.userNames()).thenReturn(usersForumList);
        when(statisticsMock.postsCount()).thenReturn(2000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(20, forumStatistics.getQuantityUsers());
        assertEquals(2000, forumStatistics.getQuantityPosts());
        assertEquals(1000, forumStatistics.getQuantityComments());
        assertEquals(100.0, forumStatistics.getAveragePostsPerUser() , 0.01);
        assertEquals(50.0, forumStatistics.getAverageCommentsPerUser() , 0.01);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost() , 0.01);
    }
    @Test
    void testCalculateAdvStatisticsWhenZeroUsers() {
        //Given
        List<String> usersForumList = generateListUsers(0);
        when(statisticsMock.userNames()).thenReturn(usersForumList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getQuantityUsers());
        assertEquals(0, forumStatistics.getQuantityPosts());
        assertEquals(0, forumStatistics.getQuantityComments());
        assertEquals(0.0, forumStatistics.getAveragePostsPerUser() , 0.001);
        assertEquals(0.0, forumStatistics.getAverageCommentsPerUser() , 0.001);
        assertEquals(0.0, forumStatistics.getAverageCommentsPerPost() , 0.001);
    }

    @Test
    void testCalculateAdvStatisticsWhenHundredUsers() {
        //Given
        List<String> usersForumList = generateListUsers(100);
        when(statisticsMock.userNames()).thenReturn(usersForumList);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getQuantityUsers());
        assertEquals(50, forumStatistics.getQuantityPosts());
        assertEquals(100, forumStatistics.getQuantityComments());
        assertEquals(0.5, forumStatistics.getAveragePostsPerUser() , 0.001);
        assertEquals(1.0, forumStatistics.getAverageCommentsPerUser() , 0.001);
        assertEquals(2.0, forumStatistics.getAverageCommentsPerPost() , 0.001);
    }
}
