function pyramid(n) {
    for(let i = 1; i <= n; i++){
        let str = ' '.repeat(n-i);
        let str2 = '*'. repeat(i*2 - 1)

        document.write(str + str2 + str + "<br>");
    }
}

pyramid(5);
