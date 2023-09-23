//time complexity = O(n*log(n))
//space complexity= O(n)

class Solution
{
    void sortRecords(node arr[], int n) {
        // Your code goes here
        quickSort(arr, 0, n - 1);
    }

    void quickSort(node arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
    }

    int partition(node arr[], int low, int high) {
        node pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i].salary < pivot.salary || (arr[i].salary == pivot.salary && arr[i].name.compareTo(pivot.name) < 0));

            do {
                j--;
            } while (arr[j].salary > pivot.salary || (arr[j].salary == pivot.salary && arr[j].name.compareTo(pivot.name) > 0));

            if (i >= j) {
                return j;
            }

            swap(arr, i, j);
        }
    }

    void swap(node arr[], int i, int j) {
        node temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
