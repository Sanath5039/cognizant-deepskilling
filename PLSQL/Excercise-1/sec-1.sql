set SERVEROUTPUT on;
BEGIN
    UPDATE  customers 
    set interest_rate=interest_rate*0.99
    where age>60;
end;
/

select * from customers;