class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        int result[] = new int[asteroids.length];
        int idx=0;
        result[idx++]=asteroids[0];

        for(int i=1; i<asteroids.length; i++){
            if((result[idx-1]>0 && asteroids[i]>0) || (result[idx-1]<0 && asteroids[i]<0)){
                result[idx++]=asteroids[i];
            }
            else if(result[idx-1]>0 && asteroids[i]<0){
                if(Math.abs(result[idx-1])==Math.abs(asteroids[i])){
                    idx--;
                }
                else if(Math.abs(result[idx-1])>Math.abs(asteroids[i])){
                    continue;
                }
                else {
                    while(idx>0){
                        if((result[idx-1]>0 && asteroids[i]>0) || (result[idx-1]<0 &&   asteroids[i]<0)){
                            result[idx++]=asteroids[i];
                        }
                        else if(result[idx-1]>0 && asteroids[i]<0){
                            if(Math.abs(result[idx-1])==Math.abs(asteroids[i])){
                                idx--;
                            }
                            else if(Math.abs(result[idx-1])>Math.abs(asteroids[i])){
                                continue;
                            } else{
                                result[idx-1]=asteroids[i];
                            }
                    }
                
            }
        }
        int[] r = new int[idx];
        for(int i=0; i<idx; i++){
            r[i] = result[i];
        }
        return r ;
    }
}