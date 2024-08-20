
# MySQL Data Types

This document provides a summary of MySQL data types, including their range, description, and size.

## Numeric Data Types

| Data Type          | Description                                 | Size          | Range (Unsigned)                            | Range (Signed)                                 |
|--------------------|---------------------------------------------|---------------|---------------------------------------------|------------------------------------------------|
| **TINYINT**        | Very small integer                          | 1 byte        | 0 to 255                                   | -128 to 127                                    |
| **SMALLINT**       | Small integer                               | 2 bytes       | 0 to 65,535                                | -32,768 to 32,767                              |
| **MEDIUMINT**      | Medium-sized integer                        | 3 bytes       | 0 to 16,777,215                            | -8,388,608 to 8,388,607                        |
| **INT / INTEGER**  | Standard integer                            | 4 bytes       | 0 to 4,294,967,295                         | -2,147,483,648 to 2,147,483,647                |
| **BIGINT**         | Large integer                               | 8 bytes       | 0 to 18,446,744,073,709,551,615            | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| **FLOAT**          | Small floating-point number                 | 4 bytes       | n/a                                         | Approx -3.402823466E+38 to 3.402823466E+38     |
| **DOUBLE**         | Standard floating-point number              | 8 bytes       | n/a                                         | Approx -1.7976931348623157E+308 to 1.7976931348623157E+308 |
| **DECIMAL(M, D)**  | Fixed-point number                          | Varies        | n/a                                         | Depends on M (total digits) and D (decimals)   |

## Date and Time Data Types

| Data Type      | Description                   | Size       | Range                                             |
|----------------|-------------------------------|------------|---------------------------------------------------|
| **DATE**       | Date                          | 3 bytes    | '1000-01-01' to '9999-12-31'                      |
| **DATETIME**   | Date and time                 | 8 bytes    | '1000-01-01 00:00:00' to '9999-12-31 23:59:59'    |
| **TIMESTAMP**  | Timestamp                     | 4 bytes    | '1970-01-01 00:00:01' UTC to '2038-01-19 03:14:07' UTC |
| **TIME**       | Time                          | 3 bytes    | '-838:59:59' to '838:59:59'                       |
| **YEAR**       | Year                          | 1 byte     | 1901 to 2155                                      |

## String Data Types

| Data Type        | Description                         | Size                          | Range                                             |
|------------------|-------------------------------------|-------------------------------|---------------------------------------------------|
| **CHAR(M)**      | Fixed-length string                 | 1 to 255 bytes                | 0 to 255 characters                               |
| **VARCHAR(M)**   | Variable-length string              | 1 byte + string length        | 0 to 65,535 characters                            |
| **BINARY(M)**    | Fixed-length binary string          | 1 to 255 bytes                | 0 to 255 bytes                                    |
| **VARBINARY(M)** | Variable-length binary string       | 1 byte + string length        | 0 to 65,535 bytes                                 |
| **TINYBLOB**     | Tiny binary large object            | Up to 255 bytes               | 0 to 255 bytes                                    |
| **BLOB**         | Binary large object                 | Up to 65,535 bytes            | 0 to 65,535 bytes                                 |
| **MEDIUMBLOB**   | Medium binary large object          | Up to 16,777,215 bytes        | 0 to 16,777,215 bytes                             |
| **LONGBLOB**     | Long binary large object            | Up to 4,294,967,295 bytes     | 0 to 4,294,967,295 bytes                          |
| **TINYTEXT**     | Tiny text string                    | Up to 255 characters          | 0 to 255 characters                               |
| **TEXT**         | Text string                         | Up to 65,535 characters       | 0 to 65,535 characters                            |
| **MEDIUMTEXT**   | Medium text string                  | Up to 16,777,215 characters   | 0 to 16,777,215 characters                        |
| **LONGTEXT**     | Long text string                    | Up to 4,294,967,295 characters| 0 to 4,294,967,295 characters                     |
| **ENUM**         | Enumeration, string object with a value chosen from a list of permitted values | 1 or 2 bytes (depending on number of elements) | Up to 65,535 values |
| **SET**          | A string object that can have zero or more values, each of which must be chosen from a list of permitted values | 1, 2, 3, 4, or 8 bytes (depending on number of elements) | Up to 64 distinct members |

## Spatial Data Types

| Data Type        | Description                         | Size         |
|------------------|-------------------------------------|--------------|
| **GEOMETRY**     | A type that stores geometry data    | Varies       |
| **POINT**        | A point in 2D space                 | 25 bytes     |
| **LINESTRING**   | A sequence of points forming a line | Varies       |
| **POLYGON**      | A polygon                           | Varies       |
| **MULTIPOINT**   | A collection of POINT objects       | Varies       |
| **MULTILINESTRING** | A collection of LINESTRING objects | Varies    |
| **MULTIPOLYGON** | A collection of POLYGON objects     | Varies       |
| **GEOMETRYCOLLECTION** | A collection of geometry objects of any type | Varies |

