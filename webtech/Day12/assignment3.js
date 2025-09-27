const fs = require('fs');

// --- Synchronous File Handling ---

//Blocking method 

console.log('--- Synchronous Method ---');

const syncFilePath = 'sync_data.txt';
const syncData = 'This is some data for synchronous file writing.';

try {
  // Write data to a file synchronously
  console.log('Writing data synchronously...');
  fs.writeFileSync(syncFilePath, syncData);
  console.log('Synchronous write complete.');

  // Read data from the file synchronously
  console.log('Reading data synchronously...');
  const readSyncData = fs.readFileSync(syncFilePath, 'utf8');
  console.log('Synchronously read data:', readSyncData);
} catch (err) {
  console.error('An error occurred during synchronous operation:', err);
}

// --- Asynchronous File Handling ---
// This method is non-blocking. It uses a callback function that executes when the
// operation is complete, allowing the program to continue other tasks.

console.log('\n--- Asynchronous Method ---');

const asyncFilePath = 'async_data.txt';
const asyncData = 'This is some data for asynchronous file writing.';

// Write data to a file asynchronously
console.log('Writing data asynchronously...');
fs.writeFile(asyncFilePath, asyncData, (err) => {
  if (err) {
    return console.error('An error occurred during asynchronous write:', err);
  }
  console.log('Asynchronous write complete.');

  // Read data from the file asynchronously within the callback
  console.log('Reading data asynchronously...');
  fs.readFile(asyncFilePath, 'utf8', (err, data) => {
    if (err) {
      return console.error('An error occurred during asynchronous read:', err);
    }
    console.log('Asynchronously read data:', data);
  });
});

console.log('This message is displayed before the async operations complete, demonstrating non-blocking behavior.');


