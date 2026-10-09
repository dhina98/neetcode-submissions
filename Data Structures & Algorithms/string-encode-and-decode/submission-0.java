class Solution {
    public String encode(List<String> strs) {
        List<Integer> sizes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sizes.add(s.length());
        }
        for (int size : sizes) {
            sb.append(size).append(',');
        }
        sb.append("#");
        for (String s : strs) {
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        // String = 5,5,#HelloWorld
        if(str.length()==0){
            return new ArrayList<>();
        }
        List<String> resp = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (str.charAt(i) != '#') {
            sb.setLength(0);
            while (str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(sb.toString())); 
            i++;          
        }
        i++;
        for(int sz :sizes){
            resp.add(str.substring(i, i+sz));
            i += sz;
        }
        System.out.println(sizes);
        return resp;
    }
}
