package nyc.c4q.ac21.ac20150322;

import java.net.URL;

/**
 * Created by samuel on 2015-03-22.
 */
public class UrlExample {
    public static URL makeHttpUrl(String host, int port, String path) {
        String url = "http://" + host;
        if (port != 80)
            url += ":" + port;
        url += path;
        return HTTP.stringToURL(url);
    }

    public static URL makeHttpUrl(String host, String path) {
        return makeHttpUrl(host, 80, path);
    }

    public static void printURL(URL url) {
        System.out.println("protocol = " + url.getProtocol());
        System.out.println("host     = " + url.getHost());
        System.out.println("port     = " + url.getPort());
        System.out.println("path     = " + url.getPath());
    }

    public static void main(String[] args) {
        URL url = makeHttpUrl("github.com", "/accesscode-2-1/unit-0");
        System.out.println(url);
        printURL(url);
    }
}
