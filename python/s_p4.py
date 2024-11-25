def binary_sarch(ele):
    mid = 0
    low = 0
    high = 9
    arr = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
    while high >= low:
        mid = (low + high) // 2
        if arr[mid] == ele:
            print("element is find ", ele)
            return
        elif arr[mid] > ele:
            high = mid - 1
        else:
            low = mid + 1
    if high < low:
        print("element is not found", ele)


ele = int(input("Enter element you want to search:"))
binary_sarch(ele)
