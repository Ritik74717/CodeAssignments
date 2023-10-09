// Q2 -Perform sorting of an array in descending order.

arr=[1,22,11,5,3,15,10]
isSwap=false
for(i=0;i<arr.length;i++){
      isSwap=false
    for(j=1;j<arr.length-i;j++){
        if(arr[j]>arr[j-1]){
            temp=arr[j]
            arr[j]=arr[j-1]
            arr[j-1]=temp
            isSwap=true
            
        }
    }
    if(isSwap==false){
        break;
    }
}

console.log(arr)
