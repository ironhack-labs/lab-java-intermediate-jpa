package Ironhack.schl.Lab3_06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab306Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab306Application.class, args);
	}

}

/*

		1. Complex calculations or aggregations: JPQL provides limited support for complex calculations or aggregations,
		 such as calculating averages, sums, or grouping data. Native SQL allows you to perform these calculations using
		  SQL functions and operators, providing more flexibility and efficiency.

		2. Accessing stored procedures or functions: JPQL does not support calling stored procedures or functions
		directly. Native SQL allows you to execute stored procedures or functions using SQL syntax, providing a more
		direct and efficient way to interact with the database.

		3. Handling large result sets: JPQL fetches all the data from the database and loads it into memory, which can
		be inefficient for large results. Native SQL lets you fetch and process data in chunks, reducing memory usage
		and improving performance.

*/