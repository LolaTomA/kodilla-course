package com.kodilla.testing.statistics;

        import com.kodilla.testing.forum.statistics.ForumStatistics;
        import com.kodilla.testing.forum.statistics.Statistics;
        import org.junit.*;

        import java.util.ArrayList;
        import java.util.List;

        import static org.mockito.Mockito.mock;
        import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;
    private List<String> generateUsers(int i) {
        List<String> users = new ArrayList<>();
        for (int n = 0; n<i; n++){
            users.add("Bolek"+ n);
        }
        return users;
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testCalculateAdvStatisticsWhenPostCountIs0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersNumber());
        Assert.assertEquals(0, forumStatistics.getPostsNumber());
        Assert.assertEquals(1000, forumStatistics.getCommentsNumber());
        Assert.assertEquals(0.0, forumStatistics.getAvgPostPerUser(),0.001);
        Assert.assertEquals(10.0, forumStatistics.getAvgCommentPerUser(),0.001);
        Assert.assertEquals(0.0, forumStatistics.getAvgCommentPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenPostCountIs1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersNumber());
        Assert.assertEquals(1000, forumStatistics.getPostsNumber());
        Assert.assertEquals(1000, forumStatistics.getCommentsNumber());
        Assert.assertEquals(10.0, forumStatistics.getAvgPostPerUser(),0.001);
        Assert.assertEquals(10.0, forumStatistics.getAvgCommentPerUser(),0.001);
        Assert.assertEquals(1.0, forumStatistics.getAvgCommentPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentCountIs0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersNumber());
        Assert.assertEquals(1000, forumStatistics.getPostsNumber());
        Assert.assertEquals(0, forumStatistics.getCommentsNumber());
        Assert.assertEquals(10.0, forumStatistics.getAvgPostPerUser(),0.001);
        Assert.assertEquals(0.0, forumStatistics.getAvgCommentPerUser(),0.001);
        Assert.assertEquals(0.0, forumStatistics.getAvgCommentPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentCountIsLowerThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersNumber());
        Assert.assertEquals(1000, forumStatistics.getPostsNumber());
        Assert.assertEquals(100, forumStatistics.getCommentsNumber());
        Assert.assertEquals(10.0, forumStatistics.getAvgPostPerUser(),0.001);
        Assert.assertEquals(1.0, forumStatistics.getAvgCommentPerUser(),0.001);
        Assert.assertEquals(0.1, forumStatistics.getAvgCommentPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentCountIsHigherThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10000);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersNumber());
        Assert.assertEquals(1000, forumStatistics.getPostsNumber());
        Assert.assertEquals(10000, forumStatistics.getCommentsNumber());
        Assert.assertEquals(10.0, forumStatistics.getAvgPostPerUser(),0.001);
        Assert.assertEquals(100.0, forumStatistics.getAvgCommentPerUser(),0.001);
        Assert.assertEquals(10.0, forumStatistics.getAvgCommentPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenUsersCountIs0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(generateUsers(0));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getUsersNumber());
        Assert.assertEquals(1000, forumStatistics.getPostsNumber());
        Assert.assertEquals(1000, forumStatistics.getCommentsNumber());
        Assert.assertEquals(0.0, forumStatistics.getAvgPostPerUser(),0.001);
        Assert.assertEquals(0.0, forumStatistics.getAvgCommentPerUser(),0.001);
        Assert.assertEquals(0.0, forumStatistics.getAvgCommentPerPost(),0.001);
    }
    // Test when there is 100 users is already done in previous cases.
    @Test
    public void showStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(generateUsers(110));
        when(statisticsMock.postsCount()).thenReturn(1100);
        when(statisticsMock.commentsCount()).thenReturn(11000);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics() ;
    }
}
