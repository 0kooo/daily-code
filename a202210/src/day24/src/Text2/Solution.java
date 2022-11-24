package Text2;

class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int len = command.length();
        int index = 0;
        while(index < len){
            if(command.charAt(index) == 'G'){
                sb.append(command.charAt(index));
                index++;
            } else if(command.charAt(index) == '('){
                if(command.charAt(index + 1) == ')'){
                    index += 2;
                    sb.append("o");
                }else{
                    sb.append("al");
                    index += 4;
                }
            }
        }
        return sb.toString();
    }
}
