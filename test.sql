use hr;

-- 1. 모든 사원의 이름을 조회하세요

select concat(first_name,' ',last_name) from employees;

-- 2. 모든 사원의 모든 정보를 조회하세요

select * from employees;

-- 3. 모든 도시명을 조회하세요

select * from locations; 

-- 4. 이름(first_name)이 'M'으로 시작하는 사원의 모든 정보를 조회하세요

select * from employees where first_name like 'M%';

-- 5. 이름(first_name)의 두번째 글자가 'a'인 사원의 이름(first_name)과 연봉을 조회하세요

select first_name AS 이름, salary*12 AS 연봉 from employees where first_name like'_a%';

-- 6. 도시명을 오름차순 하세요 

select city AS 도시명 from locations order by city asc;

-- 7. 부서명을 내림차순 정려하여 조회하세요 

select department_name AS 부서명 from departments order by department_name desc; 

-- 8. 연봉이 7000이상인 사원들의 모든 정보를 연봉순(오름차순)으로 정렬하세요

select * from employees where salary >= 7000;

-- 9. 인센티브(COMMISSION_PCT)를 받지 않는 사원들의 모든 정보를 조회하세요

select * from employees where commission_pct is null;

-- 10. 2007년 06월 21일에 입사한 사원의 사원번호, 이름 , 부서번호를 조회하세요 

select employee_id as 사원번호, concat(first_name, ' ', last_name) AS 이름, department_id As 부서번호 from employees where hire_date = '2007-06-21';

-- 11. 2006년 입사한 사원의 사원번호와 입사일을 조회하세요 

select employee_id as 사원번호, hire_date as 입사일 from employees where hire_date >= '2006-01-01';

-- 12. 이름의 길이가 5글자 이상인 사원을 조회하세요

select concat(first_name,' ',last_name) as 이름 from employees where length(last_name) > 5;

-- 13. 부서별 사원 수를 조회하고 부서번호로 오름차순 정렬하세요

select department_id as 부서번호, count(*) as 부서사원수 from employees group by department_id order by department_id asc;

-- 14. 직무별 평균 연봉을 조회하고 직무아이디로 내림차순 정렬하세요 

select job_title as 직무명, salary*12 as 연봉 from employees, jobs where employees.job_id = jobs.job_id order by jobs.job_id asc; 

-- 15. 상사가 있는 사원들의 모든 정보를 조회하세요 

select * from employees where manager_id is not null;

-- 16. 모든 사원들의 사원번호, 이름, 부서번호, 부서명을 조회하세요 

-- 모든 사원의 사번, 이름, 부서번호, 부서명
select 
  e.employee_id                    AS 사원번호,
  CONCAT(e.first_name, ' ', e.last_name) AS 이름,
  e.department_id                  AS 부서번호,
  d.department_name                AS 부서명
from employees e
join departments d
  on e.department_id = d.department_id
order by e.employee_id;

-- 17. 모든 부서의 부서명과 도시명을 조회하세요 

select department_name as 부서명, city as 도시명 from departments, locations where departments.location_id = locations.location_id;

-- 18. 모든 사원들의 사원번호, 부서명, 직무명(Job_title)을 조회하세요 

select employee_id as 사원번호, department_name as 부서명, job_title as 직무명 from employees, departments, jobs where employees.department_id = departments.department_id and employees.job_id = jobs.job_id;

-- 19. 모든 사원들의 사원번호, 부서명, 직무명, 근무하는 도시명을 조회하세요 

select employee_id as 사원번호, department_name as 부서명, job_title as 직무명, city as 도시명 from employees, departments, jobs, locations 
where employees.department_id = departments.department_id and employees.job_id = jobs.job_id and departments.location_id = locations.location_id;

-- 20. 부서번호가 10,20,30 번 부서에서 근무하는 사원들의 모든 정보를 조회하세요 

select * from employees where department_id = 10 or department_id = 20 or department_id = 30;

-- 21. 4인 미만의 사원이 근무하는 부서의 평균연봉과 부서명을 조회하세요 

-- 4인 미만(1~3명) 사원이 근무하는 부서의 평균연봉과 부서명
select
  d.department_name AS 부서명,
  AVG(e.salary * 12) AS 평균연봉
from employees   e
join departments d
  on e.department_id = d.department_id
group by d.department_id, d.department_name
having COUNT(e.employee_id) < 4;
     
-- 22.  6인 미만의 사원이 근무하는 부서의 이름을 조회하세요 

select
  d.department_name AS 부서명
from employees   e
join departments d
  on e.department_id = d.department_id
group by d.department_id, d.department_name
having COUNT(e.employee_id) < 6;

-- 23. IT 부서의 연봉 총합을 조회하세요 

SELECT d.department_name as 부서명, sum(salary*12) as 연봉총합
from departments d join employees e on d.department_id = e.department_id 
group by d.department_name
having d.department_name = 'IT';

