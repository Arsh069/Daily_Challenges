// Problem Link - https://leetcode.com/problems/decode-ways/

#define ll int

class Solution {
public:
    int numDecodings(string s) {
        vector<ll> dp(s.length(),0);
        if(s[0]=='0')
            return 0;
        dp[0] = 1; 
        for(ll i=1;i<s.length();i++)
        {
            if(s[i-1]=='0' and s[i]=='0')
            {
                dp[i] = 0;    
            }
            else if(s[i-1]!='0' and s[i]=='0')
            {
                if(s[i-1]=='1' or s[i-1]=='2')
                {
                    dp[i] = i-2>=0?dp[i-2]:1;
                }
            } 
            else if(s[i-1]=='0' and s[i]!='0')
            {
                dp[i] = dp[i-1];
            }
            else
            {
                dp[i] = dp[i-1];
                ll num = stoi(s.substr(i-1,2));
                if(num<=26)
                {
                    dp[i] += i-2>=0?dp[i-2]:1;
                }
            }
        }
        return dp[s.length()-1];
    }
};