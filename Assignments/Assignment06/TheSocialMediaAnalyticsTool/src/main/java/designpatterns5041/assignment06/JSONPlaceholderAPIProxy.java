package designpatterns5041.assignment06;

public class JSONPlaceholderAPIProxy implements AnalyticsMediaApiProxy {
    private final SimpleHttpClient httpClient;

    public JSONPlaceholderAPIProxy(SimpleHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public String fetchPosts() throws Exception {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return httpClient.get(url);
    }

    @Override
    public String fetchCommentsByPost(int postId) throws Exception {
        String url = "https://jsonplaceholder.typicode.com/posts/" + postId + "/comments";
        return httpClient.get(url);
    }
}
