TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.

There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

Implement the Solution class:
```
Solution() Initializes the object of the system.
String encode(String longUrl) Returns a tiny URL for the given longUrl.
String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.
```
public class Codec {
    Map<Integer, String> map = new HashMap<>();
    int i = 0;
    
    // Encodes a URL to a shortened URL
    public String encode(String longUrl){
        map.put(i, longUrl);
        return "http://tinyurl.com/" + i ++;
    }
     
     // Decodes a shortened URL to its original URL
     public String decode(String shortedUrl){
        return 
        map.get(Integer.parseInt(shortenedUrl.replace("http://tinyurl.com/", "")));
     }
}

TC: O(N)
SC: O(N)

Link: https://leetcode.com/problems/encode-and-decode-tinyurl/
