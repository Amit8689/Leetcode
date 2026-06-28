class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk=0;
        int empty=0;
        // numBottles is the no. of full bottle and numExchange is the number of exhange
        // for(int i=0;i<numExchange;i++)
        while(numBottles>0){
            drunk = drunk+numBottles;
            empty = empty+numBottles;
            numBottles=empty/numExchange;
            empty = empty % numExchange;        // leftover empties
        }
        return drunk;
    }
}