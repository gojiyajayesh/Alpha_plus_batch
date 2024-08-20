
# MySQL `ALTER TABLE` Statement

The `ALTER TABLE` statement in MySQL is used to modify an existing table. You can use it to add, delete, or modify columns, as well as to change the table's structure in other ways.

## 1. Add a Column

You can add a new column to an existing table.

```sql
ALTER TABLE table_name
ADD COLUMN column_name column_definition;
```

**Example**:
```sql
ALTER TABLE employees
ADD COLUMN birthdate DATE;
```

## 2. Drop a Column

You can remove a column from a table.

```sql
ALTER TABLE table_name
DROP COLUMN column_name;
```

**Example**:
```sql
ALTER TABLE employees
DROP COLUMN birthdate;
```

## 3. Modify a Column

You can modify the definition of an existing column.

```sql
ALTER TABLE table_name
MODIFY COLUMN column_name new_column_definition;
```

**Example**:
```sql
ALTER TABLE employees
MODIFY COLUMN birthdate DATETIME;
```

## 4. Rename a Column

You can rename an existing column.

```sql
ALTER TABLE table_name
CHANGE COLUMN old_column_name new_column_name new_column_definition;
```

**Example**:
```sql
ALTER TABLE employees
CHANGE COLUMN birthdate dob DATE;
```

## 5. Rename the Table

You can rename an entire table.

```sql
ALTER TABLE old_table_name
RENAME TO new_table_name;
```

**Example**:
```sql
ALTER TABLE employees
RENAME TO staff;
```

## 6. Add a Primary Key

You can add a primary key to a table.

```sql
ALTER TABLE table_name
ADD PRIMARY KEY (column_name);
```

**Example**:
```sql
ALTER TABLE employees
ADD PRIMARY KEY (employee_id);
```

## 7. Drop a Primary Key

You can remove a primary key from a table.

```sql
ALTER TABLE table_name
DROP PRIMARY KEY;
```

**Example**:
```sql
ALTER TABLE employees
DROP PRIMARY KEY;
```

## 8. Add a Foreign Key

You can add a foreign key constraint to a table.

```sql
ALTER TABLE table_name
ADD CONSTRAINT fk_name
FOREIGN KEY (column_name)
REFERENCES parent_table(column_name);
```

**Example**:
```sql
ALTER TABLE orders
ADD CONSTRAINT fk_customer
FOREIGN KEY (customer_id)
REFERENCES customers(customer_id);
```

## 9. Drop a Foreign Key

You can remove a foreign key constraint from a table.

```sql
ALTER TABLE table_name
DROP FOREIGN KEY fk_name;
```

**Example**:
```sql
ALTER TABLE orders
DROP FOREIGN KEY fk_customer;
```

## 10. Add an Index

You can add an index to a table to improve query performance.

```sql
ALTER TABLE table_name
ADD INDEX index_name (column_name);
```

**Example**:
```sql
ALTER TABLE employees
ADD INDEX idx_name (last_name);
```

## 11. Drop an Index

You can remove an index from a table.

```sql
ALTER TABLE table_name
DROP INDEX index_name;
```

**Example**:
```sql
ALTER TABLE employees
DROP INDEX idx_name;
```

## 12. Add or Drop a Unique Constraint

You can enforce or remove uniqueness on a column.

### Add Unique Constraint:
```sql
ALTER TABLE table_name
ADD UNIQUE (column_name);
```

**Example**:
```sql
ALTER TABLE employees
ADD UNIQUE (email);
```

### Drop Unique Constraint:
```sql
ALTER TABLE table_name
DROP INDEX index_name;
```

**Example**:
```sql
ALTER TABLE employees
DROP INDEX email;
```

## 13. Change Column Data Type

You can change the data type of a column.

```sql
ALTER TABLE table_name
MODIFY COLUMN column_name new_data_type;
```

**Example**:
```sql
ALTER TABLE employees
MODIFY COLUMN salary DECIMAL(10, 2);
```

## 14. Change Default Value

You can change the default value for a column.

```sql
ALTER TABLE table_name
ALTER COLUMN column_name
SET DEFAULT default_value;
```

**Example**:
```sql
ALTER TABLE employees
ALTER COLUMN status
SET DEFAULT 'active';
```

## 15. Remove Default Value

You can remove the default value for a column.

```sql
ALTER TABLE table_name
ALTER COLUMN column_name
DROP DEFAULT;
```

**Example**:
```sql
ALTER TABLE employees
ALTER COLUMN status
DROP DEFAULT;
```

This document provides a comprehensive overview of the `ALTER TABLE` statement in MySQL and its various uses for modifying tables.
