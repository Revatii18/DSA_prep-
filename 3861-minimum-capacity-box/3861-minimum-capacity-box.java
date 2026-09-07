class Solution
 {
    public int minimumIndex(int[] capacity, int itemSize) 
    {
        int i = 0;
int smallest = 0;
int index = -1;

while (i < capacity.length) {

    if (capacity[i] >= itemSize) {

        if (index == -1 || capacity[i] < smallest) {
            smallest = capacity[i];
            index = i;
        }
    }

    i++;
}

return index;
    }
 }

