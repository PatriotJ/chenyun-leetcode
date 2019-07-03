public class Codec {

    Map<Integer,String> map = new HashMap();
    String prefix = "http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int code = longUrl.hashCode();
        String shortUrl = prefix + code;
        map.put(shortUrl.hashCode(),longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl.hashCode());
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));