package designpatterns5041.assignment06;

public class Main {
    public static void main(String[] args) {
        // To test caching, we use the CachedAnalyticsMediaApiProxy which wraps the remote proxy.
        AnalyticsMediaApiProxy apiProxy = new CachedAnalyticsMediaApiProxy(
                new JSONPlaceholderAPIProxy(new SimpleHttpClient())
        );

        try {
            System.out.println("Fetching posts for the first time...");
            String posts = apiProxy.fetchPosts();
            System.out.println(posts.substring(0, 100));
            
            System.out.println("Fetching posts for the second time...");
            String posts2 = apiProxy.fetchPosts();
            System.out.println(posts2.substring(0, 100));
            
            System.out.println("\nFetching comments for post 1...");
            String comments = apiProxy.fetchCommentsByPost(1);
            System.out.println(comments.substring(0, 100));
            
            System.out.println("\nFetching comments for post 1 again...");
            String comments2 = apiProxy.fetchCommentsByPost(1);
            System.out.println(comments2.substring(0, 100));
        } catch (Exception e) {
            System.err.println("Error fetching data: " + e.getMessage());
        }
    }
}
