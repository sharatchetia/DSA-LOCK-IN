//leet question not learned. just copied it to maintain streak. i will be taking a break tommorrow as my brain is not functioning well and not feeling motivated enough. also will be pastin another code for tommorrow without learning
// tried to learn linked list but wasnt able to learn because of fatigue

// count this as tommorrows file as well


class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++){

            int current = map.get(s.charAt(i));

            if(i < s.length()-1){

                int next = map.get(s.charAt(i+1));

                if(current < next){
                    sum -= current;
                }else{
                    sum += current;
                }

            }else{
                sum += current;
            }

        }

        return sum;
    }
}     



