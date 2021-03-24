package sec06.exam01;

public class Test1Algo {
	int n = 7;  //생산량과 주문량이 주어지는 날의수
	// int[] p = new int[n]; // 일일 생산량
    int[] p = { 6,2,1,0,2,4,3 };
	// int[] c = new int[n]; //일일 주문량
    int[] c = { 3,6,6,2,3,7,6 };

    int day = -1;
    int amount = 0; //재고
    int cash = 0; //매출액
    
    public int Algorithm(int price){
    	day++;
    	if(day == 6) {
    		return 0;
    	}
        amount += p[day]; //재고에 일일생산량을 더함

        if(price != 12.5 || day != n){
            if(amount < c[day]){ // 재고가 주문량보다 적을때 (거래에 실패했을때)
                price /= 2;
            } else{ // 거래성사될때
                amount -= c[day]; //재고에서 일일 주문량을 뺌
                cash += price * c[day];
                price = 100;
            } Algorithm(price);
        } return cash/day;
        
    }
}
