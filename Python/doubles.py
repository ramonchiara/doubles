p = 0.1

limit = 10
while limit <= 100000000:
    s = 0
    for i in range(0, limit):
        s += p
    print(f'limit: {limit:9d} --> {s:15f}')
    limit *= 10
