package designpatterns5041.assignment06;

import java.util.HashMap;
import java.util.Map;

public class CachedAnalyticsMediaApiProxy implements AnalyticsMediaApiProxy {
    private final AnalyticsMediaApiProxy remoteApi;
    private String postsCache = null;
    private final Map<Integer, String> commentsCache = new HashMap<>();

    public CachedAnalyticsMediaApiProxy(AnalyticsMediaApiProxy remoteApi) {
        this.remoteApi = remoteApi;
    }

    @Override
    public String fetchPosts() throws Exception {
        if (postsCache == null) {
            postsCache = remoteApi.fetchPosts();
        } else {
            // Indicate that we are using the cached value.
            System.out.println("Returning cached posts");
        }
        return postsCache;
    }

    @Override
    public String fetchCommentsByPost(int postId) throws Exception {
        if (!commentsCache.containsKey(postId)) {
            String comments = remoteApi.fetchCommentsByPost(postId);
            commentsCache.put(postId, comments);
        } else {
            System.out.println("Returning cached comments for post " + postId);
        }
        return commentsCache.get(postId);
    }
}
