use bookmarketdb;

-- 조인연산의 특별한 경우로 외부조인(Outer join)
-- 고객이름과 고객이 주문한 도서의 판매가격을 구하는 것은 동등조인으로 조회할 수 있다.
-- 하지만 도서를 주문하지 않은 고객 '박세리' 결과에 포함되지 않는다.
-- 만약에 도서를 구매하지 않은 고객인 '박세리'까지 포함하여 고객명단과 판매가격을 구하려면 외부조인을 해야한다.

SELECT * from customer, orders;

-- 고객의이름과고객이주문한도서의판매가격을검색하시오.

-- 여러 개의 에티블을 연결하여 하나의 테이블을 만드는 과정을 테ㅔ이블 조인이라고 한다
-- 동등연산자 *=) 조건에ㅔ 의하여 테ㅔ이블을 조인하는 것을 동등조인(equi join) 이라고 한다
SELECT name, saleprice 
from customer, orders
where customer.custid = orders.custid;

-- 고객별로 주문한 모든 도서의 총판매액을 구하고, 고격별로 정렬하시오
SELECT sum(saleprice) from orders, customer where customer.custid = orders.custid group by customer.name order by customer.name desc;

-- 고객의 이름과 고객이 주문한 도서의 이름을 조회하시오
select name AS 고객이름 , bookname AS 주문도서이름 from customer, orders, book where customer.custid = orders.custid and orders.bookid = book.bookid;

-- 조인 문제ㅔ

-- 고객별 주문 상세정보를 출력하시오(이름, 책, 가격, 날짜)
SELECT name AS 이름, bookname AS 책, price AS 가격, orderdate AS 날짜
from book, customer, orders where customer.custid = orders.custid and orders.bookid = book.bookid;

-- '대한미디어' 출판 도서의; 주문 내역을 출력하시오
SELECT name AS 이름, bookname AS 책, price AS 가격, orderdate AS 날짜 from book, orders, customer where customer.custid = orders.custid and orders.bookid = book.bookid and book.publisher = '대한미디어';

### 1) 고객별 주문 상세정보를 출력하시오 (이름, 책, 구매가격, 구매날짜)
SELECT  c.name, b.bookname, o.saleprice, o.orderdate
FROM orders o, customer c, book b
WHERE o.custid = c.custid and o.bookid = b.bookid;
SELECT  c.name, b.bookname, o.saleprice, o.orderdate
FROM  Orders o
	  JOIN customer c  ON  o.custid = c.custid
      JOIN book b ON o.bookid = b.bookid;
### 2) ‘대한미디어’ 출판 도서의 주문 내역을 출력하시오
select publisher ,bookname  from book;
SELECT c.name, b.bookname, o.saleprice, o.orderdate, b.publisher
FROM orders o, book b, customer c
WHERE o.custid = c.custid and b.bookid = o.bookid and b.publisher ='대한미디어';
SELECT c.name, b.bookname, o.saleprice, o.orderdate, b.publisher
FROM orders o
     join customer c on o.custid = c.custid
     join book b on b.bookid = o.bookid
where b.publisher ='대한미디어';



-- 고객별 총 주문 금액을 출력하고 가장 높은 많이 구매한 고객순으로 출력하시오
SELECT name AS 고객, sum(saleprice) AS '총 주문금액' from orders, customer where customer.custid = orders.custid group by customer.name order by sum(saleprice) desc;

-- 2권 이상 주문한 고객의  이름과 고객별 주문건수를 출력하시오
SELECT name AS 이름, count(*) AS 주문건수 from customer, orders where customer.custid = orders.custid group by customer.name having count(customer.name) > 2;

### 5) 주문 내역이 없는 고객는 고객의 이름을 출력하시오.
-- 주문 이력이 전혀 없는 고객의 이름
SELECT c.name AS 이름
FROM customer AS c
LEFT JOIN orders AS o
  ON c.custid = o.custid
