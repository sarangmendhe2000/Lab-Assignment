let arr =[12,1,5,8,2,3];

for(i=0;i<arr.length;i++)
{
    for(j=0;j<arr.length-1-i;j++)
    {
        if(arr[j]>arr[j+1])
        {
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}

 console.log("After soring the new array will be - ");
for(i=0;i<arr.length;i++)
{
   
    console.log(arr[i]);
}