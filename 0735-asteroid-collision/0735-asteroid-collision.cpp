class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> stack;

        for(int i=0; i<asteroids.size(); i++){
            int asteroid = asteroids[i];
            bool destroyed = false;

            while(!stack.empty() && stack.top() > 0 && asteroid < 0){
                if(stack.top() > abs(asteroid)){
                    destroyed = true;
                    break;
                }else if(stack.top() == abs(asteroid)){
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else{
                    stack.pop();
                }
            }

            if(!destroyed) stack.push(asteroid);
        }

        vector<int> result(stack.size());
        for(int i=result.size()-1; i>=0; i--){
            int num = stack.top();
            result[i] = num;
            stack.pop();
        }

        return result;
    }
};