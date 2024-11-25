import academicmodule as record
record.add_course("Math", 5, 3.5)
record.add_course("Science", 5, 4.0)
record.print_record()
print("\nCurrent CGPA:  ",record.calculate_cgpa())
record.drop_course("Math")
record.print_record()
print("Current CGPA: {}".format(record.calculate_cgpa()))