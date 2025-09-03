use hr;

-- [문제 1] 사원정보(EMPLOYEE) 테이블에서 사원번호, 이름, 급여, 업무, 입사일, 상사의 사원번호를 출력하시오. 이때 이름은 성과 이름을 연결하여 Name이라는 별칭으로 출력하시오 
-- 결과(107행)
SELECT employee_id AS '사원 번호', 
concat(first_name,' ',last_name) AS NAME, 
salary AS 급여,
job_id AS 업무,
hire_date AS 입사일,
manager_id AS '상사 사원번호'
from employees;

-- [문제 2] 사원정보(EMPLOYEES) 테이블에서 사원의 성과 이름은 Name, 업무는 Job, 급여는 Salary, 연봉에 $100 보너스를 추가하여 
-- 계산한 값은 Increased Ann_Salary, 급여에 $100 보너스를 추가하여 계산한 연봉은 “Increased Salary”라는 별칭으로 출력하시오(107행).
select concat(first_name, ' ', last_name) AS NAME,
job_id AS job,
salary AS Salary,
12 * salary + 100 AS 'Increased Ann_Salary',
(salary+ 100) * 12 AS 'Increased Salary'
from employees;

-- 사원정보(EMPLOYEE) 테이블에서 모든 사원의 이름(last_name)과 연봉을 “이름: 1Year Salary = $연봉” 형식으로 출력하고, “1 Year Salary”라는 별칭을 붙여 출력하시오(107

SELECT 
concat('이름: ',last_name, ', 1 Year Salary = $', salary * 12) AS '1 Year Salary'
from employees;

-- [문제 4] 부서별로 담당하는 업무를 한 번씩만 출력하시오(20행).
select distinct department_id, job_id from employees;

-- [문제 5] HR 부서에서 예산 편성 문제로 급여 정보 보고서를 작성하려고 한다. 사원정보(EMPLOYEES) 테이블에서 급여가
-- $7,000~$10,000 범위 이외인 사람의 성과 이름(Name으로
-- 별칭) 및 급여를 급여가 작은 순서로 출력하시오(75행).
select concat(first_name, ' ', last_name) AS NAME from employees where salary not between 7000 and 10000 order by salary ASC;

-- [문제 6] 사원의 이름(last_name) 중에 ‘e’ 및 ‘o’ 글자가 포함된 사원을 출력하시오. 이때 머리글은 ‘e and o Name’라고 출력하시오(10행).
SELECT 
concat(first_name, ' ' , last_name) AS 'e and o Name'
from employees where last_name like '%e%' and last_name like '%o%';

-- [문제 7] 현재 날짜 타입을 날짜 함수를 통해 확인하고, 1995년 05월 20일부터 1996년 05월
-- 20일 사이에 고용된 사원들의 성과 이름(Name으로 별칭), 사원번호, 고용일자를 출력하시오. 단, 입사일이 빠른 순으로 정렬하시오(8행).

SELECT last_name AS NAME, employee_id, hire_date
from employees 
where hire_date 
between str_to_date('1995/05/20','%Y/%m/%d') and  str_to_date('1996/05/20','%Y/%m/%d') 
order by hire_date ASC;


-- 급여(salary)와 수당율(commission_pct)에 대한 지출 보고서를 작성하려고 한다. 이에 수당을 받는 모든 사원의 
-- 성과 이름(Name으로 별칭), 급여, 업무, 수당율을 출력하시오. 이때 급여가 큰 순서대로 정렬하되, 급여가 같으면 수당율이 큰 순서대로 정렬하시오(35행).

SELECT 
concat(first_name, ' ', last_name) AS NAME,
salary, job_id, commission_pct
from employees where commission_pct is not NULL order by salary DESC, commission_pct DESC;
