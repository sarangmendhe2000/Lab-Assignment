let arr=[];
for(let i=0;i<12;i++)
{
    arr.push(parseInt(process.argv[i]));
}


// Addition of even number - 

console.log("Array is - ");

let sum=0;

for(let i=2;i<12;i++)
{
    if(arr[i]%2==0)
    {
        sum = sum+arr[i];
    }
    
    process.stdout.write(arr[i] + " ")
}

console.log("Addition of even enumber is - " , sum);

// / Addition of even index


let sumIndex =0;


for(let i=2;i<12;i++)
{
    if(i%2 == 0)
    {

        sumIndex = sumIndex + parseInt(arr[i]);
    }
}

console.log("Sum of even Index - ", sumIndex);

// Addition of prime number 

function isPrime(num)
{
    if(num <=1)
    {
        return false;
    }
    if(num == 2)
    {
        return true;

    }

    if (num % 2 === 0)
        {
            return false;
        } 
    for(let i=3;i<num/2 ; i+=2)
    {
        if(num%i ==0)
        {
            return false;
        }
    }

    return true;
}

let newarr= [];


for(let i= 2 ;i<12;i++)
{
    if(isPrime(arr[i]))
    {
        newarr.push(arr[i]);
    }


}


console.log("Prime Numbers are - " , newarr);

let primesum = 0 ;

for(let i=0;i<newarr.length;i++)
{
    primesum += newarr[i]; 
}


console.log("Addition of prime number is - " , primesum);