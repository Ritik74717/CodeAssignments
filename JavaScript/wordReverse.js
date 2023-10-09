// Q1- Take a sentence as an input and reverse every word in that sentence. 
// Example - This is a sunny day > shiT si a ynnus yad

str="This is a sunny day"
str2=""
str3=""

for(i=str.length-1;i>=0;i--){
    str2=str2+str[i];
}

arr=str2.split(" ")

for(i=arr.length-1;i>=0;i--){
    str3=str3+arr[i]+" "
}

console.log(str3)
