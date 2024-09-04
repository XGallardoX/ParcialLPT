import time

start_time = time.time()

total_sum = sum(range(1, 1000000001))

end_time = time.time()
elapsed_time = end_time - start_time

print(f"Sum: {total_sum}")
print(f"Elapsed time: {elapsed_time:.2f} seconds")
