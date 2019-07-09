class Trie {
    class Node{
        Node[] links;
        boolean bool;
        public Node(){
            links = new Node[26];
            bool = false;
        }
    }
    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node node = root;
        for(char c:word.toCharArray()){
            if(node.links[c-'a'] == null){
                node.links[c-'a'] = new Node();
            }
            node = node.links[c-'a'];
        }
        node.bool = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node node = root;
        for(char c:word.toCharArray()){
            if(node.links[c-'a'] == null){
                return false;
            }
            node = node.links[c-'a'];
        }
        return node.bool == true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node node = root;
        for(char c:prefix.toCharArray()){
            if(node.links[c-'a'] == null){
                return false;
            }
            node = node.links[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */