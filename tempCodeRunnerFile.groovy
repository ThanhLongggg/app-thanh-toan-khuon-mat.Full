#include <iostream>
#include <vector>
#include <algorithm>

// Tìm kiếm tuần tự
int sequentialSearch(const std::vector<int>& arr, int target) {
    for (int i = 0; i < arr.size(); ++i) {
        if (arr[i] == target) {
            return i; // Trả về vị trí của số cần tìm
        }
    }
    return -1; // Nếu không tìm thấy, trả về -1
}

// Tìm kiếm nhị phân (đầu tiên sắp xếp mảng)
int binarySearch(const std::vector<int>& arr, int target) {
    int left = 0;
    int right = arr.size() - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid; // Trả về vị trí của số cần tìm
        }
        else if (arr[mid] < target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }
    return -1; // Nếu không tìm thấy, trả về -1
}

int main() {
    std::vector<int> numbers = {3, 6, 5, 7, 11, 12, 9, 25};
    int target1 = 15;
    int target2 = 7;

    // Tìm kiếm tuần tự
    int result1 = sequentialSearch(numbers, target1);
    if (result1 != -1) {
        std::cout << "Tìm thấy " << target1 << " tại vị trí " << result1 << " khi sử dụng tìm kiếm tuần tự.\n";
    } else {
        std::cout << target1 << " không có trong dãy số khi sử dụng tìm kiếm tuần tự.\n";
    }

    int result2 = sequentialSearch(numbers, target2);
    if (result2 != -1) {
        std::cout << "Tìm thấy " << target2 << " tại vị trí " << result2 << " khi sử dụng tìm kiếm tuần tự.\n";
    } else {
        std::cout << target2 << " không có trong dãy số khi sử dụng tìm kiếm tuần tự.\n";
    }

    // Sắp xếp dãy số để sử dụng tìm kiếm nhị phân
    std::sort(numbers.begin(), numbers.end());

    // Tìm kiếm nhị phân
    int result3 = binarySearch(numbers, target1);
    if (result3 != -1) {
        std::cout << "Tìm thấy " << target1 << " tại vị trí " << result3 << " khi sử dụng tìm kiếm nhị phân.\n";
    } else {
        std::cout << target1 << " không có trong dãy số khi sử dụng tìm kiếm nhị phân.\n";
    }

    int result4 = binarySearch(numbers, target2);
    if (result4 != -1) {
        std::cout << "Tìm thấy " << target2 << " tại vị trí " << result4 << " khi sử dụng tìm kiếm nhị phân.\n";
    } else {
        std::cout << target2 << " không có trong dãy số khi sử dụng tìm kiếm nhị phân.\n";
    }

    return 0;
}