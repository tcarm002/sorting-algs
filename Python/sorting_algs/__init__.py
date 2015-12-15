import selection_sort

def main():
    unsorted = [9,98,0,2,3,1,5,9,1]

    sorted = selection_sort.Selection_Sort().selection_sort(unsorted)

    print sorted

if __name__ == '__main__': main()

