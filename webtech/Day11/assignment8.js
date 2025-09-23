// Function to display current date in dd-mm-yyyy format
function displayDates(n) {
    for (let i = 0; i < n; i++) {
        const today = new Date();
        const dd = String(today.getDate()).padStart(2, '0');
        const mm = String(today.getMonth() + 1).padStart(2, '0'); // Months start from 0
        const yyyy = today.getFullYear();
        console.log(`${dd}-${mm}-${yyyy}`);
    }
}

// Call the function
displayDates(5); // displays current date 5 times
