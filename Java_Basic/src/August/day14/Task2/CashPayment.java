package August.day14.Task2;

public class CashPayment extends Payment{

    private String cashReceiptNumber ;

    public CashPayment(String shopName, String productName, Long productPrice, String cashReceiptNumber) {
        super(shopName, productName, productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }

    public String toString() {
        return "신용카드가 정상적으로 지불되었습니다.\n" +
                "[  신용카드 결제 정보  ] \n"+
                "상점명 : " + shopName + '\n' +
                "상품 명 : " + productName + '\n' +
                "상품 가격 : " + productPrice + '\n'+
                "현금영수증 번호: " + cashReceiptNumber + '\n';
    }

    @Override
    public void pay() throws PayException {
        if(this.productPrice <= 0){
            throw new PayException("가격이 잘못되었습니다.");
        }
    }
}
