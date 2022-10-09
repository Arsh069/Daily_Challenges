class MyCalendarThree {
public:
map<int,int> mp;
MyCalendarThree() {

}

int book(int start, int end) {
   mp[start]++;
   mp[end]--; 
   int count=0,maxi=0;
   for(auto it:mp){
    count+=it.second;
    maxi=max(count,maxi);

   }
   return maxi;
}
};
/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree* obj = new MyCalendarThree();
 * int param_1 = obj->book(start,end);
 */