WHERE o.custid IS NULL;   -- 매칭이 없으면 조인된 o.* 가 NULL

### 6) 한 번도 주문되지 않은 도서의 아이디와 도서명을 출력하시오

### 7) 고객별 ‘첫 주문’(최소 주문일) 도서의 이름과  고객명, 주문일을 출력하시오.

### 8) 고객별 ‘마지막 주문’(최대 주문일) 도서의 이름과 고객명, 주문일을 출력하시오.

### 9) 도서를 구매한 고객별  평균 판매가격(소수 2자리)을 출력하시오 (출력시 평균가격이 높은 순으로)

### 10) 출판사별 총 매출금액을 출력하시오. (출력시 총매출액이 높은 출판사순으로)

### 11) 가장 많이 팔린 도서(권수 기준)의 도서명과 건수를 출력하시오.(출력시 건수가 높은 순, 만약 건수가 같다면 도서명순으로)

### 12) 일자별 매출 합계를 출력하시오

### 13) ‘이상미디어’ 책을 구매한 고객과 도서명을 출력하시오

### 14) 정가 대비 할인(판매가 < 정가) 주문 내역과 할인율을 출력하시오 (출력시 소수첫째자리까지 표시)

### 15) 서로 다른 출판사 책을 2개 이상 구매한 고객의 이름과 구매건수를 출력하시오 (출력시 구매건수가 높은순으로 출력하되 건수가 같다면 고객명 순으로 오름차순)

### 16) 출판사별 정가 평균 vs 판매가 평균 을 출력하시오

### 17) ‘Pearson’ 출판 도서를 구매한 고객과 날짜를 출력하시오

### 18) 정가가 20,000원 이상인 도서의 구매 내역

### 19) 도서별 총 매출 TOP 3 의 도서명과 매출액을 출력하시오


## 두 질의를 한번에 작성할 수는 없을까?
SELECT bookname
FROM book
WHERE price = (SELECT max(price)FROM book);
## SELECT문의 WHERE 절에 또는 다른 테이블의 결과를 이용하기 위해서
## 다시 SELECT문을 괄호로 묶어서 부속질의의 결과를 넘겨주는 방식
## 질의가 중첩질의 nested query 라고도 한다.
## 결과테이블의 반환형태
## 단일행 - 단일열(1x1)  다중행-단일열 (nx1)  단일행 -다중열(1xn)  다중행 - 다중열 (nxn)
## 3-29 도서를 구매한 적이 있는 고객의 이름을 조회하시오
SELECT distinct custid
FROM orders;
SELECT name
FROM customer
where custid in(1,2,3,4);
SELECT name
FROM customer
where custid in (SELECT distinct custid
FROM orders);
SELECT name
FROM customer
WHERE custid in(
      SELECT custid FROM orders
              WHERE bookid  in(
                           SELECT bookid from book where publisher ='대한미디어'
              )
);
select  publisher from book  group by publisher;
select count(distinct publisher) from book;
select bookname, price from book where publisher = '굿스포츠';
select avg(price) from book where publisher = '굿스포츠';
-- 튜블변수 : 테이블이름이 길거나, 같거나(두번이상 사용해야 하는 경우) 테이블 별칭을 사용하여 충동을 피하면서 가독성을 높이고 간결히 쿼리를 작성한다.
SELECT b1.bookname,b1.publisher
FROM book b1
WHERE b1.price > (
      SELECT avg(b2.price)
	  FROM book b2
      WHERE b2.publisher = b1.publisher
);
## 부속질의와 조인은 여러 테이블을 하나의 SQL에서 다룬다는 점은 유사하나
## 차이점 1. 조인에서는 SELECT문에 나오는 결과 속성을 FROM 절의 테이블에서만 얻을 수있다.
##      2.  한 개의 테이블에서만 얻은 여러 테이블 질의는 조인보다 부속질의로 작성하는것이 편하다.


select avg(price) from book where publisher= '굿스포츠';





