function fetchData() {
    return new Promise((resolve, reject) => {
        let xhr = new XMLHttpRequest();
        xhr.open("GET", "https://jsonplaceholder.typicode.com/posts", true);

        xhr.onload = function () {
            if (xhr.status === 200) {
                resolve(JSON.parse(xhr.responseText)); // parse and resolve data
            } else {
                reject("Error: failed to load data ❌");
            }
        };

        xhr.onerror = function () {
            reject("Network Error ❌");
        };

        xhr.send();
    });
}

$(document).ready(function () {
    let tableBody = $("#tableBody");

    fetchData()
        .then(data => {
            // clear table first
            tableBody.empty();

            // loop and add rows
            data.forEach(post => {
                let row = `
                    <tr>
                        <td>${post.id}</td>
                        <td>${post.title}</td>
                    </tr>
                `;
                tableBody.append(row);
            });
        })
        .catch(error => {
            alert(error);
        });
});
