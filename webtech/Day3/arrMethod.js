let arr = [1,2,4,5,8,9,7,5,3,2,1,4,5,6,7];

let choice = parseInt (prompt ("Enter number between 1 - 10 only \n " +
    "1 - find length\n"+
    "2 - sorting in ascending order\n"+
    "3 - sorting in descending order\n"+
    "4 - reverse array \n"+
    "5 - join elements\n" + 
    "6 - find index of an element\n" +
    "7 - Enter element at last position\n"+
    "8 - Enter element to enter at 1st position\n"+
    "9 - Delete element from last position\n"+
    "10  Delete element from first position\n"
    )
)
   
    
        switch(choice)
        {
            case 1 : console.log ("Length of the array is  - ",arr.length) 
            break;

            case 2 : console.log("After sorting array in ascending order " ,  arr.sort());
            break;

            case 3 : console.log("After sorting array in descending order " , arr.sort((a , b) => b-a));
            break;

            case 4: console.log("After reversing the array - " , arr.reverse());
            break;

            case 5 : console.log("After joining element - " , arr.join(", "))
            break;

            case 6 :
                let num =  prompt("Enter number to search ");
                console.log("Index ", arr.indexOf(num));
                break;
            
            case 7 : arr.push(77);
            console.log("After inserting element at last position - ", arr.join())
               

                break;

            case 8 : arr.unshift(200);
            console.log("After inserting element at first position - " , arr.join());
                break;

            case 9 :  arr.pop();
            console.log("After delete the element from last - ", arr.join()) ;   
                

                break;

            case 10 : arr.shift();
            console.log("After delete the element from first position - " , arr.join(" "));   
                 

                break;

            default : alert("Invalid choice")    

        }


    