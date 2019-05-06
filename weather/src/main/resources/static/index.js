object.onclick = function () {
    const userAction = async () => {
        const response = await fetch('http://localhost:8080/weather');
        const myJson = await response.json(); //extract JSON from the http response
        // do something with myJson
        console.log('ola');
    }
}; 