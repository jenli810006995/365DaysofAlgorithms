/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
    let primes = [];
    let primeCount = 0;
    
    for (let i = 0; i < n; i ++){ // iterate n and add elements to the array
        primes.push(true);
    }
    
    for (let i = 2; i * i < primes.length; i ++){  // for inner loop, if the outer loop is 2 then the inner loop multiple by 2, if the outer loop is 3, the inner multiple by 3
        if (primes[i]){
            for (let j = i; j * i < primes.length; j ++){
                primes[i * j] = false; // false means it is not a prime
            }
        }
    }
    
    for (let i = 2; i < primes.length; i ++){
        if (primes[i]){
            primeCount ++;
        }
    }
    
    return primeCount;
};

// Link: https://leetcode.com/problems/count-primes/
// Reference: https://youtu.be/PypkiVlTRa4
