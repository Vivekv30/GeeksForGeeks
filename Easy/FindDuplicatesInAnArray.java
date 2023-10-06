//time complexity - O(N)
//space complexity - O(N)

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean duplicates = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                al.add(entry.getKey());
                duplicates = true;
            }
        }

        if (!duplicates)
            al.add(-1);
        else
        Collections.sort(al);
        return al;     
    }
}
