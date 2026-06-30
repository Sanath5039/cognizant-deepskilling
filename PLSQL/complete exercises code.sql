set SERVEROUTPUT on;
BEGIN
    UPDATE  customers 
    set interest_rate=interest_rate*0.99
    where age>60;
end;
/


BEGIN
    UPDATE CUSTOMERS 
    set is_vip='Y'
    where balance>10000;
END;
/

select * from customers;


DECLARE
    C_due_date customers.due_date%type;
    c_name customers.NAME%TYPE;

    CURSOR CUSTOMER_CURSOR
    IS
    select name,due_date from CUSTOMERS
    where due_date between sysdate and sysdate+30;
BEGIN
    open  CUSTOMER_CURSOR;

    LOOP
    fetch CUSTOMER_CURSOR
    into c_name,c_due_date;

    EXIT WHEN CUSTOMER_CURSOR%NOTFOUND;
    
    DBMS_OUTPUT.PUT_LINE('Dear customer '||c_name||' we would like to inform you that your loan payment is due on '||c_due_date);

    END LOOP;
    CLOSE CUSTOMER_CURSOR;
END;
/


DECLARE
    insufficient_balance EXCEPTION;
    balance NUMBER := 500;
BEGIN

    IF balance < 1000 THEN
        RAISE insufficient_balance;
    END IF;

EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Minimum balance required.');
END;
/

create or replace procedure update_sal( c_id IN customers.id%type)
IS

    invalid_id EXCEPTION;
BEGIN

    update customers
    set balance=balance+1000
    where id=c_id;
    if sql%rowcount=0 then
    raise invalid_id;
    end if;
    EXCEPTION
    when invalid_id then 
        DBMS_OUTPUT.PUT_LINE('ID IS NOT FOUND');
END;
/

BEGIN
    update_sal(111);
end;
/

SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE insert_id(
    c_id IN customers.id%TYPE
)
IS
    alreadyExists EXCEPTION;
    v_count NUMBER;
BEGIN

    SELECT COUNT(*)
    INTO v_count
    FROM customers
    WHERE id = c_id;

    IF v_count > 0 THEN
        RAISE alreadyExists;
    END IF;

    INSERT INTO customers
    VALUES (
        c_id,
        'Sanath',
        21,
        0,
        DATE '2026-07-28',
        2,
        'N'
    );

    DBMS_OUTPUT.PUT_LINE('Customer inserted successfully.');

EXCEPTION
    WHEN alreadyExists THEN
        DBMS_OUTPUT.PUT_LINE(
            'A customer with ID ' || c_id || ' already exists.'
        );
END;
/

BEGIN
    insert_id(110);
END;
/