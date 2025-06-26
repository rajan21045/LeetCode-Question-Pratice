#include<stdio.h>
#include<stdlib.h>

void sortColors(int* nums, int numsSize) {
	
	int i,j,temp;
	
    for(i =0; i<numsSize-1;i++){
        for(j =0; j<numsSize-i-1;j++)
        {
            if(nums[j]>nums[j+1])
            {
                temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }  
    }
    
    printf("Printing Sorted Colors.................... \n ");
    for(i=0;i<numsSize;i++)
    {
    	
    		printf("%d", nums[i]);
	}
	printf("\n");
}

int main(){

    int nums[] = {2,0,2,1,1,0};
   int size = sizeof(nums) / sizeof(nums[0]);


    sortColors(nums, size);


    return 0;
}