-- 24. REGIONS 별 도시의 개수를 조회하세요 

select region_name as region, count(*) as 개수 from countries c join regions r on c.region_id = r.region_id group by region_name;

-- 25. 도시별 부서의 개수를 조회하세요  

select city as 도시명, count(department_id) as 부서개수 from locations l join departments d on l.location_id = d.location_id group by city ;

-- 26. 연봉이 12000이상이 되는 직원들의 LAST_NAME 및 급여를 조회하세요 

select last_name as 이름, salary as 급여 from employees where salary*12 >= 12000;

-- 27. 사원 번호가 176번인 사람의 LAST_NAME 및 부서명을 조회하세요 

select last_name as 이름, department_name as 부서명 from employees e join departments d on e.department_id = d.department_id where employee_id = 176;

-- 28. 연봉이 5000 에서 12000 의 범위 이외인 사원들의 last_name 과 급여를 조회하세요 

select last_name as 이름, salary as 급여 from employees where not salary >= 5000 and salary <=12000;

-- 29. 직속상사(manager_id)가 없는 사람들의 last_name과 부서명을 조회하세요 

select last_name as 이름, department_name as 부서명 from employees e join departments d on e.department_id = d.department_id where e.manager_id is null;

-- 30. 커미션을 받는 사원들의 이름(full name), 급여, 커미션 내역을 조회하세요 

select concat(first_name,' ',last_name) as 이름, salary as 급여, commission_pct as 커미션 from employees where commission_pct is not null;

-- 1. 부서별 인원수를 출력하세요.

select department_name as 부서명, count(employee_id) as 인원수 from employees e join departments d on e.department_id = d.department_id group by d.department_name;

-- 2. IT 부서에서 일하는 직원의 first_name, last_name, salary 를 이름으로 출력하시요. 출력결과는 salary 가 낮은 사람부터 출력하시요. 

select concat(first_name, ' ', last_name) as 이름, salary as 급여, department_name as 부서명
from employees e join departments d on e.department_id = d.department_id group by d.department_name,employee_id having d.department_name = 'IT';

-- 3. 각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 업무명(job_title), 부서명(department_name)를 조회하시오. 단 도시명(city)이 ‘Seattle’인 지역(location)의 부서(department)에 근무하는 직원만 출력하시오.

select employee_id as 사번, 
first_name as 이름,
job_title as 업무명,
department_name as 부서명
from employees e 
join departments d
on e.department_id = d.department_id
join locations l
on d.location_id = l.location_id
join jobs j
on e.job_id = j.job_id 
where city = 'Seattle';

-- 4. 각 직책 별(job_title)로 급여의 총합을 구하되 직책이 Representative 인 사람은 제외하십시오. 단, 급여 총합이 30000 초과인 직책만 나타내며, 급여 총합에 대한 오름차순으로 정렬하십시오. 출력 결과의 컬럼명은 아래 결과와 동일하게 주십시오.

select sum(salary) from employees e 
join jobs j on e.job_id = j.job_id
where j.job_title not like '%Representative%' 
group by job_title having sum(e.salary) > 30000 order by sum(e.salary) asc;

-- 5. 각 부서 이름 별로 2005년 이전에 입사한 직원들의 인원수를 조회하시오.

select d.department_name as 부서명,count(employee_id) as 인원수 from employees e
join departments d 
on e.department_id = d.department_id
where e.hire_date < '2005-01-01'
group by d.department_name;

-- 5. 사원수가 3명 이상의 사원을 포함하고 있는 부서의 부서번호(department_id), 부서이름(department_name), 사원 수, 최고급여, 최저급여, 평균급여, 급여총액을 조회하여 출력하십시오. 출력 결과는 부서에 속한 사원의 수가 많은 순서로 출력하세요. (평균급여 계산시 소수점 이하는 버리시오)

select d.department_id as 부서번호, 
d.department_name as 부서이름, 
count(e.employee_id) as 사원수, 
max(e.salary) as 최고급여,
min(e.salary) as 최소급여,
format(avg(e.salary),0) as 평균급여,
sum(e.salary) as 급여총액
from employees e
join departments d
on e.department_id = d.department_id
group by d.department_id, d.department_name
HAVING COUNT(e.employee_id) >= 3
order by count(e.employee_id) desc ;

-- 6. Employees 테이블에서 입사일자(hire_date)에 따라 2005년 입사한 직원들 가운데 first_name이 'Lisa'인 직원보다 빨리 입사한 직원의 사번(employee_id), 이름(first_name), 성(last_name), 입사일자(hire_date)를 조회하는 SQL 문장을 서브쿼리로 작성하세요.

select employee_id as 사번, 
concat(first_name,' ',last_name) as 이름 ,
hire_date as 입사일자
from employees 
where hire_date >= '2005-01-01' and hire_date < '2006-01-01' and first_name like 'Lisa';
