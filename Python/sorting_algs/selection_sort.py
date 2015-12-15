class Selection_Sort():

    def selection_sort(self, A):
        for i in xrange(0,len(A)):
            min = i

            for j in xrange(i, len(A)):
                if A[j] < A[min]:
                    min = j

            if min != i:
                A = self.swap(A, i, min)

        return A

    def swap(self, A, x, y):
        temp = A[x]
        A[x] = A[y]
        A[y] = temp
        return A