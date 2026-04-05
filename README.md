![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Intermediate JPA

## Introduction

We have just learned how to use JPQL and native SQL statements with Spring JPA to query a database as well as how to model object inheritance and  component objects with JPA so let's practice a bit more.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

1. Model the relationships of a Task Management software using Spring JPA. Assume that you have the following requirements for data storage:

  - Tasks have a `title`, `dueDate` and a boolean `status`.
  - There are 2 types of tasks: `BillableTask` and `InternalTask`.
  - `BillableTask` have an additional `hourlyRate` attribute.

2. Model the relationships of a PR company using Spring JPA. Assume that you have the following requirements for data storage:

  - The database consists of `Contacts`. Each Contact has a `name`, `title` and `company`.
  - Names are their own object and have a `firstName`, `lastName`, `middleName` and `salutation`.
  - Names should be embedded within the `Contact` entity and not be stored in a separate table.

3. Task-3: Native SQL vs JPQL
1. Complex Arithmetic in Aggregate Functions

Task: Calculating the total value of items in an order, such as SUM(price * quantity).

Why Native SQL? JPQL often struggles with arithmetic operations inside aggregate functions, sometimes requiring additional Java DTOs and manual calculation in a loop. Native SQL performs this directly in the database engine, which is much more memory-efficient (RAM) and provides better performance.

2. Utilizing Database-Specific Features

Task: Using advanced features unique to a specific database, like JSON_EXTRACT for handling JSON columns in MySQL or PostgreSQL.

Why Native SQL? JPQL is designed to be "universal," so it doesn't recognize the "superpowers" of specific databases. If you need to leverage high-performance, vendor-specific functions, Native SQL is the only way to access them.

3. Advanced Date Manipulation

Task: Calculating differences between dates or extracting specific parts of a date, like DATEDIFF() or EXTRACT().

Why Native SQL? Handling dates in Java and filtering them through JPQL can sometimes be complex and lead to type mismatches. Native SQL allows you to use the database's built-in date functions to run queries like "users registered in the last 30 days" much faster and with cleaner code.

<br>



</details>
