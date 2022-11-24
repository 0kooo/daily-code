package Text1;

import java.util.HashMap;
import java.util.Map;

class AuthenticationManager {
    Map<String, Integer> timeMap = new HashMap<>();
    int timeToLive = 0;
    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        timeMap.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if(timeMap.containsKey(tokenId)){
            if(timeMap.get(tokenId) > currentTime){
                timeMap.put(tokenId, currentTime + timeToLive);
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int cnt = 0;
        for (var entry : timeMap.entrySet()) {
            if(entry.getValue() > currentTime){
                cnt++;
            }
        }
        return cnt;
    }
}
