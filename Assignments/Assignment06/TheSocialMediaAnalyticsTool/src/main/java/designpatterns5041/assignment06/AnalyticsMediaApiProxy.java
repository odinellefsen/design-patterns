package designpatterns5041.assignment06;

public interface AnalyticsMediaApiProxy {
    String fetchPosts() throws Exception;
    String fetchCommentsByPost(int postId) throws Exception;
}
